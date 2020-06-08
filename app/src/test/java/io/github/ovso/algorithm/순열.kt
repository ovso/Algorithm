@file:Suppress("NonAsciiCharacters", "ClassName", "TestFunctionName")

package io.github.ovso.algorithm

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 순열 {
    @Test
    fun 순열을포함하는지여부() {
        val (s1, s2) = Pair("ab", "eidbaooo")

        fun solution(s1: String, s2: String): Boolean {
            return s2.contains(s1) || s2.contains(s1.reversed())
        }

        println(solution(s1, s2))
    }
}