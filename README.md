# Foro Hub - API REST para la gestión de tópicos

**Foro Hub** es un proyecto backend desarrollado para replicar el funcionamiento de un foro, permitiendo a los usuarios realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre tópicos. Este sistema está diseñado utilizando el framework **Spring Boot** y sigue las mejores prácticas REST.

## Características principales

- **Creación de tópicos**: Los usuarios pueden crear nuevos tópicos con un título y un mensaje.
- **Listado de tópicos**: Obtén todos los tópicos creados en el sistema.
- **Visualización de tópicos específicos**: Consulta información detallada de un tópico por su ID.
- **Actualización de tópicos**: Modifica el título o el mensaje de un tópico existente.
- **Eliminación de tópicos**: Elimina un tópico por su ID.
- **Validaciones**: Se implementan reglas de negocio para garantizar datos consistentes.
- **Persistencia**: La información se almacena en una base de datos SQL Server.
- **Autenticación y autorización**: Se restringe el acceso a las operaciones sensibles mediante un servicio de autenticación.

## Tecnologías utilizadas

- **Java**: Lenguaje principal de programación.
- **Spring Boot**: Framework para construir la API REST.
- **Spring Data JPA**: Para la interacción con la base de datos.
- **SQL Server**: Sistema de gestión de bases de datos.
- **Lombok**: Para reducir el código boilerplate en las clases.
- **Flyway**: Para la gestión de migraciones de base de datos.

## Estructura del proyecto

El proyecto está organizado siguiendo una arquitectura por capas:

1. **Controller**: Gestiona las solicitudes HTTP y las redirige al servicio correspondiente.
2. **Service**: Contiene la lógica de negocio.
3. **Repository**: Interactúa directamente con la base de datos utilizando Spring Data JPA.
4. **Domain**: Define las entidades del modelo de dominio (por ejemplo, `Topic`).
5. **Infra**: Excepciones personalizadas y configuraciones adicionales.

## Requisitos previos

- **JDK 17 o superior**
- **Maven**
- **SQL Server**
- Herramienta de tu elección para ejecutar y probar la API (por ejemplo, Postman o cURL).

## Configuración de la base de datos

Asegúrate de configurar las credenciales de tu base de datos en el archivo `application.properties`:

```properties
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=foro_hub
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=validate
spring.flyway.enabled=true
