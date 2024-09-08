# Justificación de la Aplicación de la Programación Orientada a Objetos en el Proyecto Pookémon Battle

 En el contexto del proyecto Pookémon Battle, la aplicación de la OO ofrece múltiples ventajas que facilitan el desarrollo, 
 mantenimiento y escalabilidad del sistema. A continuación, detallaremos como y por que nos ayudará:
## 1. Modelado Natural del Dominio del Problema

  ### Entidades del Juego como Clases:
- Entrenador: Representa al usuario que participa en las batallas. Sus atributos pueden incluir nombre, 
        género y equipo de Pookémon.
- Pookémon: Cada Pookémon tiene atributos como estadísticas (vida, ataque físico, defensa física, etc.), 
        tipo y movimientos. Además, métodos para atacar, defenderse o cambiar de estado.
-  Movimiento: Define los diferentes ataques que un Pookémon puede realizar, incluyendo tipo, potencia y 
        puntos de poder (PP).
- Batalla: Gestiona la lógica de combate entre dos entrenadores, determinando el orden de turnos, 
        aplicando reglas de tipo y calculando daños.

-  Ventaja: La POO permite representar de manera intuitiva y coherente estas entidades, reflejando sus 
    características y comportamientos reales en el juego.
## 2. Encapsulación

###  Aplicación en Pookémon Battle:
  - Pookémon: Sus estadísticas y movimientos están encapsulados, permitiendo que solo métodos específicos 
        puedan modificar su estado (por ejemplo, reducir puntos de vida al recibir daño).
	
- Batalla: Gestiona internamente la lógica de combate sin exponer detalles a otras clases, 
        garantizando que las reglas del juego se apliquen correctamente.

- Ventaja: Mejora la seguridad y la integridad de los datos, evitando modificaciones no autorizadas 
    y facilitando el mantenimiento del código.

## 3. Herencia y Reutilización de Código

### Aplicación en Pookémon Battle:
 - Tipos de Movimientos: Podrían existir clases específicas para diferentes tipos de movimientos 
        (físicos, especiales) que heredan de una clase base Movimiento.

-   Tipos de Pookémon: Si ciertos Pookémon comparten características comunes, se puede crear una 
        jerarquía de clases que permita heredar comportamientos y atributos comunes.

  - Ventaja: Facilita la extensión del sistema, permitiendo agregar nuevas funcionalidades con un 
    esfuerzo mínimo y manteniendo una estructura coherente.

## 4. Polimorfismo

###  Aplicación en Pookémon Battle:
 - Métodos de Ataque: Diferentes Pookémon pueden tener implementaciones variadas del método attack(), 
        dependiendo de sus estadísticas y tipos.
        
    - Ventaja: Aumenta la flexibilidad y extensibilidad del sistema, permitiendo que nuevas clases se integren 
    sin alterar el código existente.

## 5. Modularidad y Mantenibilidad

### Aplicación en Pookémon Battle:
  - Separación de Responsabilidades: Cada clase tiene una responsabilidad específica 
        (por ejemplo, la clase Battle solo se encarga de la lógica de combate), lo que simplifica la 
        localización y resolución de errores.
  - Facilidad de Actualización: Nuevas funcionalidades, como nuevos tipos de movimientos o Pookémon, 
        pueden añadirse sin afectar las clases existentes.

 - Ventaja: Reduce la complejidad del desarrollo y facilita la colaboración entre múltiples desarrolladores, 
    ya que cada uno puede trabajar en módulos independientes.

## 6. Escalabilidad

### Aplicación en Pookémon Battle:
- Expansión de Funcionalidades: Se pueden agregar nuevas características como torneos en línea, 
        rankings, o integración con redes sociales mediante la creación de nuevas clases o la extensión de las existentes.
  
- Ventaja: Garantiza que el sistema pueda evolucionar con las necesidades de la organización sin requerir 
    una reestructuración completa.

## 7. Reusabilidad
### Aplicación en Pookémon Battle:
-  Componentes Compartidos: Clases como Trainer, Pookémon y Move pueden reutilizarse en otros 
        proyectos relacionados con el universo Pookémon, como aplicaciones de gestión de colecciones o 
        plataformas de comercio de cartas digitales.

- Ventaja: Maximiza el retorno de inversión en el desarrollo de software al reducir el tiempo y 
    esfuerzo necesarios para crear nuevas funcionalidades.
