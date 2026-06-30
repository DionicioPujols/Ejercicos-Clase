# Práctica en Clase: Eventos en JavaFX

## Objetivo

Desarrollar pequeñas aplicaciones en JavaFX utilizando **FXML**, **CSS** y **Controller**, practicando los eventos más importantes:

- `ActionEvent`
- `MouseEvent`
- `KeyEvent`

Los estudiantes deben crear **una de las siguientes aplicaciones** o el docente puede asignarlas por grupo.

---

# Opción 1: Conversor de Monedas

## Descripción

Crear una aplicación que permita convertir una cantidad en **pesos dominicanos** a otra moneda.

## Interfaz requerida

La aplicación debe contener:

- Título de la aplicación.
- `TextField` para ingresar el monto en pesos dominicanos.
- `ComboBox` para seleccionar la moneda destino.
- `Button` Convertir.
- `Button` Limpiar.
- `Label` para mostrar el resultado.
- `Label` para mostrar mensajes de ayuda o errores.

## Monedas disponibles

El `ComboBox` debe incluir:

- Dólar estadounidense
- Euro

Pueden usar tasas fijas para la práctica, por ejemplo:

```text
1 USD = 59.00 DOP
1 EUR = 64.00 DOP
```

## Requisitos funcionales

### ActionEvent

Al presionar el botón **Convertir**:

- Validar que el monto no esté vacío.
- Validar que el monto sea numérico.
- Validar que se haya seleccionado una moneda.
- Realizar la conversión correspondiente.
- Mostrar el resultado.

Ejemplo:

```text
RD$ 5,900.00 equivale a 100.00 USD
```

### MouseEvent

Cuando el mouse pase sobre el botón **Convertir**, mostrar:

```text
Presione para realizar la conversión.
```

Cuando el mouse salga del botón, mostrar:

```text
Esperando información...
```

### KeyEvent

Si el usuario presiona **ENTER** dentro del campo de monto, debe ejecutarse la conversión automáticamente.

### Botón Limpiar

Al presionar **Limpiar**:

- Vaciar el campo de monto.
- Reiniciar el `ComboBox`.
- Limpiar el resultado.
- Mostrar el mensaje inicial.

## Diseño esperado

```text
+------------------------------------------------+
| Conversor de Monedas |
|------------------------------------------------|
| Monto en pesos dominicanos |
| [______________________________] |
| |
| Moneda destino |
| [Seleccione una moneda v] |
| |
| [ Convertir ] [ Limpiar ] |
| |
| Resultado: |
| Esperando información... |
+------------------------------------------------+
```

---

# Opción 2: Sistema de Compra en una Cafetería

## Descripción

Crear una aplicación que simule una compra básica en una cafetería.

## Interfaz requerida

La aplicación debe contener:

- Título de la aplicación.
- `TextField` para el nombre del cliente.
- `ComboBox` para seleccionar una bebida.
- `TextField` para ingresar la cantidad.
- `CheckBox` para agregar postre.
- `Button` Calcular.
- `Button` Limpiar.
- `Label` para mostrar el resumen de la compra.
- `Label` para mostrar mensajes de ayuda o errores.

## Productos sugeridos

El `ComboBox` debe incluir al menos:

| Bebida | Precio |
|---|---:|
| Café americano | RD$100 |
| Cappuccino | RD$150 |
| Chocolate caliente | RD$130 |
| Jugo natural | RD$120 |

El postre puede tener un precio fijo:

```text
Postre = RD$75
```

## Requisitos funcionales

### ActionEvent

Al presionar **Calcular**:

- Validar que el nombre no esté vacío.
- Validar que se haya seleccionado una bebida.
- Validar que la cantidad no esté vacía.
- Validar que la cantidad sea numérica y mayor que cero.
- Calcular el subtotal.
- Agregar el costo del postre si el `CheckBox` está seleccionado.
- Mostrar el total.

Ejemplo:

```text
Cliente: Anthony
Producto: Cappuccino
Cantidad: 2
Subtotal: RD$300.00
Postre: Sí
Total: RD$375.00
```

### MouseEvent

Cuando el mouse pase sobre el botón **Calcular**, mostrar:

```text
Presione para calcular el total de la compra.
```

