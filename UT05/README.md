# UT05 - CONTROL DE VERSIONES CON GIT

### RECURSOS:

- [APUNTES CUQUIS](https://drive.google.com/file/d/1sHgKrrea1-HpityOEYqFLjRdaum85CnW/view)

### DEFINICIONES:

Un control de versiones es un sistema que registra los cambios realizados en un archivo o conjunto de archivos a lo largo del tiempo, de modo que puedas recuperar versiones específicas
más adelante. 

Git es un sistema de control de versiones distribuido, utilizado principalmente en el desarrollo de software para rastrear los cambios realizados en el código fuente. Fue creado por Linus Torvalds en 2005 para el desarrollo del kernel de Linux. Con Git, los desarrolladores pueden colaborar en proyectos de manera más eficiente y segura.

### INSTALACIÓN DE GIT

Sigue el [siguiente enlace](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git) para ver su instalación.

Comandos básicos de Git:

- `git init`: Inicializa un repositorio vacío de Git en el directorio actual.

- `git add`: Agrega archivos al área de preparación (staging) para ser confirmados.

- `git commit`: Confirma los cambios agregados al área de preparación, creando una nueva versión en el historial de cambios.

- `git status`: Muestra el estado actual del repositorio, incluyendo los cambios pendientes y los archivos no rastreados.

- `git log`: Muestra el historial de cambios del repositorio, incluyendo los commits realizados y sus mensajes.

- `git branch`: Crea una nueva rama en el repositorio para trabajar en paralelo con la rama principal (master).

- `git checkout`: Cambia entre ramas o versiones del repositorio.

- `git merge`: Combina los cambios realizados en una rama con la rama principal.

- `git clone`: Crea una copia del repositorio en otro lugar, como un servidor remoto o una computadora local.

Ejemplo de uso de Git:

Supongamos que estamos trabajando en un proyecto de desarrollo de software con un equipo de programadores. Para utilizar Git en este proyecto, debemos seguir los siguientes pasos:

- Crear un repositorio: Utilizamos el comando `git init` en el directorio raíz del proyecto para crear un repositorio vacío de Git.

- Agregar archivos: Utilizamos el comando `git add` para agregar los archivos modificados o nuevos al área de preparación.

- Confirmar cambios: Utilizamos el comando `git commit` para confirmar los cambios agregados al área de preparación y crear una nueva versión en el historial de cambios.

- Trabajar en ramas: Utilizamos el comando `git branch` para crear una nueva rama del proyecto y trabajar en ella en paralelo con la rama principal. Por ejemplo, podemos crear una rama llamada "nueva-caracteristica" para agregar una nueva funcionalidad al software.

- Cambiar de rama: Utilizamos el comando `git checkout` para cambiar entre las diferentes ramas del proyecto. Por ejemplo, podemos cambiar a la rama "nueva-caracteristica" para trabajar en la nueva funcionalidad.

- Combinar cambios: Utilizamos el comando `git merge` para combinar los cambios realizados en una rama con la rama principal. Por ejemplo, podemos combinar los cambios realizados en la rama "nueva-caracteristica" con la rama principal "master" para agregar la nueva funcionalidad al software.

- Compartir cambios: Utilizamos el comando `git clone` para crear una copia del repositorio en otro lugar, como un servidor remoto o una computadora local. Por ejemplo, podemos crear una copia del repositorio en un servidor de producción para implementar los cambios realizados.
