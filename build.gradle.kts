plugins {
    kotlin("jvm") apply false
}

group = "com.otus.otus-kotlin"
version = "0.0.1"

repositories {
    mavenCentral()
}

subprojects {
    repositories {
        mavenCentral()
    }
    group = rootProject.group
    version = rootProject.version
}