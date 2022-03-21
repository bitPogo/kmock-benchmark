/*
 * Copyright (c) 2022 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}

includeBuild("gradlePlugin/kmock-benchmark-dependency")

plugins {
    id("com.gradle.enterprise") version("3.7")
}

include(
    ":benchmark-kmock",
    ":benchmark-mockmp",
    ":benchmark-mockative",
)

buildCache {
    local {
        isEnabled = false
        directory = File(rootDir, "build-cache")
        removeUnusedEntriesAfterDays = 30
    }
}

rootProject.name = "kmock-benchmark"
