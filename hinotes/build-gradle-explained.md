# Understanding build.gradle

The `build.gradle` file is the configuration script for your project. In a Spring Boot project, it defines the plugins, dependencies, and build logic.

## 1. Plugins Section
```gradle
plugins {
    id 'java'
    id 'org.springframework.boot' version '3.2.5'
    id 'io.spring.dependency-management' version '1.1.4'
}
```
-   **`java`**: Adds support for Java development.
-   **`org.springframework.boot`**: Provides tasks like `bootJar` and `bootRun`.
-   **`io.spring.dependency-management`**: Manages versions of Spring dependencies automatically.

## 2. Project Metadata
```gradle
group = 'com.example'
version = '0.0.1-SNAPSHOT'
```
-   These fields determine the artifact's group and version, which are used when generating the JAR file.

## 3. Java Version
```gradle
java {
    sourceCompatibility = '17'
}
```
-   Specifies the Java version used for compilation.

## 4. Repositories
```gradle
repositories {
    mavenCentral()
}
```
-   Specifies where Gradle downloads your dependencies from. `mavenCentral()` is the standard repository.

## 5. Dependencies
```gradle
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}
```
-   **`implementation`**: Libraries required for the application to function.
-   **`testImplementation`**: Libraries required only for compiling and running tests.

## 6. Tasks
```gradle
tasks.named('test') {
    useJUnitPlatform()
}
```
-   Configures specific tasks. Here, it tells Gradle to use the JUnit 5 platform for testing.

---
*Created during discussion on build.gradle configuration.*
