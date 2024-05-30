import java.net.URI

plugins {
    id("org.jetbrains.kotlin.jvm").version("2.0.0")
    id( "groovy")
    id("java")
    id("maven-publish")
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

publishing {
    repositories {
        maven {
            name = "MicroservicePipelinePractice"
            url = URI("https://github.com/tazzledazzle/MicroservicePipelinePractice")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
