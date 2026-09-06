# Proyecto Inventario JDBC - DAO

Proyecto de consola Java para la gestión de inventario de productos implementando el patrón de diseño Data Access Object (DAO) y conexión a base de datos H2 mediante JDBC.

## Información del Estudiante
* **Institución:** Universidad Tecnológica de El Salvador (UTEC)
* **Estudiante:** Geovanny Daniel Barrera Herrera 25-0615-2022
*  Miguel Angel Cruz Olmedo 27-2723-2025
* **Lenguaje:** Java 26 / OpenJDK
* **Gestor de Dependencias:** Maven
* **Base de Datos:** H2 Database Engine

## Estructura del Proyecto

```text
sv.udu.utec
├── Main.java                 # Punto de entrada y pruebas del CRUD
├── datos/
│   ├── ConexionDB.java       # Configuración y obtención de conexiones JDBC
│   └── DAO.java              # Lógica de operaciones SQL (Create, Read, Update, Delete)
└── modelo/
    └── Producto.java         # Clase modelo POJO
