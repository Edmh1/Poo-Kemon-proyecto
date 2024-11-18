#
# JUGADOR
### 1.Título
Como jugador, quiero crear un entrenador con un nombre y un género para personalizar mi identidad en la batalla.

### Descripción:
El sistema debe permitir al jugador crear un entrenador, donde pueda seleccionar un nombre y 
un género para su personaje. Esta funcionalidad es necesaria para que el jugador pueda personalizar 
su identidad dentro de la batalla y diferenciar su experiencia de juego.

### Criterios de aceptación
- El jugador puede elegir un nombre y un género al crear un entrenador.
- El nombre del entrenador no debe contener espacios.
- La información del entrenador se debe mostrar en la pantalla principal.
- El jugador debe confirmar la creación del entrenador antes de finalizar el proceso.

---
### 2. Título
Como jugador, quiero que cada Pookémon tenga 4 movimientos donde minimo 1 este relacionado con su tipo elemental para poder planificar mis estrategias.

### Descripción:
Cada Pookémon debe contar con 4 movimientos donde por lo menos 1 estara directamente relacionado con su tipo elemental, lo que permitirá a los jugadores desarrollar estrategias específicas basadas en las fortalezas y debilidades de su equipo.

### Criterios de aceptación
- Cada Pookémon tiene exactamente 4 movimientos asignados.
- Algunos movimientos están relacionados con el tipo elemental del Pookémon (por ejemplo, movimientos de agua para un Pookémon tipo agua).
- Los movimientos son asignados automáticamente al momento de recibir el Pookémon en el juego.

---

### 3. Título
Como jugador, quiero poder consultar la cantidad de PP de los movimientos de mi Pookémon durante la batalla para tomar decisiones informadas.

### Descripción:
Durante la batalla, los jugadores deben tener la opción de consultar una la cantidad de PP de cada uno de los movimientos de su Pookémon para que puedan tomar decisiones estratégicas basadas en esa información.

### Criterios de aceptación
- El jugador puede consultar la cantidad de PP cada movimiento disponible durante la batalla.
- El jugador puede acceder a esta información de forma intuitiva y rápida para no afectar el flujo de la batalla.

---
### 4. Título
Como jugador, quiero poder elegir entre atacar, defenderme o hacer uso de pociones durante el combate para ajustar mi estrategia según la situación.

### Descripción:
El sistema debe permitir al jugador optar por defenderse durante el combate, reduciendo el daño recibido en ese turno. Además, el jugador podrá usar ciertas pociones para restablecer HP o PP, ofreciendo opciones estratégicas adicionales durante la batalla.

### Criterios de aceptación
- El jugador puede optar por defenderse, reduciendo el daño recibido en el turno.
- La defensa afecta la cantidad de daño que recibe el Pookémon.
- El jugador puede hacer uso de una poción para restablecer HP al Pookémon y otra para restablecer PP a un movimiento del Pookémon selecionado.

---
### 5. Título
Como jugador, quiero poder cambiar mi Pookémon durante el combate para aprovechar mejor las ventajas de tipo y estadísticas.

### Descripción:
El sistema debe permitir a los jugadores cambiar su Pookémon durante el combate. Cambiar de Pookémon consumirá el turno del jugador, y el Pookémon entrante recibirá daño si es atacado en el mismo turno en que es cambiado.

### Criterios de aceptación
- El jugador puede cambiar su Pookémon durante el combate.
- Cambiar un Pookémon consume el turno del jugador.
- El Pookémon entrante recibe daño si es atacado en el mismo turno en que es cambiado.
###
#
# ORGANIZADOR

### 6. Título
Como organizador quiero agregar música en el juego para mejorar la experiencia de los usuarios durante el uso del programa.

### Descripción:
El sistema debe incluir música de fondo para enriquecer la experiencia de los usuarios mientras interactúan con el programa.
La música debe ser constante durante el uso del programa y no debe afectar el rendimiento ni la usabilidad de las funciones principales.

### Criterios de aceptación
- La música no debe interferir con los efectos de sonido del programa ni afectar la claridad de mensajes importantes.

---

### 7. Título
Como organizador, quiero poder crear una arena de combate con el fin de poder llevar a cabo los enfrentamientos entre los jugadores.

### Descripción:
El sistema debe permitir crear la arena de combate y asignarle sus dos jugadores

