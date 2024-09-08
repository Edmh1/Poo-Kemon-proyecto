# Proyecto Pookémon:

Un programa que simule una batalla Pookémon, donde el jugador principal pelea contra la maquina usando sus 5 Pookémones.

Funcionalidades (Para mi):

### 1. Generales:

- **A**. Poder crear tu propio entrenador (Solo ponerle el nombre, y el sexo).
- **B**. Tener como minimo 12 Pookémones (digo yo) ya precreados.
- **C**. Elegir tu pokemon inicial.
- **D**. Entregarle (de alguna manera) los 5 pokemones restantes para su equipo.
- **E**. Asignarle al enemigo los 6 pokemones restantes que queden.

### 2. Pokemones:
	
- **A** Deben tener variables a modo de estadisticas(yo propongo: Vida, Ataque Físico, Defensa Física, Ataque Especial, Defensa Especial, Velocidad).
- **B** Debe tener un tipo, si hacemos una especie de tabla de tipos.
- **C** Debe tener una lista de 4 movimientos.

### 3. Ataques/Movimientos:
	
- **A** Deben de ser de un tipo (físico o especial).
- **B** Si implementamos el sistema de pp, debe ser un valor que básicamente dice cuantas veces se puede usar un ataque, es una cosa que hacen para evitar el spameo, cuando se acaban los pp el ataque 	    no se puede usar más.
- **C** Tipo o elemento (agua, fuego, etc) esto es si hacemos lo de la tabla de tipos.
- **D** Podemos darle estadísticas a los movimientos, pero recomendaría solo tratar la estadística de potencia.

### 4. Combate:

- **A** Se debe poder atacar al enemigo o defenderte de el.
- **B**. Se debe poder cambiar de pokemon, es decir en mitad del combate se puede a cambiar a otro pokemon.
- **C** Se debe poder usar objetos (si es que lo hacemos, a mi parecer ya eso es complicar más la vaina, pero si algo na más hagamos el de la vida y ya).

## Explicaciones:

1. Digo 12 pokemones como mínimo porque un combate es 6v6.

2. Para calcular el daño de un ataque podemos hacer primero sacando su tipo, dependiendo del tipo del ataque, se usan sus respectivas variables, ya sean especiales o normales, ej:

	- X pokemon tiene buen ataque fisico, y el pokemon enemigo tiene mala defensa fisica, entonces un ataque físico le hace bastante daño por su mala defensa fisica.
	- X pokemon tiene mal ataque especial, y el pokemon enemigo tiene buena defensa especial, entonces un ataque especial le hace poco daño por su buena defensa especial

3. Se puede agregar un multiplicador de daño si se hace crítico que puede ser una probabilidad del 6%, no sé.

4. La tabla de tipos puede ser representada en una matriz, donde 0 significa que es neutro, 1 que es fuerte y -1 que es débil, por ejemplo:

------------------------------------------
|‎  | FUEGO | AGUA |
|----------|-------|------|
|**FUEGO** |0      | -1   |
|**AGUA**  |1      | 0    |


------------------------------------------
	
En ese ejemplo fuego es neutro contra el fuego, pero es débil contra el agua, y el agua es fuerte contra el fuego y es neutra contra ella misma. Entonces si queremos hacer que dependiendo si es fuerte, débil o neutro, haga más o menos daño, podemos sacar el tipo de los pokemones que luchan, buscar en la matriz su afinidad, y agregar un multiplicador al daño, dependiendo de su afinidad.

5. Para simular al enemigo podemos hacer que primero elija entre 0,1 y 2, siendo atacar, defenderse, o cambiar de pokemon respectivamente. En caso de que escoja 0 (atacar), lo ponemos otra vez a elegir de manera aleatoria entre 0 y 3 (los 4 ataques) pa que escoja uno. En caso de escoja 1(defenderse) pues simplemente se defiende del ataque y recibe menos daño. En caso de que escoja 2 (cambiar de pokemon), pues la ponemos a escoger entre los pokemones restantes, para que no escoja el que ya estaba peleando.

6. Cabe recordar que todo el tema del daño lo podemos hacer con formulas, que se las podemos pedir a chatgpt y listo.

7. El combate se podría hacer de la siguiente manera: El jugador elige que hace y su elección se guarda en variables, puede ser: ataca (bool), defiende (bool), cambia (bool), ataqueUsado (ataque), pokemonActual (pokemon), pokemonCambio (pokemon). Y lo mismo para la maquina. La idea es que primero se decidad que hacer y luego se ejecute. Si añadimos que ataque aquel pokemon que sea más rápido (en caso de que no haya un cambio, si hay un cambio este se hará primero), podemos crear varios patrones en los que se desarollará el comabte dependiendo si el pokemon del jugador o del enemigo es más rapido por ejemplo:

	-- si el pokemon del jugador es más rapido:
		- si el jugador decide atacar y el enemigo ataca:
			
			1. Ataca el pokemon del jugador.
			2. Recibe daño el enemigo.
			3. Ataca el enemigo.
			4. Recibe daño el pokemon del jugador.
			5. Fin del turno.
	si el jugador decide atacar y el enemigo se defiende:
	
			1. Ataca el pokemon del jugador.
			2. Recibe daño el enemigo.
			3. Fin del turno
	
	si el jugador decide defenderse y el enemigo ataca:
	
			1. Ataca el enemigo.
			2. Recibe daño el pokemon del jugador.
			3. Fin del turno.
	si el jugador decide defenderse y el enemigo se defiende:
	
			1. Recibe daño el pokemon del jugador (0 de daño)
			2. Recibe daño el enemigo (0 de daño).
	si el pokemon del enemigo es más rapido:
		si el jugador decide atacar y el enemigo ataca:
		
			1. Ataca el enemigo.
			2. Recibe daño el pokemon del jugador.
			3. Ataca el pokemon del jugador.
			4. Recibe daño el enemigo.
			5. Fin del turno.
	si el jugador decide atacar y el enemigo se defiende:
	
			1. Ataca el pokemon del jugador.
			2. Recibe daño el enemigo.
			3. Fin del turno
	si el jugador decide defenderse y el enemigo ataca:
	
			1. Ataca el enemigo.
			2. Recibe daño el pokemon del jugador.
			3. Fin del turno.
		
	si el jugador decide defenderse y el enemigo se defiende:
	
			1. Recibe daño el pokemon del jugador (0 de daño xd).
			2. Recibe daño el enemigo (0 de daño).

Como pueden darse cuenta lo único que cambia es el primer condicional así que hay tal vez se puede simplificar algo, pero es más o menos lo que propongo.
En el caso de que se haga un cambio sería:

- si el jugador cambia de pokemon:
- 
		1. Se cambia de pokemon
		2. Ataca el enemigo.
		3. Recibe daño el pokemon al que cambió el jugador.
		4. Fin del turno.
- si el enemigo cambia de pokemon:
- 
		1. Se cambia el pokemon del enemigo.
		2. Ataca el pokemon del jugador.
		3. Recibe daño el pokemon al que cambió el enemigo.
		4. Fin del turno.

Como dije antes, el cambio tiene mayor prioridad, es decir independientemente de la velocidad de los pokemones, si se hace un cambio, obligatoriamente se debe seguir el patrón de si ocurre un cambio.