
plugins {
    kotlin("jvm")
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation(project(":Infra"))
    implementation ("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("io.micronaut.data:micronaut-data-jdbc")
    implementation("io.micronaut:micronaut-jackson-databind")
    runtimeOnly("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("jakarta.persistence:jakarta.persistence-api")
    implementation("jakarta.annotation:jakarta.annotation-api")
    implementation("io.micronaut.sql:micronaut-jdbc-hikari")
    implementation("io.micronaut.sql:micronaut-jdbc-hikari")
    runtimeOnly("com.h2database:h2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks {
    compileKotlin {
        kotlinOptions {
            jvmTarget = "17"
        }
    }
    compileTestKotlin {
        kotlinOptions {
            jvmTarget = "17"
        }
    }
}