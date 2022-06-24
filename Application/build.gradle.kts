
plugins {
    kotlin("jvm")
    kotlin("kapt")
    id("io.micronaut.application")
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation(project(":Infra"))
    implementation(project(":Domain"))
    implementation ("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("jakarta.annotation:jakarta.annotation-api")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.2")
    implementation("io.micronaut.data:micronaut-data-jdbc:3.4.2")
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