package dev.forkhandles.tuples

import com.natpryce.hamkrest.absent
import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class TupleExampleTest {
    @Test
    fun `appending tuples`() {
        assertThat(tuple(1, 2, 3, 4, 5) + tuple(6, 7, 8), equalTo(tuple(1, 2, 3, 4, 5, 6, 7, 8)))
    }

    @Test
    fun `to lists`() {
        assertThat(tuple(1, 2, 3, 4, 5).toList(), equalTo(listOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun `from lists`() {
        val list: List<Int> = listOf(1, 2, 3, 4)

        assertThat(list.toTuple2(), equalTo(tuple<Int?, Int?>(1, 2)))
        assertThat(list.toTuple3(), equalTo(tuple<Int?, Int?, Int?>(1, 2, 3)))
        assertThat(list.toTuple4(), equalTo(tuple<Int?, Int?, Int?, Int?>(1, 2, 3, 4)))
        assertThat(list.toTuple5(), equalTo(tuple<Int?, Int?, Int?, Int?, Int?>(1, 2, 3, 4, null)))
        assertThat(list.toTuple6(), equalTo(tuple<Int?, Int?, Int?, Int?, Int?, Int?>(1, 2, 3, 4, null, null)))
    }

    @Test
    fun `null to non-null`() {
        val t: Tuple4<Int?, Int?, Int?, Int?> = tuple(1, 2, 3, 4)

        assertThat(t.allNonNull(), equalTo(t))
        assertThat(t.copy(val2 = null).allNonNull(), absent())
    }

    @Test
    fun `non-null to null`() {
        val t1: Tuple4<Int, Int, Int, Int> = tuple(1, 2, 3, 4)
        val t2: Tuple4<Int?, Int?, Int?, Int?> = t1
        val t3: Tuple4<Int?, Int?, Int?, Int?> = t2.copy(val1 = null)
        val t4: Tuple4<Int?, Int?, Int?, Int?> = t1.asNullable().copy(val1 = null)

        assertThat(t4, equalTo(t3))
    }
    
    @Test
    fun contains() {
        assertTrue(0 !in tuple(1,2,3))
        assertTrue(1 in tuple(1,2,3))
        assertTrue(2 in tuple(1,2,3))
        assertTrue(3 in tuple(1,2,3))
        assertTrue(4 !in tuple(1,2,3))
        
        assertTrue("x" in tuple("x","y"))
        assertTrue("z" !in tuple("x","y"))
    }
    
    @Test
    fun `destructuring nullable tuple`() {
        @Suppress("RedundantNullableReturnType")
        val a : Tuple2<String,Int>? = tuple("A", 1)
        val (a1,a2) = a
        assertEquals("A", a1)
        assertEquals(1, a2)
        
        val b : Tuple2<String,Int>? = null
        val (b1,b2) = b
        assertNull(b1)
        assertNull(b2)
    }
}
