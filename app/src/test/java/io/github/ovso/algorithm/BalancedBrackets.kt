package io.github.ovso.algorithm

import org.junit.Test

class BalancedBrackets {
    @Test
    fun main() {
        assert(solution1("aabbaa"))
        assert(solution1("abaabbaaba"))
        assert(solution2("abaabbaaba"))
        assert(solution2("cccccccccc"))
    }

    private fun solution1(s: String): Boolean {
        return s.reversed() == s
    }

    private fun solution2(palindrome: String): Boolean {
        val lastIndex = palindrome.lastIndex
        val untilAt = palindrome.count() / 2
        for (startIndex in 0 until untilAt) {
            val endIndex = lastIndex - startIndex
            println("${palindrome[startIndex]} - ${palindrome[endIndex]} : $startIndex - $endIndex")
            if (palindrome[startIndex] != palindrome[endIndex]) {
                return false
            }
        }
        return true
    }

}