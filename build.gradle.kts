plugins {
    java
    id("io.freefair.lombok") version "8.13.1" apply false
}

subprojects {
    plugins.apply("java")
    plugins.apply("io.freefair.lombok")

    group = "one.drix.mdn.$name"
    //version = "0.0.1" -> Individual versions for each module

    repositories {
        mavenCentral()
    }

    dependencies {
        testImplementation(platform("org.junit:junit-bom:5.10.0"))
        testImplementation("org.junit.jupiter:junit-jupiter")
    }

    tasks.test {
        useJUnitPlatform()
    }
}