Cuando el mouse salga del botón, mostrar:

```text
Esperando datos de la compra...
```

### KeyEvent

Si el usuario presiona **ENTER** en el campo cantidad, debe calcular automáticamente la compra.

### Botón Limpiar

Al presionar **Limpiar**:

- Vaciar el nombre.
- Reiniciar la bebida seleccionada.
- Vaciar la cantidad.
- Desmarcar el postre.
- Limpiar el resumen.
- Mostrar el mensaje inicial.

## Diseño esperado

```text
+------------------------------------------------+
| Compra en Cafetería |
|------------------------------------------------|
| Cliente |
| [______________________________] |
| |
| Bebida |
| [Seleccione una bebida v] |
| |
| Cantidad |
| [______________________________] |
| |
| [ ] Agregar postre |
| |
| [ Calcular ] [ Limpiar ] |
| |
| Resumen: |
| Esperando datos de la compra... |
+------------------------------------------------+
```

---

# Opción 3: Generador de Contraseñas

## Descripción

Crear una aplicación que genere contraseñas sencillas según las opciones seleccionadas por el usuario.

## Interfaz requerida

La aplicación debe contener:

- Título de la aplicación.
- `TextField` para ingresar la longitud de la contraseña.
- `CheckBox` para incluir mayúsculas.
- `CheckBox` para incluir números.
- `CheckBox` para incluir símbolos.
- `Button` Generar.
- `Button` Limpiar.
- `Label` para mostrar la contraseña generada.
- `Label` para mostrar mensajes de ayuda o errores.

## Reglas sugeridas

La contraseña debe generarse usando caracteres de estos grupos:

```text
Minúsculas: abcdefghijklmnopqrstuvwxyz
Mayúsculas: ABCDEFGHIJKLMNOPQRSTUVWXYZ
Números: 0123456789
Símbolos: !@#$%&*?
```

Las letras minúsculas deben estar siempre disponibles.

## Requisitos funcionales

### ActionEvent

Al presionar **Generar**:

- Validar que la longitud no esté vacía.
- Validar que la longitud sea numérica.
- Validar que la longitud sea mayor o igual a 6.
- Generar la contraseña según las opciones seleccionadas.
- Mostrar la contraseña generada.

Ejemplo:

```text
Contraseña generada: aB92f!xQ
```

### MouseEvent

Cuando el mouse pase sobre el botón **Generar**, mostrar:

```text
Presione para generar una nueva contraseña.
```

Cuando el mouse salga del botón, mostrar:

```text
Esperando configuración...
```

### KeyEvent

Si el usuario presiona **ENTER** en el campo longitud, debe generarse la contraseña automáticamente.

### Botón Limpiar

Al presionar **Limpiar**:

- Vaciar el campo longitud.
- Desmarcar los `CheckBox`.
- Limpiar la contraseña generada.
- Mostrar el mensaje inicial.

## Diseño esperado

```text
+------------------------------------------------+
| Generador de Contraseñas |
|------------------------------------------------|
| Longitud |
| [______________________________] |
| |
| [ ] Incluir mayúsculas |
| [ ] Incluir números |
| [ ] Incluir símbolos |
| |
| [ Generar ] [ Limpiar ] |
| |
| Contraseña generada: |
| Esperando configuración... |
+------------------------------------------------+
```

---

# Requisitos técnicos generales

Cada proyecto debe incluir:

## 1. FXML

La interfaz debe estar diseñada en un archivo `.fxml`.

Debe utilizar al menos:

- `VBox`
- `HBox`
- `Label`
- `TextField`
- `Button`
- Otros controles según la opción seleccionada.

## 2. Controller

La lógica debe estar en una clase Controller.

Debe utilizar:

```java
@FXML
```

para conectar controles y métodos con el archivo FXML.


# Preguntas de reflexión

1. ¿Cuál es la diferencia entre `ActionEvent`, `MouseEvent` y `KeyEvent`?
2. ¿Por qué es mejor separar la vista en FXML y la lógica en el Controller?
3. ¿Qué función cumple `@FXML`?
4. ¿Qué ocurre si el nombre del método en el FXML no coincide con el método del Controller?
5. ¿Por qué es recomendable usar CSS en lugar de colocar estilos directamente en Java?