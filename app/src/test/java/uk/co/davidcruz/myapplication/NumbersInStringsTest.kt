package uk.co.davidcruz.myapplication

import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

class NumbersInStringsTest {

    @Test
    fun stringCanBeIntOrNull() {
        val yearOfBirth = "1983"
        val dayOfBirth = "Twelve"

        assertNotNull(yearOfBirth.toIntOrNull())
        assertNull(dayOfBirth.toIntOrNull())
    }

}