### Criterios de aceptación
- El sistema permite crear la arena de combate
- El sistema debe permitir asignar los participantes del combate
- El sistema determina el ganador.

---
### 8. Título
Como organizador quiero evitar el abuso de un movimiento durante una batalla para evitar el desbalance entre los movimientos.

### Descripción
Durante las batallas, algunos movimientos pueden ser usados repetidamente de manera que afecten negativamente en la experiencia y el balance del juego, creando una ventaja injusta para ciertos jugadores. Este sistema debe limitar el abuso de movimientos repetitivos, asegurando que las estrategias de batalla sean diversas y equitativas para todos los participantes.

### Criterios de aceptación

- Durante una batalla el número de PP's para un movimiento va a ser global para los dos pookemones.

---
### 9. Título
Como organizador, quiero un sistema de registro que permita a los jugadores inscribirse al combate para garantizar la participación organizada.

### Descripción:
El sistema debe permitir a los jugadores registrarse al inicio del combate, incluyendo la definición de el nombre que usarán durante el enfrentamiento.

### Criterios de aceptación
- Los jugadores pueden registrarse al inicio del combate.

---
### 10. Título
Como organizador, quiero un sistema que permita listar todos los movimientos y Pookemones disponibles para los combates.

### Descripción:
El sistema debe proporcionar al organizador la opción de ver la lista completa de todos los movimientos y Pookemones disponibles para los combates. Esto facilitará la gestión de los enfrentamientos, ya que permitirá al organizador modificar los Pookemones disponibles para cada combate y agregar dinamismo a la experiencia.

### Criterios de aceptación
- Los listados deben contener por el nombre y el elemento.
- La lista de movimientos debe mostrar el tipo de movimiento.
- La lista de movimientos y Pookemones es accesible y visible en una interfaz clara y fácil de navegar.

---
### 11. Título
Como organizador, quiero que el sistema genere un reporte detallado durante cada batalla para revisar el desempeño de los jugadores y asegurar la transparencia.

### Descripción:
El sistema debe generar un reporte detallado durante cada batalla, incluyendo los movimientos, daños y resultados. Este reporte podrá ser visible a medida que transcurren los enfrentamientos.

### Criterios de aceptación
- El reporte es visible para los jugadores durante el enfrentamiento.
- Indicará el numero de turno y la acción que hayan tomado ambos jugadores.


---
### 12. Título
Como organizador, quiero que cada jugador reciba 3 Pookémones al azar al comienzo de cada batalla 

### Descripción:
El sistema debe asignar 3 Pookémones aleatorios a cada jugador al inicio de cada batalla. 
Los Pookémones deben tener estadísticas, tipos y movimientos predefinidos para asegurar la equidad en las batallas, evitando que algún jugador tenga una ventaja injusta.

### Criterios de aceptación
- Los jugadores reciben 3 Pookémones aleatorios al inicio de una batalla.
- Los Pookémones asignados tienen estadísticas, tipos y movimientos predefinidos que pueden ser fisicos o especiales.

---
### 13. Título
Como organizador, quiero que cada Pookémon tenga estadísticas específicas para que las batallas se basen en estrategia.

### Descripción:
El sistema debe asignar a cada Pookémon estadísticas detalladas de Vida, Ataque Físico, Defensa Física, 
Ataque Especial, Defensa Especial y Velocidad. Estas estadísticas influirán en el desarrollo y el resultado 
de las batallas, proporcionando una base para que los jugadores desarrollen estrategias.

### Criterios de aceptación
- Cada Pookémon tiene estadísticas de Vida, Ataque Físico, Defensa Física, Ataque Especial, Defensa Especial y Velocidad.
- Las estadísticas afectan el resultado de las batallas.

---
### 14. Título
Como organizador, quiero que cada Pookémon tenga un tipo que influya en la efectividad de sus ataques durante las batallas.

### Descripción:
El sistema debe asignar un tipo a cada Pookémon (por ejemplo, fuego, agua, etc), y estos tipos deben 
influir en el daño infligido y recibido durante las batallas. La efectividad de los ataques se calculará 
según una tabla de tipos.

### Criterios de aceptación
- Cada Pookémon tiene un tipo asignado (e.g., fuego, agua).
- Los tipos afectan el daño infligido y recibido en las batallas según una tabla de tipos.
- El sistema debe calcular y mostrar la efectividad de los ataques basados en los tipos involucrados.

