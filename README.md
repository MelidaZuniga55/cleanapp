# CleanApp

Aplicación web desarrollada en **Java** con **Spring Boot**, siguiendo los principios de **Clean Architecture (Arquitectura Limpia)**.  
El proyecto organiza el código en capas de **dominio**, **aplicación** e **infraestructura**, lo que favorece el mantenimiento, la escalabilidad y la extensibilidad.

---

## 🚀 Tecnologías utilizadas
- Java 21
- Spring Boot 3.5.5
- Maven
- MySQL (conector incluido)
- JUnit 5 para pruebas unitarias

---

## 📦 Dependencias principales
- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- Spring Boot Devtools
- MySQL Connector J
- Spring Boot Starter Test

---
📂 Estructura del proyecto

cleanapp-master
├── 📄 mvnw
├── 📄 mvnw.cmd
├── 📄 pom.xml
└── 📁 src
    ├── 📁 main
    │   └── 📁 java
    │       └── 📁 com.esfe.cleanapp
    │           ├── 📁 application
    │           │   └── 📁 usecase
    │           │       ├── 📄 CheckDbHealthService.java
    │           │       └── 📄 RegistrarClienteService.java
    │           ├── 📁 domain
    │           │   ├── 📁 model
    │           │   │   ├── 📄 Cliente.java
    │           │   │   ├── 📄 Pedido.java
    │           │   │   └── 📄 Usuario.java
    │           │   └── 📁 port
    │           │       ├── 📄 RegistarClienteUseCase.java
    │           │       ├── 📁 in
    │           │       │   └── 📄 CheckDbHealthUseCase.java
    │           │       └── 📁 out
    │           │           └── 📄 SqlHealthPort.java
    │           ├── 📁 infrastructure
    │           │   ├── 📁 config
    │           │   │   └── 📄 BeanConfig.java
    │           │   ├── 📁 persistencia
    │           │   │   └── 📄 ClienteRepositoryAdapter.java
    │           │   ├── 📁 adapter
    │           │   │   └── 📄 SqlHealthAdapter.java
    │           │   └── 📁 web
    │           │       ├── 📄 ClienteController.java
    │           │       └── 📄 HealthController.java
    │           └── 📄 CleanappApplication.java
    │
    └── 📁 test
        └── 📁 java
            └── 📁 com.esfe.cleanapp
                ├── 📄 CleanappApplicationTests.java
                └── 📄 DbConnectionSmokeTest.java



## 📂 Organización del proyecto
Domain → Entidades y reglas de negocio (ej. Usuario), puertos de entrada y salida.
Application → Casos de uso que orquestan la lógica (ej. CheckDbHealthService).
Infrastructure → Adaptadores técnicos, controladores web, repositorios y configuraciones.

---
⚙️ Configuración

El archivo application.yml (en src/main/resources/) define la conexión a la base de datos:
server:
  port: 8080

spring:
  datasource:
    url: jdbc:mysql://<HOST>:<PUERTO>/<DB>
    username: <USUARIO>
    password: <CONTRASEÑA>
⚠️ Importante: No subir credenciales reales. Se recomienda usar un application-example.yml.

---

