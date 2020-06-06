@file:Suppress("NonAsciiCharacters", "ClassName")

package io.github.ovso.algorithm

import io.reactivex.rxjava3.core.Observable
import org.junit.Test

import org.junit.Assert.*
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 배열에서위치찾기 {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
        val a = arrayOf(1,2,3,4)
        println(a.indexOf(4))
        println(Arrays.binarySearch(a, 4))
    }
}