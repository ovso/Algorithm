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
class 검색알고리즘 {
    @Test
    fun solution() {
        val a = arrayOf(89, 57, 91, 47, 95, 3, 27, 22, 67, 99)
        assert(linearSearch(a, 67) == 8)
        assert(linearSearch(a, 11) == -1)
    }

    // 선형검색
    private fun linearSearch(arr: Array<Int>, elementToSearch: Int): Int {
        arr.forEachIndexed { index, element ->
            if (element == elementToSearch) return index
        }
        return -1
    }

    // 이진검색
    private fun binarySearch(arr: Array<Int>, elementToSearch: Int): Int {
        arr.forEachIndexed { index, element ->
            if (element == elementToSearch) return index
        }
        return -1
    }
}

// https://stackabuse.com/search-algorithms-in-java/