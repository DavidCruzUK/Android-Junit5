package uk.co.davidcruz.myapplication

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals

/**
 * You can use @BeforeAll and @AfterAll in two different ways:
 * 1. Inside of a companion object with the annotation @JvmStatic (Commented code)
 * 2. Adding @TestInstance(TestInstance.Lifecycle.PER_CLASS) above the class (Applied)
 */

//@TestInstance(TestInstance.Lifecycle.PER_METHOD) /* Way 1 Default */
@TestInstance(TestInstance.Lifecycle.PER_CLASS) /* Way 2 */
class LifecycleTest {

//    /* Way 1 - Start* /
//    companion object {
//
//        @JvmStatic
//        @BeforeAll
//        fun beforeAllTest() {
//            println("1. this is execute before @BeforeEach in case this exist")
//        }
//
//        @JvmStatic
//        @AfterAll
//        fun afterAllTest() {
//            println("4. this will be execute in he end after latest @AfterEach in case this exist")
//        }
//    }
//    /* Way 1 - End */

    /* Way 2 - Start */
    @BeforeAll
    fun beforeAllTest() {
        println("1. this is execute before @BeforeEach in case this exist")
    }

    @AfterAll
    fun afterAllTest() {
        println("4. this will be execute in he end after latest @AfterEach in case this exist")
    }
    /* Way 2 - End */

    @BeforeEach
    fun beforeEachTest() {
        println("2. this is execute before each Unit Test in this file")
    }

    @AfterEach
    fun afterEachTest() {
        println("3. this is execute after each Unit Test in this file")
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2.add(2))
    }

}
