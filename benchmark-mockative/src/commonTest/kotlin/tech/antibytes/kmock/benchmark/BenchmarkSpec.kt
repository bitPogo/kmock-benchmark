/*
 * Copyright (c) 2022 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.kmock.benchmark

import io.mockative.Mock
import io.mockative.any
import io.mockative.classOf
import io.mockative.fun1
import io.mockative.given
import io.mockative.mock
import io.mockative.time
import io.mockative.verify
import kotlin.js.JsName
import kotlin.test.Test
import tech.antibytes.kfixture.fixture
import tech.antibytes.kfixture.kotlinFixture
import tech.antibytes.util.test.coroutine.runBlockingTest

class BenchmarkSpec {
    private val fixture = kotlinFixture()

    @Mock
    val instance0: Interface0 = mock(classOf<Interface0>())

    @Mock
    val instance1: Interface1 = mock(classOf<Interface1>())

    @Mock
    val instance2: Interface2 = mock(classOf<Interface2>())

    @Mock
    val instance3: Interface3 = mock(classOf<Interface3>())

    @Mock
    val instance4: Interface4 = mock(classOf<Interface4>())

    @Mock
    val instance5: Interface5 = mock(classOf<Interface5>())

    @Mock
    val instance6: Interface6 = mock(classOf<Interface6>())

    @Mock
    val instance7: Interface7 = mock(classOf<Interface7>())

    @Mock
    val instance8: Interface8 = mock(classOf<Interface8>())

    @Mock
    val instance9: Interface9 = mock(classOf<Interface9>())

    @Mock
    val instance10: Interface10 = mock(classOf<Interface10>())

    @Mock
    val instance11: Interface11 = mock(classOf<Interface11>())

    @Mock
    val instance12: Interface12 = mock(classOf<Interface12>())

    @Mock
    val instance13: Interface13 = mock(classOf<Interface13>())

    @Mock
    val instance14: Interface14 = mock(classOf<Interface14>())

    @Mock
    val instance15: Interface15 = mock(classOf<Interface15>())

    @Mock
    val instance16: Interface16 = mock(classOf<Interface16>())

    @Mock
    val instance17: Interface17 = mock(classOf<Interface17>())

    @Mock
    val instance18: Interface18 = mock(classOf<Interface18>())

    @Mock
    val instance19: Interface19 = mock(classOf<Interface19>())

    @Mock
    val instance20: Interface20 = mock(classOf<Interface20>())

    @Mock
    val instance21: Interface21 = mock(classOf<Interface21>())

    @Mock
    val instance22: Interface22 = mock(classOf<Interface22>())

    @Mock
    val instance23: Interface23 = mock(classOf<Interface23>())

    @Mock
    val instance24: Interface24 = mock(classOf<Interface24>())

    @Mock
    val instance25: Interface25 = mock(classOf<Interface25>())

    @Mock
    val instance26: Interface26 = mock(classOf<Interface26>())

    @Mock
    val instance27: Interface27 = mock(classOf<Interface27>())

    @Mock
    val instance28: Interface28 = mock(classOf<Interface28>())

    @Mock
    val instance29: Interface29 = mock(classOf<Interface29>())

    @Mock
    val instance30: Interface30 = mock(classOf<Interface30>())

    @Mock
    val instance31: Interface31 = mock(classOf<Interface31>())

    @Mock
    val instance32: Interface32 = mock(classOf<Interface32>())

    @Mock
    val instance33: Interface33 = mock(classOf<Interface33>())

    @Mock
    val instance34: Interface34 = mock(classOf<Interface34>())

    @Mock
    val instance35: Interface35 = mock(classOf<Interface35>())

    @Mock
    val instance36: Interface36 = mock(classOf<Interface36>())

    @Mock
    val instance37: Interface37 = mock(classOf<Interface37>())

    @Mock
    val instance38: Interface38 = mock(classOf<Interface38>())

    @Mock
    val instance39: Interface39 = mock(classOf<Interface39>())

    @Mock
    val instance40: Interface40 = mock(classOf<Interface40>())

    @Mock
    val instance41: Interface41 = mock(classOf<Interface41>())

    @Mock
    val instance42: Interface42 = mock(classOf<Interface42>())

    @Mock
    val instance43: Interface43 = mock(classOf<Interface43>())

    @Mock
    val instance44: Interface44 = mock(classOf<Interface44>())

    @Mock
    val instance45: Interface45 = mock(classOf<Interface45>())

    @Mock
    val instance46: Interface46 = mock(classOf<Interface46>())

    @Mock
    val instance47: Interface47 = mock(classOf<Interface47>())

    @Mock
    val instance48: Interface48 = mock(classOf<Interface48>())

    @Mock
    val instance49: Interface49 = mock(classOf<Interface49>())

    @Test
    @JsName("fn0")
    fun `It runs Interface0`() {
        // Given
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        val instance = instance0

        given(instance).function(instance::doSomething, fun1<Any?>()).whenInvokedWith(any()).then { 42 }
        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn1")
    fun `It runs Interface1`() {
        // Given
        val instance = instance1
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn2")
    fun `It runs Interface2`() {
        // Given
        val instance = instance2
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn3")
    fun `It runs Interface3`() {
        // Given
        val instance = instance3
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn4")
    fun `It runs Interface4`() {
        // Given
        val instance = instance4
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn5")
    fun `It runs Interface5`() {
        // Given
        val instance = instance5
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn6")
    fun `It runs Interface6`() {
        // Given
        val instance = instance6
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn7")
    fun `It runs Interface7`() {
        // Given
        val instance = instance7
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn8")
    fun `It runs Interface8`() {
        // Given
        val instance = instance8
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn9")
    fun `It runs Interface9`() {
        // Given
        val instance = instance9
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn10")
    fun `It runs Interface10`() {
        // Given
        val instance = instance10
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn11")
    fun `It runs Interface11`() {
        // Given
        val instance = instance11
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn12")
    fun `It runs Interface12`() {
        // Given
        val instance = instance12
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn13")
    fun `It runs Interface13`() {
        // Given
        val instance = instance13
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn14")
    fun `It runs Interface14`() {
        // Given
        val instance = instance14
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn15")
    fun `It runs Interface15`() {
        // Given
        val instance = instance15
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn16")
    fun `It runs Interface16`() {
        // Given
        val instance = instance16
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn17")
    fun `It runs Interface17`() {
        // Given
        val instance = instance17
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn18")
    fun `It runs Interface18`() {
        // Given
        val instance = instance18
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn19")
    fun `It runs Interface19`() {
        // Given
        val instance = instance19
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn20")
    fun `It runs Interface20`() {
        // Given
        val instance = instance20
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn21")
    fun `It runs Interface21`() {
        // Given
        val instance = instance21
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn22")
    fun `It runs Interface22`() {
        // Given
        val instance = instance22
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn23")
    fun `It runs Interface23`() {
        // Given
        val instance = instance23
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn24")
    fun `It runs Interface24`() {
        // Given
        val instance = instance24
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).invocation { doSomething() }.then { fixture.fixture() }
        given(instance).invocation { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doAnything() }.then { fixture.fixture() }
        given(instance).invocation { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).invocation { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).invocation { doSomething() }.wasInvoked(1.time)
        verify(instance).invocation { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doAnything() }.wasInvoked(1.time)
        verify(instance).invocation { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).invocation { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn25")
    fun `It runs Interface25`() = runBlockingTest {
        // Given
        val instance = instance25
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn26")
    fun `It runs Interface26`() = runBlockingTest {
        // Given
        val instance = instance26
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn27")
    fun `It runs Interface27`() = runBlockingTest {
        // Given
        val instance = instance27
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn28")
    fun `It runs Interface28`() = runBlockingTest {
        // Given
        val instance = instance28
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn29")
    fun `It runs Interface29`() = runBlockingTest {
        // Given
        val instance = instance29
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn30")
    fun `It runs Interface30`() = runBlockingTest {
        // Given
        val instance = instance30
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn31")
    fun `It runs Interface31`() = runBlockingTest {
        // Given
        val instance = instance31
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn32")
    fun `It runs Interface32`() = runBlockingTest {
        // Given
        val instance = instance32
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn33")
    fun `It runs Interface33`() = runBlockingTest {
        // Given
        val instance = instance33
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn34")
    fun `It runs Interface34`() = runBlockingTest {
        // Given
        val instance = instance34
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn35")
    fun `It runs Interface35`() = runBlockingTest {
        // Given
        val instance = instance35
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn36")
    fun `It runs Interface36`() = runBlockingTest {
        // Given
        val instance = instance36
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn37")
    fun `It runs Interface37`() = runBlockingTest {
        // Given
        val instance = instance37
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn38")
    fun `It runs Interface38`() = runBlockingTest {
        // Given
        val instance = instance38
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn39")
    fun `It runs Interface39`() = runBlockingTest {
        // Given
        val instance = instance39
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn40")
    fun `It runs Interface40`() = runBlockingTest {
        // Given
        val instance = instance40
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn41")
    fun `It runs Interface41`() = runBlockingTest {
        // Given
        val instance = instance41
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn42")
    fun `It runs Interface42`() = runBlockingTest {
        // Given
        val instance = instance42
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn43")
    fun `It runs Interface43`() = runBlockingTest {
        // Given
        val instance = instance43
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn44")
    fun `It runs Interface44`() = runBlockingTest {
        // Given
        val instance = instance44
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn45")
    fun `It runs Interface45`() = runBlockingTest {
        // Given
        val instance = instance45
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn46")
    fun `It runs Interface46`() = runBlockingTest {
        // Given
        val instance = instance46
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn47")
    fun `It runs Interface47`() = runBlockingTest {
        // Given
        val instance = instance47
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn48")
    fun `It runs Interface48`() = runBlockingTest {
        // Given
        val instance = instance48
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }

    @Test
    @JsName("fn49")
    fun `It runs Interface49`() = runBlockingTest {
        // Given
        val instance = instance49
        val arg0: Int = fixture.fixture()
        val arg1: Any = fixture.fixture()

        given(instance).coroutine { doSomething() }.then { fixture.fixture() }
        given(instance).coroutine { doSomethingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doAnything() }.then { fixture.fixture() }
        given(instance).coroutine { doAnythingElse(arg0, arg1) }.then { fixture.fixture() }
        given(instance).coroutine { doNothing() }.then { fixture.fixture() }

        // When
        instance.doSomething()
        instance.doSomethingElse(arg0, arg1)
        instance.doAnything()
        instance.doAnythingElse(arg0, arg1)
        instance.doNothing()

        // Then
        verify(instance).coroutine { doSomething() }.wasInvoked(1.time)
        verify(instance).coroutine { doSomethingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doAnything() }.wasInvoked(1.time)
        verify(instance).coroutine { doAnythingElse(arg0, arg1) }.wasInvoked(1.time)
        verify(instance).coroutine { doNothing() }.wasInvoked(1.time)
    }
}
