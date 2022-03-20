/*
 * Copyright (c) 2022 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.kmock.benchmark.dependency

object Dependency {
    val gradle = GradlePlugin
    val antibytes = AntiBytes

    val mockmp = MocKMP

    object MocKMP {
        const val runtime = "org.kodein.mock:mockmp-runtime:${Version.mockmp.core}"
        const val processor = "org.kodein.mock:mockmp-processor:${Version.mockmp.core}"
    }

    val mockative = Mockative

    object Mockative {
        const val runtime = "io.mockative:mockative:${Version.mockative.core}"
        const val processor = "io.mockative:mockative-processor:${Version.mockative.core}"
    }

    object AntiBytes {
        val gradle = Gradle

        object Gradle {
            val kmock = "tech.antibytes.kmock-gradle:kmock:${Version.antibytes.kmock}"
        }

        val test = Test

        object Test {
            val kmp = KmpTest

            object KmpTest {
                const val core = "tech.antibytes.test-utils-kmp:test-utils:${Version.antibytes.test}"
                const val coroutine = "tech.antibytes.test-utils-kmp:test-utils-coroutine:${Version.antibytes.test}"
                const val fixture = "tech.antibytes.test-utils-kmp:test-utils-fixture:${Version.antibytes.test}"
                const val kmock = "tech.antibytes.kmock:kmock:${Version.antibytes.kmock}"
            }

            val jvm = JvmTest

            object JvmTest {
                const val core = "tech.antibytes.test-utils-kmp:test-utils-jvm:${Version.antibytes.test}"
                const val coroutine = "tech.antibytes.test-utils-kmp:test-utils-coroutine:${Version.antibytes.test}"
                const val fixture = "tech.antibytes.test-utils-kmp:test-utils-fixture-jvm:${Version.antibytes.test}"
                const val kmock = "tech.antibytes.kmock:kmock-jvm:${Version.antibytes.kmock}"
            }
        }
    }
}
