# Gradle Wrapper (gradlew.bat)

The Gradle Wrapper is the recommended way to execute Gradle builds. It allows you to run a project's build without having Gradle installed on your system.

## Why Use the Wrapper?
1.  **Portability**: Anyone who clones the project can build it immediately using `./gradlew`.
2.  **Version Consistency**: Ensures every developer and the build server use the exact same version of Gradle.
3.  **Zero Installation**: Automatically downloads and caches the correct Gradle version the first time it is run.

## Key Files
A project with the wrapper includes:
-   `gradlew`: Shell script for Linux/macOS.
-   `gradlew.bat`: Batch script for Windows.
-   `gradle/wrapper/gradle-wrapper.jar`: The executable that downloads Gradle.
-   `gradle/wrapper/gradle-wrapper.properties`: Configuration file specifying the Gradle version to use.

## Common Commands
-   **Build the project**: `./gradlew build`
-   **Build without tests**: `./gradlew build -x test`
-   **Build Spring Boot JAR**: `./gradlew bootJar`
-   **Run the app**: `./gradlew bootRun`
-   **Clean build**: `./gradlew clean build`

## Troubleshooting "Gradle not recognized"
If the `gradle` command is not in your system PATH, use `./gradlew` (or `.\gradlew` on Windows) instead. This script bypasses the need for a global Gradle installation.

 