plugins {
    id("org.jetbrains.kotlin.jvm").version("2.0.0")
    id( "groovy")
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("io.kotest:kotest-runner-junit5:5.9.0")
}

kotlin {
    jvmToolchain(11)
}

tasks {
    test {
        useJUnitPlatform()
    }
}
