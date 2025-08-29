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

## 📂 Estructura del proyecto
cleanapp
├── mvnw
├── mvnw.cmd
├── pom.xml
└── src
├── main
│ └── java
│ └── com.esfe.cleanapp
│ ├── application
│ │ └── usecase
│ │ ├── CheckDbHealthService.java
│ │ └── RegistrarClienteService.java
│ ├── domain
│ │ ├── model
│ │ │ ├── Cliente.java
│ │ │ ├── Pedido.java
│ │ │ └── Usuario.java
│ │ └── port
│ │ ├── RegistarClienteUseCase.java
│ │ ├── in
│ │ │ └── CheckDbHealthUseCase.java
│ │ └── out
│ │ └── SqlHealthPort.java
│ ├── infrastructure
│ │ ├── config
│ │ │ └── BeanConfig.java
│ │ ├── persistencia
│ │ │ └── ClienteRepositoryAdapter.java
│ │ ├── adapter
│ │ │ └── SqlHealthAdapter.java
│ │ └── web
│ │ ├── ClienteController.java
│ │ └── HealthController.java
│ └── CleanappApplication.java
│
└── test
└── java
└── com.esfe.cleanapp
├── CleanappApplicationTests.java
└── DbConnectionSmokeTest.java

## 📂 Organización del proyecto
Domain → Entidades y reglas de negocio (ej. Usuario), puertos de entrada y salida.
Application → Casos de uso que orquestan la lógica (ej. CheckDbHealthService).
Infrastructure → Adaptadores técnicos, controladores web, repositorios y configuraciones.

---

## ⚙️ Configuración

Crea un archivo `application.yml` en `src/main/resources/` con la configuración de la base de datos:

```yaml
spring:
  datasource:
    url: jdbc:mysql://<HOST>:<PUERTO>/<DB>
    username: <USUARIO>
    password: <CONTRASEÑA>
    driver-class-name: com.mysql.cj.jdbc.Driver

  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
## ⚠️ Importante: no subir credenciales reales.
Puedes usar un application-example.yml como referencia,no subir credenciales reales.

▶️ Ejecución
1. Clonar el repositorio:
git clone https://github.com/MelidaZuniga55/cleanapp.git
cd cleanapp
2. Compilar con Maven:
./mvnw clean install
3. Levantar la aplicación:
./mvnw spring-boot:run
4. Abrir en el navegador:
http://localhost:8080

📊 Estado del Proyecto

✅ Arquitectura limpia implementada
✅ Conexión a base de datos MySQL
✅ Endpoint de verificación de salud (/health)
✅ Casos de uso para clientes
✅ Pruebas de conexión a la base de datos


