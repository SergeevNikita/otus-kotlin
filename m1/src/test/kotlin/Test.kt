import kotlin.math.pow
import kotlin.test.Test
import kotlin.test.assertEquals

class Test {
    @Test
    fun test() {
        val value = 2.0
        val result = value.pow(10)
        assertEquals(1024.0, result)
    }
}