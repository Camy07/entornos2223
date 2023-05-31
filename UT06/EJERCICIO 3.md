Ejemplo2: Se desea realizar el análisis de un sistema de gestión informática de una pequeña
agencia de viajes que oferta viajes a sus clientes. El sistema debe proporcionar una ventana
inicial con una serie de menús que abrirán paso al resto de ventanas de la aplicación que permitirán realizar las siguientes acciones:
La gestión de las reservas de viajes para realizar reservas, modificar reservas,
consultar reservas, borrar reservas y generar e imprimir facturas.
El mantenimiento de datos de clientes, para mantener actualizados los datos se
realizarán operaciones de consulta, altas, bajas y modificaciones de datos de clientes,
y además debe permitir generar listados de clientes.
Mantenimiento de datos de viajes, para mantener actualizados los datos se realizarán
operaciones de consulta, altas, bajas, modificaciones e informes de viajes.
Disponemos de una base de datos donde están almacenados los datos de los clientes, los
viajes, las reservas, las fechas de viaje, los datos son los siguientes:
Datos de clientes son: código-cliente, nombre, tlf y dirección.
Datos de viajes son: código, nombre, plazas y precio.
Datos de las reservas son: número de reserva y estado de la reserva.
Un cliente puede realizar muchas reservas, y una reserva es de un cliente.
Igualmente, de un viaje se pueden realizar muchas reservas, y una reserva pertenecerá
a un viaje.
Los viajes se ofertan en varias fechas de viaje, de estas fechas se necesita saber la
fecha de comienzo y la fecha de fin. Estas fechas pueden ser compartidas por varios
viajes.
También se cuenta con la información de un catálogo de viajes, datos del catálogo
son: código, destino, procedencia, temporada, precio. Los viajes se crean a partir del
catálogo.