plugins {
    id("org.jetbrains.kotlin.jvm").version("2.0.0")
    id( "groovy")
    id("java")
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(11)
}

tasks {
    test {
        useJUnitPlatform()
    }
}
