/*
 * Copyright (c) 2022 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.kmock.benchmark

import kotlin.js.JsName
import kotlin.test.Test
import org.kodein.mock.Mocker
import org.kodein.mock.UsesMocks
import tech.antibytes.kfixture.fixture
import tech.antibytes.kfixture.kotlinFixture
import tech.antibytes.util.test.coroutine.runBlockingTest

@UsesMocks(
    BenchmarkContract.Interface0::class,
    BenchmarkContract.Interface1::class,
    BenchmarkContract.Interface2::class,
    BenchmarkContract.Interface3::class,
    BenchmarkContract.Interface4::class,
    BenchmarkContract.Interface5::class,
    BenchmarkContract.Interface6::class,
    BenchmarkContract.Interface7::class,
    BenchmarkContract.Interface8::class,
    BenchmarkContract.Interface9::class,
    BenchmarkContract.Interface10::class,
    BenchmarkContract.Interface11::class,
    BenchmarkContract.Interface12::class,
    BenchmarkContract.Interface13::class,
    BenchmarkContract.Interface14::class,
    BenchmarkContract.Interface15::class,
    BenchmarkContract.Interface16::class,
    BenchmarkContract.Interface17::class,
    BenchmarkContract.Interface18::class,
    BenchmarkContract.Interface19::class,
    BenchmarkContract.Interface20::class,
    BenchmarkContract.Interface21::class,
    BenchmarkContract.Interface22::class,
    BenchmarkContract.Interface23::class,
    BenchmarkContract.Interface24::class,
    BenchmarkContract.Interface25::class,
    BenchmarkContract.Interface26::class,
    BenchmarkContract.Interface27::class,
    BenchmarkContract.Interface28::class,
    BenchmarkContract.Interface29::class,
    BenchmarkContract.Interface30::class,
    BenchmarkContract.Interface31::class,
    BenchmarkContract.Interface32::class,
    BenchmarkContract.Interface33::class,
    BenchmarkContract.Interface34::class,
    BenchmarkContract.Interface35::class,
    BenchmarkContract.Interface36::class,
    BenchmarkContract.Interface37::class,
    BenchmarkContract.Interface38::class,
    BenchmarkContract.Interface39::class,
    BenchmarkContract.Interface40::class,
    BenchmarkContract.Interface41::class,
    BenchmarkContract.Interface42::class,
    BenchmarkContract.Interface43::class,
    BenchmarkContract.Interface44::class,
    BenchmarkContract.Interface45::class,
    BenchmarkContract.Interface46::class,
    BenchmarkContract.Interface47::class,
    BenchmarkContract.Interface48::class,
    BenchmarkContract.Interface49::class,
)
class BenchmarkSpec {
    private val fixture = kotlinFixture()

    @Test
    @JsName("fn0")
    fun `It runs Interface0`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface0(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn1")
    fun `It runs Interface1`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface1(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn2")
    fun `It runs Interface2`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface2(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn3")
    fun `It runs Interface3`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface3(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn4")
    fun `It runs Interface4`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface4(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn5")
    fun `It runs Interface5`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface5(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn6")
    fun `It runs Interface6`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface6(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn7")
    fun `It runs Interface7`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface7(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn8")
    fun `It runs Interface8`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface8(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn9")
    fun `It runs Interface9`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface9(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn10")
    fun `It runs Interface10`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface10(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn11")
    fun `It runs Interface11`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface11(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn12")
    fun `It runs Interface12`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface12(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn13")
    fun `It runs Interface13`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface13(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn14")
    fun `It runs Interface14`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface14(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn15")
    fun `It runs Interface15`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface15(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn16")
    fun `It runs Interface16`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface16(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn17")
    fun `It runs Interface17`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface17(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn18")
    fun `It runs Interface18`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface18(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn19")
    fun `It runs Interface19`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface19(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn20")
    fun `It runs Interface20`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface20(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn21")
    fun `It runs Interface21`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface21(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn22")
    fun `It runs Interface22`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface22(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn23")
    fun `It runs Interface23`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface23(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn24")
    fun `It runs Interface24`() {
        // Given
        val mocker = Mocker()
        val instance = MockInterface24(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.every { instance.doSomething() } returns fixture.fixture()
        mocker.every { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doAnything() } returns fixture.fixture()
        mocker.every { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.every { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verify {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn25")
    fun `It runs Interface25`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface25(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn26")
    fun `It runs Interface26`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface26(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn27")
    fun `It runs Interface27`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface27(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn28")
    fun `It runs Interface28`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface28(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn29")
    fun `It runs Interface29`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface29(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn30")
    fun `It runs Interface30`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface30(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn31")
    fun `It runs Interface31`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface31(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn32")
    fun `It runs Interface32`() = runBlockingTest {
        // Givens
        val mocker = Mocker()
        val instance = MockInterface32(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn33")
    fun `It runs Interface33`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface33(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn34")
    fun `It runs Interface34`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface34(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn35")
    fun `It runs Interface35`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface35(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn36")
    fun `It runs Interface36`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface36(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn37")
    fun `It runs Interface37`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface37(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn38")
    fun `It runs Interface38`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface38(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn39")
    fun `It runs Interface39`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface39(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn40")
    fun `It runs Interface40`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface40(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn41")
    fun `It runs Interface41`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface41(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn42")
    fun `It runs Interface42`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface42(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn43")
    fun `It runs Interface43`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface43(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn44")
    fun `It runs Interface44`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface44(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn45")
    fun `It runs Interface45`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface45(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn46")
    fun `It runs Interface46`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface46(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn47")
    fun `It runs Interface47`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface47(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn48")
    fun `It runs Interface48`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface48(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }

    @Test
    @JsName("fn49")
    fun `It runs Interface49`() = runBlockingTest {
        // Given
        val mocker = Mocker()
        val instance = MockInterface49(mocker)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        mocker.everySuspending { instance.doSomething() } returns fixture.fixture()
        mocker.everySuspending { instance.doSomethingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doAnything() } returns fixture.fixture()
        mocker.everySuspending { instance.doAnythingElse(isAny(), isAny()) } returns fixture.fixture()
        mocker.everySuspending { instance.doNothing() } returns fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        mocker.verifyWithSuspend {
            instance.doSomething()
            instance.doSomethingElse(arg0, arg1)
            instance.doAnything()
            instance.doAnythingElse(arg0, arg1)
            instance.doNothing()
        }
    }
}
