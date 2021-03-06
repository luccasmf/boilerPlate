import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    kotlin("kapt")
    id("org.jetbrains.kotlin.plugin.jpa")
    id("io.micronaut.application")
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation(project(":Domain"))
    implementation("io.micronaut.data:micronaut-data-jdbc:3.4.2")
    implementation("io.micronaut.data:micronaut-data-hibernate-jpa:3.4.2")
    implementation ("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.2")
    runtimeOnly("com.h2database:h2:2.1.212")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks {
    compileKotlin {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "17"
        }
    }
    compileTestKotlin {
        kotlinOptions {
            jvmTarget = "17"
        }
    }
}