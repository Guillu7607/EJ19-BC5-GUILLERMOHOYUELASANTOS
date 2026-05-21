# Resumen
Este proyecto demuestra cómo gestionar múltiples ventanas en una aplicación de escritorio utilizando JavaFX. 
El objetivo del ejercicio es aprender a instanciar y lanzar un escenario secundario (Stage) a partir de una acción en la ventana principal, 
estableciendo además una relación de propiedad entre ambas.
# Características
Múltiples Escenarios (Stage): Va más allá de los diálogos prefabricados (Alert, TextInputDialog) para crear una ventana completamente personalizada desde cero.
Jerarquía de Ventanas: Utiliza el método initOwner para vincular la ventana secundaria a la principal,
lo que ayuda al sistema operativo a gestionar correctamente el enfoque y el agrupamiento de las ventanas.
Diseño Independiente: La ventana secundaria define su propio contenedor (StackPane), sus propios componentes (un nuevo botón) y
sus dimensiones de escena específicas ($300 \times 200$).Modo No Bloqueante: Al utilizar show() en lugar de showAndWait(),
la ventana secundaria se abre de forma asíncrona, permitiendo al usuario interactuar con ambas ventanas al mismo tiempo.
