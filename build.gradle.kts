plugins {
    kotlin("jvm") version "1.4.0-rc"
    application
    id("org.openjfx.javafxplugin") version "0.0.9"
}

application { mainClassName = "com.example.MyApp" }


repositories {
    mavenCentral()
    jcenter()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
}

dependencies {
    // Kotlin standard library
    implementation(kotlin("stdlib-jdk8"))
    // TornadoFX dependency
    implementation("no.tornado:tornadofx:1.7.20")
}

// JavaJX module to include
javafx { modules = listOf("javafx.controls", "javafx.fxml", "javafx.graphics") }

// Set Kotlin/JVM target versions
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "11" // or higher
    kotlinOptions.languageVersion = "1.4"
}

// Be sure to use lates Gradle version
tasks.named<Wrapper>("wrapper") { gradleVersion = "6.6" }
