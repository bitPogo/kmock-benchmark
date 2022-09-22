/*
 * Copyright (c) 2022 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

import tech.antibytes.gradle.dependency.Dependency
import tech.antibytes.kmock.benchmark.dependency.Dependency as LocalDependency
import tech.antibytes.gradle.kmock.KMockExtension
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile
import org.jetbrains.kotlin.gradle.tasks.KotlinTest
import org.jetbrains.kotlin.gradle.tasks.KotlinNativeCompile
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import tech.antibytes.gradle.configuration.ensureIosDeviceCompatibility
import tech.antibytes.gradle.configuration.isIdea

plugins {
    id("org.jetbrains.kotlin.multiplatform")

    // Android
    id("com.android.library")

    id("tech.antibytes.gradle.configuration")

    id("tech.antibytes.kmock.kmock-gradle") apply false
}

kotlin {
    android()

    js(IR) {
        nodejs()
        browser()
    }

    jvm()

    ios()
    iosSimulatorArm64()
    ensureIosDeviceCompatibility()

    sourceSets {
        all {
            languageSettings.apply {
                optIn("kotlin.ExperimentalUnsignedTypes")
                optIn("kotlin.RequiresOptIn")
            }
        }

        val commonMain by getting {
            dependencies {
                implementation(Dependency.multiplatform.kotlin.common)
                implementation(Dependency.multiplatform.coroutines.common)
                implementation(Dependency.multiplatform.stately.isolate)
                implementation(Dependency.multiplatform.stately.concurrency)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(Dependency.multiplatform.test.common)
                implementation(Dependency.multiplatform.test.annotations)

                implementation(LocalDependency.antibytes.test.kmp.core)
                implementation(LocalDependency.antibytes.test.kmp.coroutine)
                implementation(LocalDependency.antibytes.test.kmp.fixture)
                implementation(LocalDependency.antibytes.test.kmp.kmock)
            }
        }

        val androidMain by getting {
            dependencies {
                implementation(Dependency.multiplatform.kotlin.android)
            }
        }
        if (!isIdea()) {
            val androidAndroidTestRelease by getting
            val androidAndroidTest by getting {
                dependsOn(androidAndroidTestRelease)
            }
            val androidTestFixturesDebug by getting
            val androidTestFixturesRelease by getting

            val androidTestFixtures by getting {
                dependsOn(androidTestFixturesDebug)
                dependsOn(androidTestFixturesRelease)
            }

            val androidTest by getting {
                dependsOn(androidTestFixtures)
            }
        }
        val androidTest by getting {
            dependencies {
                implementation(Dependency.multiplatform.test.jvm)
                implementation(Dependency.multiplatform.test.junit)
                implementation(Dependency.android.test.robolectric)
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(Dependency.multiplatform.kotlin.js)
                implementation(Dependency.js.nodejs)
            }
        }
        val jsTest by getting {
            dependsOn(commonTest)
            dependencies {
                implementation(Dependency.multiplatform.test.js)
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(Dependency.multiplatform.kotlin.jdk8)
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(Dependency.multiplatform.test.jvm)
                implementation(Dependency.multiplatform.test.junit)
            }
        }

        val iosMain by getting
        val iosTest by getting
    }
}

val beforeTest = closureOf<Any> {
    logger.warn("KMOCK_BENCHMARK_TEST_START: ${System.currentTimeMillis()}")
}

val afterTest = closureOf<Any> {
    logger.warn("KMOCK_BENCHMARK_TEST_END: ${System.currentTimeMillis()}")
}

abstract class Benchmark @Inject constructor(
    private val logName: String
) : DefaultTask() {
    @TaskAction
    fun run() {
        project.logger.warn("KMOCK_BENCHMARK_${logName}: ${System.currentTimeMillis()}")
    }
}

tasks.withType(KotlinTest::class.java) {
    this.beforeSuite(beforeTest)
    this.afterSuite(afterTest)
}

tasks.withType(Test::class.java) {
    this.beforeSuite(beforeTest)
    this.afterSuite(afterTest)
}

tasks.withType(KotlinCompile::class.java) {
    val taskName = name.toUpperCase()
    val benchmark: Benchmark = tasks.create(
        "benchmark$taskName",
        Benchmark::class.java,
        taskName
    )
    benchmark.group = "Benchmark"

    dependsOn(benchmark)
    mustRunAfter(benchmark)
}

tasks.withType(KotlinNativeCompile::class.java) {
    val taskName = name.toUpperCase()
    val benchmark: Benchmark = tasks.create(
        "benchmark$taskName",
        Benchmark::class.java,
        taskName
    )
    benchmark.group = "Benchmark"

    dependsOn(benchmark)
    mustRunAfter(benchmark)
}

tasks.withType(Kotlin2JsCompile::class.java) {
    val taskName = name.toUpperCase()
    val benchmark: Benchmark = tasks.create(
        "benchmark$taskName",
        Benchmark::class.java,
        taskName
    )
    benchmark.group = "Benchmark"

    dependsOn(benchmark)
    mustRunAfter(benchmark)
}

plugins.apply("tech.antibytes.kmock.kmock-gradle")

project.extensions.configure<KMockExtension>("kmock") {
    rootPackage = "tech.antibytes.kmock.benchmark"
}

afterEvaluate {
    tasks.getByName("kspTestKotlinIosX64") {
        doLast {
            project.logger.warn("KMOCK_BENCHMARK_KSP_START: ${System.currentTimeMillis()}")
        }
        doLast {
            project.logger.warn("KMOCK_BENCHMARK_KSP_END: ${System.currentTimeMillis()}")
        }
    }

    tasks.getByName("kspTestKotlinJvm") {
        doLast {
            project.logger.warn("KMOCK_BENCHMARK_KSP_START: ${System.currentTimeMillis()}")
        }
        doLast {
            project.logger.warn("KMOCK_BENCHMARK_KSP_END: ${System.currentTimeMillis()}")
        }
    }

    tasks.getByName("kspTestKotlinJs") {
        doLast {
            project.logger.warn("KMOCK_BENCHMARK_KSP_START: ${System.currentTimeMillis()}")
        }
        doLast {
            project.logger.warn("KMOCK_BENCHMARK_KSP_END: ${System.currentTimeMillis()}")
        }
    }
}
