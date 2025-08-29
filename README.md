# CleanApp

Aplicación web desarrollada en **Java con Spring Boot**, siguiendo los principios de **Clean Architecture (Arquitectura Limpia)**.
El proyecto organiza el código en capas de dominio, aplicación e infraestructura, lo que favorece el mantenimiento, la extensibilidad y la escalabilidad del sistema.

**🚀 Tecnologías utilizadas**

Java 21

Spring Boot 3.5.5

Maven

MySQL (conector incluido)

JUnit 5 (pruebas unitarias)

**📦 Dependencias principales en Spring Boot**

Spring Boot Starter Web

Spring Boot Starter Data JPA

Spring Boot Devtools

MySQL Connector J

Spring Boot Starter Test

**📂 Estructura del proyecto**

```cleanapp
├── 📄 mvnw
├── 📄 mvnw.cmd
├── 📄 pom.xml
└── 📁 src
├── 📁 main
│ └── 📁 java
│ └── 📁 com.esfe.cleanapp
│ ├── 📁 application
│ │ └── 📁 usecase
│ │ ├── 📄 CheckDbHealthService.java
│ │ └── 📄 RegistrarClienteService.java
│ ├── 📁 domain
│ │ ├── 📁 model
│ │ │ ├── 📄 Cliente.java
│ │ │ ├── 📄 Pedido.java
│ │ │ └── 📄 Usuario.java
│ │ └── 📁 port
│ │ ├── 📄 RegistarClienteUseCase.java
│ │ ├── 📁 in
│ │ │ └── 📄 CheckDbHealthUseCase.java
│ │ └── 📁 out
│ │ └── 📄 SqlHealthPort.java
│ ├── 📁 infrastructure
│ │ ├── 📁 config
│ │ │ └── 📄 BeanConfig.java
│ │ ├── 📁 persistencia
│ │ │ └── 📄 ClienteRepositoryAdapter.java
│ │ ├── 📁 adapter
│ │ │ └── 📄 SqlHealthAdapter.java
│ │ └── 📁 web
│ │ ├── 📄 ClienteController.java
│ │ └── 📄 HealthController.java
│ └── 📄 CleanappApplication.java
│
└── 📁 test
└── 📁 java
└── 📁 com.esfe.cleanapp
├── 📄 CleanappApplicationTests.java
``└── 📄 DbConnectionSmokeTest.java





