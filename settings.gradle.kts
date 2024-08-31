rootProject.name = "tech-delivery"

pluginManagement {
    val springBootVersion: String = extra["springBootVersion"] as String
    val kotlinVersion: String = extra["kotlinVersion"] as String

    plugins {
        kotlin("jvm") version kotlinVersion
        kotlin("plugin.spring") version kotlinVersion
        id("org.jetbrains.kotlin.plugin.jpa") version kotlinVersion
        id("org.springframework.boot") version springBootVersion
        id("io.spring.dependency-management") version "1.1.6"
        id("org.jlleitschuh.gradle.ktlint") version "12.1.1"
    }
}
