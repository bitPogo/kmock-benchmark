/*
 * Copyright (c) 2022 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.kmock.benchmark

import kotlin.js.JsName
import kotlin.test.Test
import tech.antibytes.kfixture.fixture
import tech.antibytes.kfixture.kotlinFixture
import tech.antibytes.kmock.KMock
import tech.antibytes.kmock.KMockExperimental
import tech.antibytes.kmock.verification.Verifier
import tech.antibytes.kmock.verification.assertOrder
import tech.antibytes.util.test.coroutine.runBlockingTest

@OptIn(KMockExperimental::class)
@KMock(
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
        val verifier = Verifier()
        val instance: Interface0Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn1")
    fun `It runs Interface1`() {
        // Given
        val verifier = Verifier()
        val instance: Interface1Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn2")
    fun `It runs Interface2`() {
        // Given
        val verifier = Verifier()
        val instance: Interface2Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn3")
    fun `It runs Interface3`() {
        // Given
        val verifier = Verifier()
        val instance: Interface3Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn4")
    fun `It runs Interface4`() {
        // Given
        val verifier = Verifier()
        val instance: Interface4Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn5")
    fun `It runs Interface5`() {
        // Given
        val verifier = Verifier()
        val instance: Interface5Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn6")
    fun `It runs Interface6`() {
        // Given
        val verifier = Verifier()
        val instance: Interface6Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn7")
    fun `It runs Interface7`() {
        // Given
        val verifier = Verifier()
        val instance: Interface7Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn8")
    fun `It runs Interface8`() {
        // Given
        val verifier = Verifier()
        val instance: Interface8Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn9")
    fun `It runs Interface9`() {
        // Given
        val verifier = Verifier()
        val instance: Interface9Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn10")
    fun `It runs Interface10`() {
        // Given
        val verifier = Verifier()
        val instance: Interface10Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn11")
    fun `It runs Interface11`() {
        // Given
        val verifier = Verifier()
        val instance: Interface11Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn12")
    fun `It runs Interface12`() {
        // Given
        val verifier = Verifier()
        val instance: Interface12Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn13")
    fun `It runs Interface13`() {
        // Given
        val verifier = Verifier()
        val instance: Interface13Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn14")
    fun `It runs Interface14`() {
        // Given
        val verifier = Verifier()
        val instance: Interface14Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn15")
    fun `It runs Interface15`() {
        // Given
        val verifier = Verifier()
        val instance: Interface15Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn16")
    fun `It runs Interface16`() {
        // Given
        val verifier = Verifier()
        val instance: Interface16Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn17")
    fun `It runs Interface17`() {
        // Given
        val verifier = Verifier()
        val instance: Interface17Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn18")
    fun `It runs Interface18`() {
        // Given
        val verifier = Verifier()
        val instance: Interface18Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn19")
    fun `It runs Interface19`() {
        // Given
        val verifier = Verifier()
        val instance: Interface19Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn20")
    fun `It runs Interface20`() {
        // Given
        val verifier = Verifier()
        val instance: Interface20Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn21")
    fun `It runs Interface21`() {
        // Given
        val verifier = Verifier()
        val instance: Interface21Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn22")
    fun `It runs Interface22`() {
        // Given
        val verifier = Verifier()
        val instance: Interface22Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn23")
    fun `It runs Interface23`() {
        // Given
        val verifier = Verifier()
        val instance: Interface23Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn24")
    fun `It runs Interface24`() {
        // Given
        val verifier = Verifier()
        val instance: Interface24Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn25")
    fun `It runs Interface25`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface25Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn26")
    fun `It runs Interface26`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface26Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn27")
    fun `It runs Interface27`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface27Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn28")
    fun `It runs Interface28`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface28Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn29")
    fun `It runs Interface29`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface29Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn30")
    fun `It runs Interface30`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface30Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn31")
    fun `It runs Interface31`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface31Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn32")
    fun `It runs Interface32`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface32Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn33")
    fun `It runs Interface33`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface33Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn34")
    fun `It runs Interface34`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface34Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn35")
    fun `It runs Interface35`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface35Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn36")
    fun `It runs Interface36`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface36Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn37")
    fun `It runs Interface37`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface37Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn38")
    fun `It runs Interface38`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface38Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn39")
    fun `It runs Interface39`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface39Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn40")
    fun `It runs Interface40`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface40Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn41")
    fun `It runs Interface41`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface41Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn42")
    fun `It runs Interface42`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface42Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn43")
    fun `It runs Interface43`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface43Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn44")
    fun `It runs Interface44`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface44Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn45")
    fun `It runs Interface45`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface45Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn46")
    fun `It runs Interface46`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface46Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn47")
    fun `It runs Interface47`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface47Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn48")
    fun `It runs Interface48`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface48Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }

    @Test
    @JsName("fn49")
    fun `It runs Interface49`() = runBlockingTest {
        // Given
        val verifier = Verifier()
        val instance: Interface49Mock = kmock(collector = verifier)
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        instance._doSomething.returnValue = fixture.fixture()
        instance._doSomethingElse.returnValue = fixture.fixture()
        instance._doAnything.returnValue = fixture.fixture()
        instance._doAnythingElse.returnValue = fixture.fixture()
        instance._doNothing.returnValue = fixture.fixture()

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verifier.assertOrder {
            instance._doSomething.hasBeenStrictlyCalledWith()
            instance._doSomethingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doAnything.hasBeenStrictlyCalledWith()
            instance._doAnythingElse.hasBeenStrictlyCalledWith(arg0, arg1)
            instance._doNothing.hasBeenStrictlyCalledWith()
        }
    }
}
