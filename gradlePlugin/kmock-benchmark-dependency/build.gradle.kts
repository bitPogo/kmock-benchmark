/*
 * Copyright (c) 2022 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

// To make it available as direct dependency
group = "tech.antibytes.kmock.benchmark.dependency"
version = "1.0.0-SNAPSHOT"

repositories {
    gradlePluginPortal()
    mavenCentral()
    google()
}

gradlePlugin {
    plugins.register("tech.antibytes.kmock.benchmark.dependency") {
        id = "tech.antibytes.kmock.benchmark.dependency"
        implementationClass = "tech.antibytes.kmock.benchmark.dependency.DependencyPlugin"
    }
}
