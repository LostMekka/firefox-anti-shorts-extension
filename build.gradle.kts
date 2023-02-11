plugins {
    kotlin("js") version "1.8.0"
}

group = "de.lostmekka"
version = "0.1.0"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/kotlinx-html/maven")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-html:0.7.2")
}

kotlin {
    js {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport {
                    enabled.set(true)
                }
            }
        }
    }
}

tasks.register("distFirefoxPlugin", Zip::class) {
    group = "build"
    dependsOn("assemble")
    archiveFileName.set("${project.name}-${project.version}.zip")
    destinationDirectory.set(file("build/libs/"))
    from(".")
    include(
        "manifest.json",
        "build/js/packages/firefox-anti-shorts-extension/kotlin/*.js",
    )
}

tasks.register("distFirefoxPluginSrc", Zip::class) {
    group = "build"
    archiveFileName.set("${project.name}-${project.version}-src.zip")
    destinationDirectory.set(file("build/libs/"))
    from(".")
    exclude(file(".gitignore").readLines())
}
