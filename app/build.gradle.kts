val MAIN_CLASS = "ru.lavrent.lab2.Main"

plugins {
    application
    id("com.github.johnrengelman.shadow") version "8.1.1"
    java
}

repositories {
    gradlePluginPortal()
}

dependencies {
    // This dependency is used by the application.
    implementation("com.google.guava:guava:32.1.1-jre")
    implementation(fileTree("libs") { include("*.jar") })
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

application {
    mainClass.set(MAIN_CLASS)
}
tasks.shadowJar {
    archiveBaseName.set("lab2")
    archiveClassifier.set("")
    minimize()
}

tasks.jar {
    enabled = false
    manifest.attributes["Main-Class"] = "ru.lavrent.lab2.Main"
    dependsOn("shadowJar")
}