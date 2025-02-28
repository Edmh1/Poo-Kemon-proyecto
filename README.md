
# 🎮 **Pookémon Battle**  

## 📖 **Descripción del Proyecto**  
**Pookémon Battle** es un sistema digital desarrollado en **Java** utilizando **Programación Orientada a Objetos (POO), una Interfaz Gráfica de Usuario (GUI) y persistencia de datos mediante serialización**. Su objetivo es trasladar las batallas competitivas de cartas de la **Pookémon Masters League (PML)** a un entorno digital seguro y justo.  

El sistema garantiza:  
- **Aleatorización real** de los mazos para evitar manipulaciones.  
- **Aplicación automática** de reglas y mecánicas de batalla.  
- **Interfaz gráfica intuitiva** para una experiencia inmersiva.  
- **Persistencia de datos mediante serialización** para registrar partidas y estadísticas.  
- **Seguridad** en la asignación de cartas y seguimiento de partidas.  

---

## 🎯 **Objetivos del Proyecto**  
- Digitalizar las batallas de cartas para evitar fraudes.  
- Garantizar la imparcialidad mediante una distribución aleatoria de mazos.  
- Aplicar las reglas automáticamente, evitando errores humanos.  
- Diseñar una interfaz gráfica que mejore la experiencia del usuario.  
- Implementar un sistema de **persistencia mediante serialización** para almacenar y recuperar información.  

---

## 🛠 **Tecnologías Utilizadas**  
- **Lenguaje:** Java ☕  
- **Paradigma:** Programación Orientada a Objetos (POO) 🏗️  
- **GUI:** Java Swing 🖥️  
- **Persistencia de Datos:** Serialización de objetos en Java 🔄  
- **Diagramas UML:** Casos de Uso y Clases 📌  

---

## 🏗 **Principios de Programación Orientada a Objetos Aplicados**  

###  **Modelado de Entidades del Juego (Clases Principales)**  
- **Entrenador:** Representa a los jugadores en la batalla.  
- **Pookémon:** Cada criatura con atributos de estadísticas, tipo y movimientos.  
- **Movimiento:** Representa los ataques que pueden realizar los Pookémon.  
- **Batalla:** Controla la lógica de combate entre dos jugadores.  

###  **Encapsulación**  
Se restringe el acceso directo a los atributos de las clases, permitiendo modificaciones solo a través de métodos controlados (por ejemplo, solo un método puede modificar la vida de un Pookémon).  

### **Herencia y Polimorfismo**  
Se implementan clases base como **Movimiento** y subclases especializadas para diferentes tipos de ataques (físicos, especiales).  

### **Modularidad y Mantenibilidad**  
El código se divide en módulos claros: lógica del juego, interfaz gráfica y gestión de datos.  

---

## 💾 **Persistencia de Datos mediante Serialización**  
Para garantizar la **persistencia de la información**, el sistema **serializa objetos** y los almacena en archivos binarios. Esto permite guardar y recuperar datos sin necesidad de un sistema de bases de datos externo.  

---

## 📊 **Diagramas Utilizados**  

### ✅ **Diagrama de Clases**  
Se diseñó un **diagrama de clases UML** para estructurar la relación entre los objetos principales, asegurando una arquitectura limpia y escalable.  

### ✅ **Diagrama de Casos de Uso**  
Se crearon **diagramas de casos de uso** para visualizar la interacción de los jugadores con el sistema y definir los flujos principales de la aplicación.  

---

## 🖥️ **Interfaz Gráfica (GUI)**  
- Se usó **Java Swing** para desarrollar una interfaz visual interactiva.  
- Permite a los jugadores seleccionar sus acciones en la batalla con botones y paneles intuitivos.  
- Muestra información en tiempo real sobre los Pookémon y la batalla.  

---

## 📌 **Conclusión & Aprendizajes**  
Este proyecto permitió aplicar los principios de **POO en Java**, mejorando la organización y mantenibilidad del código. Además, se exploró el desarrollo de interfaces gráficas con **Swing**, brindando una experiencia más accesible y visualmente atractiva para los jugadores.  

Asimismo, la implementación de **persistencia mediante serialización** garantiza la continuidad del juego, almacenando información clave sin la necesidad de una base de datos externa.  

---

📌 **Autor:** [(Eddie Manotas) https://github.com/Edmh1]   

