# API REST - Consultorio Médico - Voll.Med

Este proyecto es una **API RESTful** desarrollada en **Java con Spring Boot** para la gestión de un consultorio médico.  
La aplicación permite manejar pacientes, médicos y consultas médicas, con funcionalidades de autenticación y autorización basadas en **Auth0 y JWT**.

---

## 🚀 Funcionalidades

- **Pacientes**
    - Registrar un paciente
    - Listar todos los pacientes
    - Detallar un paciente por ID
    - Actualizar información de un paciente
    - Eliminar un paciente

- **Médicos**
    - Registrar un médico
    - Listar todos los médicos
    - Detallar un médico por ID
    - Actualizar información de un médico
    - Eliminar un médico

- **Consultas**
    - Reservar una consulta médica
    - Cancelar una consulta médica

- **Gestión de errores**
    - Respuestas personalizadas para errores `404 Not Found`, `400 Bad Request`
    - Manejo de errores de validación (DTOs)

- **Seguridad**
    - Integración con **Spring Security**
    - Autenticación y autorización mediante **Auth0** y **JWT Tokens**

---

## 🛠️ Tecnologías utilizadas

- **Java 17+**
- **Spring Boot** (Web, Security, Validation, Data JPA)
- **MySQL** como base de datos relacional
- **DTOs** para el manejo de información en las capas de la aplicación
- **Auth0 + JWT** para autenticación y autorización
- **Maven** como gestor de dependencias

---

## 📂 Estructura del proyecto

- **controller**
    - Controladores REST (Pacientes, Médicos, Consultas, Autenticación)

- **domain**
    - **consulta** → Entidades y lógica de consultas médicas
    - **direccion** → Datos de direcciones
    - **medico** → Entidades y DTOs de médicos
    - **paciente** → Entidades y DTOs de pacientes

- **infra**
    - **exceptions** → Manejo centralizado de errores

- **security**
    - Seguridad y autenticación con JWT/Auth0

- **usuario**
    - Validaciones de usuario

- **springdoc**
    - Configuración de documentación OpenAPI

- **ApiApplication.java**
    - Clase principal del proyecto

## ⚙️ Configuración del entorno

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/usuario/consultorio-api.git
   cd consultorio-api

