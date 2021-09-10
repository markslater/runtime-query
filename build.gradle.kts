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

dependencies {
    implementation(group = "org.eclipse.jetty", name = "jetty-server", version = "11.0.6")
    runtimeOnly(group="org.slf4j", name= "slf4j-nop", version = "2.0.0-alpha1")
}

application {
    mainClass.set("com.example.Example")
}

runtime {
    options.set(listOf("--strip-debug", "--compress", "2", "--no-header-files", "--no-man-pages"))
}