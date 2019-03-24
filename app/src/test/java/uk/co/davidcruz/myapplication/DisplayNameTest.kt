package uk.co.davidcruz.myapplication

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Testing a static useless list of names using Assert")
class DisplayNameTest {

    private val listOfNames = listOf("David", "Paul", "Jessica", "Abdul")

    @DisplayName("Given a name, when this IS included in the list")
    @Test
    fun nameIsInTheListTest() {
        val nameToSearch = "David"
        assertTrue(nameToSearch in listOfNames)
    }

    @DisplayName("Given a name, when this IS NOT included in the list")
    @Test
    fun nameIsInNotTheListTest() {
        val nameToSearch = "Raul"
        assertFalse(nameToSearch in listOfNames)
    }

    /**
     * Note:
     * Using Assertions.assertEquals() is like using in java: name1.equals(name2)
     * Using Assertions.assertSame() is like using in java: name1 == name2
     */

    @DisplayName("Given a two variables with same value, when assertSame() will fail")
    @Test
    fun testTwoDifferentVariablesWithSameValue() {
        val nameToCompare = listOfNames[1]
        val secondNameToCompare = listOfNames[1]
        assertEquals(nameToCompare, secondNameToCompare, "Is not Equals")
    }

}