---
### 15. Título
Como organizador, quiero que cada movimiento tenga un valor de PP para limitar la cantidad de veces que se puede usar en combate.

### Descripción:
El sistema debe asignar un valor de Puntos de Poder (PP) a cada movimiento, limitando la cantidad de veces que puede ser utilizado en combate. Si un movimiento se queda sin PP, podra ser usado pero acosta de un 25% de la vida del pookemon, y el jugador será notificado cuando esto ocurra.

### Criterios de aceptación
- Cada movimiento tiene un valor de PP asignado.
- Cuando un movimiento se queda sin PP, podra ser usado pero acosta de un 25% de la vida del pookemon.
- El jugador recibe una notificación cuando usa un movimiento que ya no tiene PP.

---
### 16. Título
Como organizador, quiero que las batallas se realicen por turnos para asegurar un flujo ordenado y estratégico durante el torneo.

### Descripción:
El sistema debe implementar un sistema de combate por turnos, donde los jugadores y sus oponentes alternan movimientos. La velocidad del Pookémon debe determinar quién ataca primero, y el sistema debe mostrar claramente el orden de los turnos en cada ronda de combate.

### Criterios de aceptación
- Las batallas se realizan por turnos, con el jugador y el enemigo alternando movimientos.
- La velocidad del Pookémon determina quién ataca primero.
- El sistema debe mostrar claramente el orden de los turnos en cada ronda de combate.

---
### 17. Título
Como organizador, quiero implementar un sistema de golpes críticos que añada un elemento de riesgo a las batallas.

### Descripción:
El sistema debe incluir una probabilidad de 5% de realizar un golpe crítico, que infligirá daño adicional basado en un multiplicador. Se debe mostrar una animación especial cuando se realiza un golpe crítico para destacar este evento.

### Criterios de aceptación
- Existe una probabilidad del 5% de que un ataque sea crítico.
- Un golpe crítico inflige daño adicional basado en un multiplicador.
- El sistema muestra una animación especial cuando se realiza un golpe crítico.

---
### 18. Título
Como organizador, quiero que los movimientos sean divididos en categorías (físico y especial) para agregar diversidad en los movimientos.

### Descripción:
El sistema debe permitir que cada movimiento tenga una categoría específica. Dependiendo de la categoría del movimiento, este definirá si el Pookémon ataca con daño físico o daño especial y si ataca a la defensa física o defensa especial del enemigo, o si el movimiento no ataca.

### Criterios de aceptación
- Cada movimiento debe tener una categoría.
- El jugador debe poder ver el tipo de categoría en la información de los movimientos.
- Las categorías deben servir para el cálculo del daño de los movimientos.

---
### 19. Título
Como organizador, quiero que durante los combates los Pookémon puedan sufrir problemas de estado para que su efecto influya durante la batalla.

### Descripción:
El sistema debe permitir que los Pookémon puedan sufrir problemas de estado durante los combates, como envenenamiento, quemaduras, parálisis, sueño, entre otros. Sin embargo, un Pookémon solo puede tener un problema de estado a la vez y siempre entra al combate sin ningún estado afectándolo. El estado actual de un Pookémon debe ser visible para el jugador durante el combate para ayudar en la toma de decisiones estratégicas.

### Criterios de aceptación
- Durante un combate, un Pookémon puede llegar a sufrir varios estados (envenenamiento, quemado, parálisis, dormido, etc.).
- Un Pookémon solo puede sufrir un problema de estado a la vez.
- Un Pookémon entra al combate sin ningún estado.
- El jugador debe poder ver el estado de su Pookémon durante el combate.

---
### 20. Título
Como organizador, quiero ver los creditos del juego para saber quienes fueron sus creadores y demás información sobre el mismo. 

### Descripción:
El usuario tendra una opcion de ver los creditos del juego más la informacion de quienes estuvieron encargados de la creacion del mismo, la fecha de creacion y contenido adicional sobre la creacion del juego.

### Criterios de aceptación
- Los creditos deben mostrar de manera ordenada los nombres de los creadores del videojuego.
- Los creditos deben mostrar la fecha de creacion del videojuego.
- Se debe mostrar la informacion de manera secuencial.

---
