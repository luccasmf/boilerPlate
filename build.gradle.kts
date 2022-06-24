plugins {
    base
    id("org.jetbrains.kotlin.jvm") version "1.6.21" apply true
    id("org.jetbrains.kotlin.kapt") version "1.6.21" apply true
    id("org.jetbrains.kotlin.plugin.allopen") version "1.6.21" apply false
    id("org.jetbrains.kotlin.plugin.jpa") version "1.6.21" apply false
    id("com.github.johnrengelman.shadow") version "7.1.2" apply false
    id("io.micronaut.application") version "3.4.1" apply false
}

val kotlinVersion = project.properties.get("kotlinVersion")

allprojects {
    version = "0.1"
    group = "com.luccmf"

    repositories {
        mavenCentral()
    }
}
dependencies {
// faz com que a configuração dos arquivos do projeto raiz dependa de cada subprojeto
    subprojects.forEach {
        archives(it)
    }

}
kapt {
    correctErrorTypes  = true
}


