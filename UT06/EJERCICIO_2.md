## EJERCICIO 2

Realizar el diagrama de clases que represente las relaciones entre
empresa, empleados y clientes. Los requisitos son los siguientes:

- La empresa se compone de clientes y de empleados. Utilizaremos para estas relaciones asociaciones de composición. Una empresa puede solicitar los servicios de un cliente y cancelarlos.
- Los datos de la empresa son: CIF, razón social, dirección y teléfono.
- Los datos de clientes son: código de cliente, nombre, fecha de nacimiento, teléfono, empresa para la que trabaja y comisión. 
- Los datos de empleados son: código de empleado, nombre, fecha de nacimiento, teléfono, fecha de alta en la empresa y salario.
- Como los atributos nombre, fecha de nacimiento y teléfono son comunes para clientes y empleados se creará una clase persona para esos atributos, y las clases cliente y empleado heredarán la clase persona.
- Un empleado puede ser director de varios empleados , y puede contratar y despedir a los mismos. De este director se necesita saber también la categoría y la fecha de alta como director. El director heredará de empleado.
- Para todas las clases crearemos dos métodos, uno para asignar datos a los atributos (como si fuese el constructor), este método tendrá tantos parámetros como atributos, y otro que se llame obtener que devolverá un objeto de la misma clase.

Realizar el diagrama de casos de uso que modelice las relaciones.
