# Advanced Gradle Configurations

This document outlines additional configurations you can add to your `build.gradle` to improve your build process and JAR output.

## 1. Character Encoding (UTF-8)
Ensures that all Java source files are compiled using UTF-8 encoding, preventing character issues across different operating systems.
```gradle
tasks.withType(JavaCompile) {
    options.encoding = 'UTF-8'
}
```

## 2. Detailed Test Results
Configures Gradle to print more details about tests (passed, failed, skipped) directly in the console.
```gradle
test {
    testLogging {
        events "passed", "skipped", "failed", "standardOut", "standardError"
        showStandardStreams = true
        exceptionFormat = 'full'
    }
}
```

## 3. Custom JAR Filename
By default, Spring Boot creates a JAR named `project-version.jar`. You can override this to a fixed name:
```gradle
bootJar {
    archiveFileName = 'app.jar'
}
```

## 4. Extra Properties (`ext`)
Used for defining versions or constants that are reused throughout the build script.
```gradle
ext {
    springCloudVersion = "2023.0.0"
}
```

## 5. Custom Manifest Attributes
Adds custom metadata to the JAR's `MANIFEST.MF` file.
```gradle
jar {
    manifest {
        attributes(
            'Implementation-Title': 'Hello Gradle API',
            'Implementation-Version': project.version,
            'Build-Time': new java.util.Date().toString()
        )
    }
}
```

## 6. Custom Tasks
You can define custom logic to automate repetitive tasks.
```gradle
tasks.register('copyJarToDesktop', Copy) {
    from bootJar
    into "C:/Users/pradeepmaurya.CDACNOIDA/Desktop"
}
```

---
*Created during discussion on expanding build.gradle capabilities.*
