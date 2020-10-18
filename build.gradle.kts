plugins {
    kotlin("jvm") version "1.4.10"
    kotlin("kapt") version "1.4.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks {
    compileKotlin {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("io.arrow-kt:arrow-fx:0.11.0")
    implementation("io.arrow-kt:arrow-syntax:0.11.0")
    implementation("io.arrow-kt:arrow-fx-coroutines:0.11.0")
    implementation("io.arrow-kt:arrow-optics:0.11.0")
    kapt("io.arrow-kt:arrow-meta:0.11.0")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")
}
