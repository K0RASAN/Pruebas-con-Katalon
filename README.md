# Pruebas-con-Katalon
Ejercicios de Automatización en Katalon
Titulo: Flujo de compra
Descripción: Hacer un scprit de prueba donde haremos una compra de un articulo.
Se debe cubrir el 100% de los pasos
Paso
Entrar a la pagina WEB
Loguearse
Dar click para Elegir el artículo en especificativo
Agregar el articulo al carrito
Ir al carrito
Validar que el articulo y precio seleccionado sea el mismo que está en el carrito (esto se hace con una función de comparación de texto, conde extraemos el texto del articulo y lo comparamos con el nombre que ya tenemos).
Hacer checkOut del articulo
Llenar los datos con información de dirección
Validar nuevamente el articulo y el precio, pero ahora en la factura
 Finalizar
Datos
URL: https://www.saucedemo.com/
Usuario y clave: Están en la pagina principal
Articulo: Sauce Labs Fleece Jacket
Precio: 49.99
Nota: Se debe seguir un patrón de diseño POM (Page Object Model), cada validación debe estar dentro de una condición IF y una ELSE y se debe manejar los tiempos de espera de la pagina.
