# JUGADOR
------------------------------------------------------
### 1.Título
Como jugador, quiero crear un entrenador con un nombre y un género para personalizar mi identidad en el torneo.

### Descripción:
El sistema debe permitir al jugador crear un entrenador, donde pueda seleccionar un nombre y 
un género para su personaje. Esta funcionalidad es necesaria para que el jugador pueda personalizar 
su identidad dentro del torneo y diferenciar su experiencia de juego.

### Criterios de aceptación
- El jugador puede elegir un nombre y un género al crear un entrenador.
- El nombre del entrenador no debe contener espacios.
- La información del entrenador se debe mostrar en la pantalla principal.
- El jugador debe confirmar la creación del entrenador antes de finalizar el proceso.

---
### 2. Título
Como jugador, quiero que cada Pookémon tenga 4 movimientos específicos relacionados con su tipo para poder planificar mis estrategias.

### Descripción:
Cada Pookémon debe contar con 4 movimientos donde algunos estaran directamente relacionados con su tipo elemental, lo que permitirá a los jugadores desarrollar estrategias específicas basadas en las fortalezas y debilidades de su equipo.

### Criterios de aceptación
- Cada Pookémon tiene exactamente 4 movimientos asignados.
- Algunos movimientos están relacionados con el tipo elemental del Pookémon (por ejemplo, movimientos de agua para un Pookémon tipo agua).
- Los movimientos son asignados automáticamente al momento de recibir el Pookémon en el juego.

---
### 3. Título
Como jugador, quiero poder consultar la descripción de los movimientos de mi Pookémon durante la batalla para tomar decisiones informadas.

### Descripción:
Durante la batalla, los jugadores deben tener la opción de consultar una descripción detallada de cada uno de los movimientos de su Pookémon, incluyendo su tipo, efectos, y poder, para que puedan tomar decisiones estratégicas basadas en esa información.

### Criterios de aceptación
- El jugador puede consultar una descripción de cada movimiento disponible durante la batalla.
- La descripción incluye el tipo del movimiento, el daño (si aplica), los efectos especiales (si tiene), y cualquier otra información relevante.
- El jugador puede acceder a esta información de forma intuitiva y rápida para no afectar el flujo de la batalla.

---
### 4. Título
Como jugador, quiero poder ver de forma compacta la información de los movimientos de mis Pookémon usando símbolos y palabras clave para entender rápidamente sus efectos.

### Descripción:
El sistema debe presentar la información de los movimientos de los Pookémon de manera compacta y visualmente accesible, utilizando símbolos y palabras clave para representar detalles como tipo, potencia, precisión, puntos de poder (PP) y efectos especiales. Esto permitirá a los jugadores comprender rápidamente la funcionalidad de cada movimiento sin necesidad de leer descripciones largas, facilitando la planificación estratégica.

### Criterios de aceptación
- La información de cada movimiento se muestra de manera compacta con símbolos para tipo, potencia, precisión, PP, y efectos especiales.
- Palabras clave como "Estado" o "Curación" se utilizan para describir los efectos principales del movimiento.
- Los símbolos y palabras clave deben ser intuitivos y fáciles de comprender sin necesidad de explicaciones adicionales.
---

### 5. Título
Como jugador, quiero poder elegir entre atacar, defenderme o hacer uso de posiciones durante el combate para ajustar mi estrategia según la situación.

### Descripción:
El sistema debe permitir al jugador optar por defenderse durante el combate, reduciendo el daño recibido en ese turno. Además, el jugador podrá usar ciertas posiciones para restablecer HP o PP, ofreciendo opciones estratégicas adicionales durante la batalla.

### Criterios de aceptación
- El jugador puede optar por defenderse, reduciendo el daño recibido en el turno.
- La defensa afecta la cantidad de daño que recibe el Pookémon.
- El jugador puede hacer uso de una posición para restablecer HP al Pookémon y otra para restablecer PP a un movimiento del      Pookémon selecionado.
---

### 6. Título
Como jugador, quiero poder cambiar mi Pookémon durante el combate para aprovechar mejor las ventajas de tipo y estadísticas.

### Descripción:
El sistema debe permitir a los jugadores cambiar su Pookémon durante el combate. Cambiar de Pookémon consumirá el turno del jugador, y el Pookémon entrante recibirá daño si es atacado en el mismo turno en que es cambiado.

### Criterios de aceptación
- El jugador puede cambiar su Pookémon durante el combate.
- Cambiar un Pookémon consume el turno del jugador.
- El Pookémon entrante recibe daño si es atacado en el mismo turno en que es cambiado.

---

# ORGANIZADOR
---
### 7. Título
Como organizador, quiero que cada jugador reciba 5 Pookémones al azar al comienzo de cada batalla para 
garantizar la equidad durante el torneo.

