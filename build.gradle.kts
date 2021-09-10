plugins {
    kotlin("jvm") version "1.5.30"
    id("org.beryx.runtime") version "1.12.5"
    id("org.jlleitschuh.gradle.ktlint") version "10.1.0"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(16))
    }
}

application {
    mainClass.set("com.example.Example")
}

runtime {
    options.set(listOf("--strip-debug", "--compress", "2", "--no-header-files", "--no-man-pages"))
}