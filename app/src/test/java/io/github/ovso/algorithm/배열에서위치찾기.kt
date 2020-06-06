@file:Suppress("NonAsciiCharacters", "ClassName", "TestFunctionName")

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
    fun 순차찾기() {
        val a = arrayOf(1, 2, 3, 4)
        assert(linearSearch(a, 4) == 3)
        assert(linearSearch(a, 3) == 2)
        assert(linearSearch(a, 2) == 1)
        assert(linearSearch(a, 1) == 0)
    }

    private fun linearSearch(arr: Array<Int>, elementToSearch: Int): Int {
        arr.forEachIndexed { index, element ->
            if (element == elementToSearch) return index
        }
        return -1
    }
}