### Descripción:
El sistema debe generar y asignar 5 Pookémones aleatorios a cada jugador al inicio de cada batalla. 
Los Pookémones deben tener estadísticas, tipos y movimientos predefinidos y ser seleccionados de una pool balanceada 
para asegurar la equidad en las batallas, evitando que algún jugador tenga una ventaja injusta.

### Criterios de aceptación
- Los jugadores reciben 5 Pookémones aleatorios al inicio de una batalla.
- Los Pookémones asignados tienen estadísticas, tipos y movimientos predefinidos que pueden ser comunes o especiales.
- Los Pookémones se asignan desde una pool balanceada para evitar ventajas injustas entre los jugadores.
---------------------------------------------------------------------------------------------------------- 

### 8. Título
Como organizador, quiero que al ganador del torneo se le asigne un código que le permita reclamar una recompensa en un punto físico.

### Descripción:
El sistema debe asignar un código al jugador ganador de cada batalla, el cual podrá ser utilizado 
para reclamar una recompensa en un punto físico designado. El código debe tener una fecha de expiración 
visible para el ganador, asegurando que se utilice dentro del periodo establecido.

### Criterios de aceptación
- El jugador que resulte victorioso en el torneo obtendrá un código.
- El código de premio tiene una fecha de expiración que se muestra al ganador.

---

### 9. Título
Como organizador, quiero que cada Pookémon tenga estadísticas específicas para que las batallas se basen en estrategia.

### Descripción:
El sistema debe asignar a cada Pookémon estadísticas detalladas de Vida, Ataque Físico, Defensa Física, 
Ataque Especial, Defensa Especial y Velocidad. Estas estadísticas influirán en el desarrollo y el resultado 
de las batallas, proporcionando una base para que los jugadores desarrollen estrategias.

### Criterios de aceptación
- Cada Pookémon tiene estadísticas de Vida, Ataque Físico, Defensa Física, Ataque Especial, Defensa Especial y Velocidad.
- Las estadísticas afectan el resultado de las batallas.

---

### 10. Título
Como organizador, quiero que cada Pookémon tenga un tipo que influya en la efectividad de sus ataques durante las batallas.

### Descripción:
El sistema debe asignar un tipo a cada Pookémon (por ejemplo, fuego, agua), y estos tipos deben 
influir en el daño infligido y recibido durante las batallas. La efectividad de los ataques se calculará 
según una tabla de tipos, y el sistema debe mostrar esta información a los jugadores para facilitar la estrategia de combate.

### Criterios de aceptación
- Cada Pookémon tiene un tipo asignado (e.g., fuego, agua).
- Los tipos afectan el daño infligido y recibido en las batallas según una tabla de tipos.
- El sistema debe calcular y mostrar la efectividad de los ataques basados en los tipos involucrados.

---------------------------------------------------------------------------------------------------------- 


### 11. Título
Como organizador, quiero que cada movimiento tenga un valor de PP para limitar la cantidad de veces que se puede usar en combate.

### Descripción:
El sistema debe asignar un valor de Puntos de Poder (PP) a cada movimiento, limitando la cantidad de veces que puede ser utilizado en combate. Si un movimiento se queda sin PP, ya no podrá ser usado, y el jugador será notificado cuando esto ocurra. Además, cada Pookémon debe contar con un ataque sin costo de PP para utilizar cuando no haya más opciones.

### Criterios de aceptación
- Cada movimiento tiene un valor de PP asignado.
- Cuando un movimiento se queda sin PP, ya no puede ser usado.
- El jugador recibe una notificación cuando un movimiento se queda sin PP.
- Cada Pookémon debe tener un ataque que no cueste PP, disponible cuando el entrenador no tenga otra opción.

---

### 12. Título
Como organizador, quiero que las batallas se realicen por turnos para asegurar un flujo ordenado y estratégico durante el torneo.

### Descripción:
El sistema debe implementar un sistema de combate por turnos, donde los jugadores y sus oponentes alternan movimientos. La velocidad del Pookémon debe determinar quién ataca primero, y el sistema debe mostrar claramente el orden de los turnos en cada ronda de combate.

### Criterios de aceptación
- Las batallas se realizan por turnos, con el jugador y el enemigo alternando movimientos.
- La velocidad del Pookémon determina quién ataca primero.
- El sistema debe mostrar claramente el orden de los turnos en cada ronda de combate.




---

### 13. Título
Como organizador, quiero implementar un sistema de golpes críticos que añada un elemento de riesgo y recompensa a las batallas.

### Descripción:
El sistema debe incluir una probabilidad de 6% de realizar un golpe crítico, que infligirá daño adicional basado en un multiplicador. Se debe mostrar una animación especial cuando se realiza un golpe crítico para destacar este evento.

### Criterios de aceptación
- Existe una probabilidad del 6% de que un ataque sea crítico.
- Un golpe crítico inflige daño adicional basado en un multiplicador.
- El sistema muestra una animación especial cuando se realiza un golpe crítico.

