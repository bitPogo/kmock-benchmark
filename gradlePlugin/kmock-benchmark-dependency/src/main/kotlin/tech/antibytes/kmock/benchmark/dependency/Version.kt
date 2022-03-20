/*
 * Copyright (c) 2022 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.kmock.benchmark.dependency

object Version {

    val gradle = Gradle

    object Gradle {
        /**
         * [AnitBytes GradlePlugins](https://github.com/bitPogo/gradle-plugins)
         */
        const val antibytes = "ed855ae"

        /**
         * [Spotless](https://plugins.gradle.org/plugin/com.diffplug.gradle.spotless)
         */
        const val spotless = "6.3.0"
    }

    val antibytes = Antibytes

    object Antibytes {
        const val test = "c3e5acf"

        /**
         * [KMock](https://github.com/bitPogo/kmock)
         */
        const val kmock = "980554b"
    }

    val mockmp = MocKMP

    object MocKMP {
        /**
         * https://github.com/Kodein-Framework/MocKMP/releases
         */
        const val core = "1.3.0"
    }

    val mockative = Mockative

    object Mockative {
        /**
         * https://github.com/mockative/mockative/releases
         */
        const val core = "1.1.4"
    }
}