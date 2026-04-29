# Gradle Project Structure

A standard Gradle project (especially with Spring Boot) follows a specific directory layout to ensure consistency and ease of automation.

## 1. Root Directory Files
-   **`build.gradle`**: The most important file. It contains the build script, dependencies, plugins, and project version.
-   **`settings.gradle`**: Used to define the project name and manage multi-project builds.
-   **`gradlew` & `gradlew.bat`**: The Gradle Wrapper scripts (Linux/Windows).
-   **`gradle/`**: Contains the Wrapper JAR and properties.
-   **`.gitignore`**: Specifies which files Git should ignore (like `build/` or `.gradle/`).

## 2. The `src` (Source) Folder
Gradle uses the same standard as Maven for source code:
-   **`src/main/java/`**: Your Java source code (packages and classes).
-   **`src/main/resources/`**: Non-java files like `application.yml`, static assets, or templates.
-   **`src/test/java/`**: Unit and integration tests.
-   **`src/test/resources/`**: Configuration files used only during testing.

## 3. The `build` Folder (Generated)
This folder is created when you run a build command (like `./gradlew build`).
-   **`build/libs/`**: Contains the final executable JAR file.
-   **`build/classes/`**: Compiled `.class` files.
-   **`build/reports/`**: Test results and other reports.

## 4. Hidden Directories
-   **`.gradle/`**: Internal Gradle cache and configuration.
-   **`.idea/` or `.settings/`**: IDE-specific configuration files (IntelliJ or Eclipse).

## Visual Tree
```text
hello-gradle/
├── build.gradle
├── settings.gradle
├── gradlew
├── gradlew.bat
├── gradle/
│   └── wrapper/
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/hellogradle/
│   │   │       ├── HelloGradleApplication.java
│   │   │       └── controller/
│   │   │           └── HomeController.java
│   │   └── resources/
│   │       └── application.yml
│   └── test/
│       └── java/
└── build/  (Generated after build)
    └── libs/
        └── hello-gradle-0.0.1-SNAPSHOT.jar
```

---
*Created during discussion on Gradle project organization.*
