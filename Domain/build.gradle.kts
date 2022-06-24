import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
}

dependencies {
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

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}