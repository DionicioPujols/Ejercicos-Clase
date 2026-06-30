1. ¿Cuál es la diferencia entre ActionEvent, MouseEvent y KeyEvent?

La principal diferencia entre estos eventos es el tipo de interacción del usuario que detectan:

* ActionEvent: Se genera cuando ocurre una acción general sobre un componente, como hacer clic en un botón o seleccionar una opción de un menú.
* MouseEvent: Se produce cuando el usuario interactúa con el mouse, por ejemplo, al hacer clic, mover el cursor, presionar o soltar un botón del mouse.
* KeyEvent: Se activa cuando el usuario interactúa con el teclado, ya sea presionando, soltando o escribiendo una tecla.

Cada uno de estos eventos permite responder a diferentes acciones del usuario dentro de una aplicación JavaFX.

2. ¿Por qué es mejor separar la vista en FXML y la lógica en el Controller?

Separar la vista en FXML y la lógica en el Controller es una buena práctica porque permite mantener una estructura organizada y fácil de mantener. El archivo FXML se encarga únicamente del diseño y la apariencia de la interfaz gráfica, mientras que el Controller contiene la lógica y el comportamiento de la aplicación.

Esta separación ofrece varias ventajas:

* Facilita el mantenimiento del código.
* Permite reutilizar componentes visuales.
* Hace más sencillo el trabajo en equipo entre diseñadores y desarrolladores.
* Mejora la legibilidad y organización del proyecto.
* Reduce el acoplamiento entre la interfaz y la lógica de negocio.

3. ¿Qué función cumple @FXML?

La anotación @FXML se utiliza para indicar que un atributo o método del Controller está vinculado a un componente o evento definido en el archivo FXML. Gracias a esta anotación, JavaFX puede acceder e inyectar automáticamente los elementos de la interfaz en el Controller.

Además, @FXML permite que métodos privados puedan ser invocados desde el archivo FXML, facilitando la comunicación entre la interfaz y la lógica del programa.

4. ¿Qué ocurre si el nombre del método en el FXML no coincide con el método del Controller?

Si el nombre del método especificado en el archivo FXML no coincide con el nombre del método definido en el Controller, JavaFX no podrá encontrar el método correspondiente cuando se ejecute el evento.

Como resultado, la aplicación generará una excepción durante la ejecución, generalmente relacionada con la carga del archivo FXML, y el evento asociado no funcionará correctamente. Por esta razón, es importante verificar que los nombres de los métodos sean exactamente iguales.

5. ¿Por qué es recomendable usar CSS en lugar de colocar estilos directamente en Java?

El uso de CSS es recomendable porque permite separar el diseño visual de la lógica de programación. Esto hace que la aplicación sea más organizada, flexible y fácil de mantener.

Las principales ventajas de utilizar CSS son:

* Centraliza la administración de estilos.
* Facilita modificar la apariencia sin cambiar el código Java.
* Permite reutilizar estilos en múltiples componentes.
* Mejora la legibilidad y mantenimiento del proyecto.
* Hace posible cambiar temas o diseños de forma rápida y sencilla.