---

### 14. Título
Como organizador, quiero que el sistema genere un reporte detallado de cada batalla para revisar el desempeño de los jugadores y asegurar la transparencia.

### Descripción:
El sistema debe generar un reporte detallado al finalizar cada batalla, incluyendo los movimientos, daños y resultados. Este reporte estará disponible para revisión por el árbitro y los jugadores podrán solicitar una copia de su propia batalla.

### Criterios de aceptación
- Al finalizar la batalla, se genera un reporte con los movimientos, daños y resultados.
- El reporte está disponible para revisión por el árbitro.
- Los jugadores pueden solicitar una copia del reporte de su propia batalla.

---

### 15. Título
Como organizador, quiero definir las recompensas para los ganadores del torneo para motivar la participación y el rendimiento.

### Descripción:
El sistema debe permitir definir y asociar premios con las posiciones finales del torneo. También debe enviar notificaciones a los ganadores sobre cómo reclamar sus premios.

### Criterios de aceptación
- El sistema permite definir y asociar premios con las posiciones finales del torneo.
- El sistema envía notificaciones a los ganadores sobre cómo reclamar sus premios.

---

### 16. Título
Como organizador, quiero un sistema que gestione múltiples rondas de combate para determinar el ganador del torneo.

### Descripción:
El sistema debe gestionar el progreso del torneo en un formato eliminatorio, permitiendo a los jugadores avanzar a la siguiente ronda tras ganar un combate. Debe incluir una visualización clara de las posiciones en el torneo.

### Criterios de aceptación
- El torneo sigue un formato eliminatorio.
- Los jugadores avanzan a la siguiente ronda tras ganar un combate.
- El sistema debe permitir la visualización de posiciones en el torneo.

---

### 17. Título
Como organizador, quiero un sistema de registro que permita a los jugadores inscribirse en el torneo para garantizar la participación organizada.

### Descripción:
El sistema debe permitir a los jugadores registrarse al inicio del torneo, incluyendo la definición de una contraseña que usarán durante todo el evento. El sistema debe generar una lista de participantes accesible para los organizadores y notificar a los jugadores una vez que su registro haya sido confirmado.

### Criterios de aceptación
- Los jugadores pueden registrarse al inicio del torneo.
- Los jugadores deben definir la contraseña que usarán durante todo el torneo.
- Se genera una lista de participantes que es accesible para los organizadores.
- El sistema notifica a los jugadores una vez que su registro ha sido confirmado.

---

### 18. Título
Como organizador, quiero que los movimientos sean divididos en categorías (físico, especial y estado) para agregar diversidad en los movimientos.

### Descripción:
El sistema debe permitir que cada movimiento tenga una categoría específica. Dependiendo de la categoría del movimiento, este definirá si el Pokémon ataca con daño físico o daño especial y si ataca a la defensa física o defensa especial del enemigo, o si el movimiento no ataca y solo tiene un efecto de apoyo en el combate.

### Criterios de aceptación
- Cada movimiento debe tener una categoría.
- El jugador debe poder ver el tipo de categoría en la información de los movimientos.
- Las categorías deben servir para el cálculo del daño de los movimientos.

---

### 19. Título
Como organizador, quiero que durante los combates los Pokémon puedan sufrir problemas de estado para que su efecto influya durante la batalla.

### Descripción:
El sistema debe permitir que los Pokémon puedan sufrir problemas de estado durante los combates, como envenenamiento, quemaduras, parálisis, sueño, entre otros. Sin embargo, un Pokémon solo puede tener un problema de estado a la vez y siempre entra al combate sin ningún estado afectándolo. El estado actual de un Pokémon debe ser visible para el jugador durante el combate para ayudar en la toma de decisiones estratégicas.

### Criterios de aceptación
- Durante un combate, un Pokémon puede llegar a sufrir varios estados (envenenamiento, quemado, parálisis, dormido, etc.).
- Un Pokémon solo puede sufrir un problema de estado a la vez.
- Un Pokémon entra al combate sin ningún estado.
- El jugador debe poder ver el estado de su Pokémon durante el combate.

---
### 20. Título
Como tester, quiero una o varias CPU que pueda simular el comportamiento de un jugador para poder realizar simulaciones, pruebas y balanceos del juego.

### Descripción:
El sistema debe incluir CPU que puedan realizar las mismas acciones que un jugador humano, respetando las normas del juego. Las acciones de la CPU no deben ser visibles para el jugador, asegurando una simulación realista y balanceada.

### Criterios de aceptación
- La CPU debe ser capaz de realizar las mismas acciones que el jugador.
- La CPU debe respetar las normas del juego.
- El jugador no debe ver las acciones de la CPU

---
- Las estadísticas de cada Pookémon se muestran al jugador antes de iniciar la batalla.
