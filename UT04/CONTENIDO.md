Una de las destrezas básicas para convertirse en un buen programador consiste en saber optimizar código. Inicialmente, cuando somos profesores novatos, hacemos los programas de la única forma que sabemos, pero, cuando adquirimos experiencia y somos capaces de generar varias, hay que elegir entre todas las posibles soluciones la más eficiente, efectiva, ... En resumen, la óptima. De eso se trata la optimización.

Técnicamente, podemos decir que optimización o refactorización es el proceso de cambiar la estructura interna de un software sin alterar su comportamiento externo y se realiza para mejorar la calidad del código, aumentar su legibilidad y mantenibilidad.

Algunas de las características más importantes son:

1. Se puede hacer a medida que se desarrolla el software o después de que está completado.
2. Algunas técnicas de refactorización incluyen la reestructuración de código, la eliminación de duplicados y la creación de métodos reutilizables.
3. Es importante realizar pruebas después de cualquier refactorización para asegurarse de que el comportamiento del software sigue siendo el esperado.
4. La refactorización puede ser una parte valiosa del ciclo de desarrollo de software para asegurar un código limpio y eficiente.

### Patrones de refactorización

1. Son soluciones comunes y probadas a problemas específicos en el código.
2. Ayudan a mejorar la estructura y calidad del código de forma sistemática y repetitiva.
3. Algunos patrones de refactorización comunes incluyen: Extracción de método, Reemplazo de condicional con polimorfismo, Inversión de dependencias y Extracción de clase.
4. Cada patrón tiene un propósito específico, como reducir la complejidad, aumentar la legibilidad o mejorar la escalabilidad.
5. Utilizar patrones de refactorización es una buena práctica para mantener un código sólido y fácil de mantener.
6. Es importante conocer los patrones de refactorización y elegir el adecuado para cada situación, para lograr una solución eficiente y sostenible a largo plazo.

#### Algunos patrones:

En el proceso de refactorización, se siguen una serie de patrones preestablecidos, los más comunes son los siguientes:

- **Renombrado (rename)**: este patrón nos indica que debemos cambiar el nombre de un paquete, clase, método o campo, por un nombre más significativo.
- **Sustituir bloques de código por un método**: este patrón nos aconseja sustituir un bloque de código, por un método. De esta forma, cada vez que queramos acceder a ese bloque de código, bastaría con invocar al método.
- **Campos encapsulados**: se aconseja crear métodos getter y setter, (de asignación y de consulta) para cada campo que se defina en una clase. Cuando sea necesario acceder o modificar el valor de un campo, basta con invocar al método getter o setter según convenga.
- **Organizar las clases por paquetes (packages)**: si es necesario, se puede mover una clase de un paquete a otro, o de un proyecto a otro. La idea es no duplicar código que ya se haya generado. Esto impone la actualización en todo el código fuente de las referencias a la clase en su nueva localización.
- Cambiar los parámetros del proyecto: nos permite añadir nuevos parámetros a un método y cambiar los modificadores de acceso.




## CONTROL DE VERSIONES

Otro de los elementos que contribuye al desarrollo óptimo del software es el uso de un SCV (Sistema de Control de Versiones), un sistema que permite gestionar y mantener versiones de archivos y proyectos de software. Utilizar un sistema de control de versiones es una buena práctica en el  desarrollo de software, ya que facilita la colaboración y el seguimiento de los cambios en el proyecto.

Las ventajas del uso de CVS (sus siglas en inglés) son:

- Permite a varios desarrolladores trabajar juntos en un mismo proyecto, manteniendo un historial de cambios y versiones.
- Ofrece la posibilidad de revertir a versiones previas, comparar y fusionar versiones, y hacer seguimiento de los cambios realizados por cada usuario.
- CVS se ejecuta en un servidor central y los desarrolladores pueden acceder y descargar versiones a través de un cliente.
- Existen diferentes tipos de CVS, incluyendo Subversion (SVN), Git y Mercurial.



### Documentación

Por último, la documentación. Ningún desarrollador puede considerarse bueno si no le da la importancia que corresponde a la documentación. Recuérdese que un programa poco o mal documentado es un mal producto.

Antes de entrar en detalles, algunas frases a tener en cuenta:

> "If your program isn't worth documenting, it probably isn't worth running" (Si su programa no merece la pena documentarlo, probablemente no merece la pena ejecutarlo). J. Nagler. 1995.

> "Do not document bad code - rewrite it" (No documentar código malo—reescribirlo). R. Caron. 2000.

> "Write the documentation before you write the code." (Escribe la documentación antes de escribir el código). S.W. Ambler. 2000.








