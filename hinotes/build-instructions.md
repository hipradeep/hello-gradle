# How to Build and Run the Gradle Project

This guide provides the necessary commands to build your project into a JAR file and run it.

## 1. Building the JAR File
The project uses the **Gradle Wrapper**, so you don't need to install Gradle manually. Use the following commands in your terminal:

### Option A: Build an Executable JAR (Recommended)
This is specifically for Spring Boot projects. It creates a "Fat JAR" that contains all dependencies.
```powershell
./gradlew bootJar
```

### Option B: Standard Build
Runs tests and creates a standard JAR.
```powershell
./gradlew build
```

## 2. Locating the Build Output
Once the build is successful, your JAR file will be located in the `build/libs` directory:
-   **Path**: `e:\hello-gradle\build\libs\hello-gradle-0.0.1-SNAPSHOT.jar`

## 3. Running the Application
You can run the generated JAR using the standard Java command:
```powershell
java -jar build/libs/hello-gradle-0.0.1-SNAPSHOT.jar
```

### 3.1 Quick Commands
-   **Run the app**: `./gradlew bootRun`
-   **Debug the app**: `./gradlew bootRun --info`
-   **Clean build**: `./gradlew clean build`

## 4. Cleaning the Build
If you want to delete previous build outputs and start fresh:
```powershell
./gradlew clean
```

## 5. Skipping Tests
If you want to build the project quickly without running tests (similar to Maven's `-DskipTests`), use the `-x` flag:
```powershell
./gradlew build -x test
```
This excludes the `test` task from the build process.

## 6. Troubleshooting: Port already in use
If you get an error saying port 8080 is already in use:

1.  **Find the Process ID (PID)**:
    ```powershell
    netstat -ano | findstr :8080
    ```
2.  **Kill the process**:
    ```powershell
    taskkill /F /PID <PID_NUMBER>
    ```

---
*Created during discussion on build commands, JAR generation, skipping tests, and port management.*
