plugins {
    id("java")
}

group = "org.github.gilbert9172.java-study"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // JUnit5
    testImplementation(platform("org.junit:junit-bom:5.10.3"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    testRuntimeOnly("org.junit.vintage:junit-vintage-engine")
    // AssertJ
    testImplementation("org.assertj:assertj-core:3.25.3")
    // Mockito
    testImplementation("org.mockito:mockito-core:5.11.0")
}

tasks.test {
    useJUnitPlatform()
}