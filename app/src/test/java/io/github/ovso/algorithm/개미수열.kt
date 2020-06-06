@file:Suppress("NonAsciiCharacters", "ClassName")

package io.github.ovso.algorithm

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 개미수열 {
    @Test
    fun addition_isCorrect() {
        val input = "1"
        val loop = 1
        println(solution(input, loop))
    }

    private fun solution(input: String, loop: Int): String {
        if(input == "1") {
            return "11"
        }
        return input
    }
}