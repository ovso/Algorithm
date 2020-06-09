@file:Suppress("NonAsciiCharacters", "ClassName", "TestFunctionName", "SpellCheckingInspection")

package io.github.ovso.algorithm

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 문자열 {
    @Test
    fun 문자열s의길이가4혹은6이고숫자로만구성되있는지확인해주는함수solution을완성하세요() {
        fun solution(input: String): Boolean {
            if (input.count() == 4 || input.count() == 6) {
                input.toIntOrNull()?.let {
                    return true
                }
            }
            return false
        }

        val input = "12345"
        println(solution(input))
//        println(solution(input))
    }
}