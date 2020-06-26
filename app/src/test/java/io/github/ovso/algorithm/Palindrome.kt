package io.github.ovso.algorithm

import org.junit.Test

class Palindrome {
    @Test
    fun main() {
        assert(solution1("aabbaa"))
        assert(solution1("abaabbaaba"))
        assert(solution2("abaabbaaba"))
    }

    private fun solution1(s: String): Boolean {
        return s.reversed() == s
    }

    private fun solution2(s: String): Boolean {
        return true
    }

}