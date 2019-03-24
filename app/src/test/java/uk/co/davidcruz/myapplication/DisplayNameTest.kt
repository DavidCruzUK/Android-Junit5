package uk.co.davidcruz.myapplication

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Testing a static useless list of names")
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

}