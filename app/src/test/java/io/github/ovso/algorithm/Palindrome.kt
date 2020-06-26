@file:Suppress("NonAsciiCharacters", "ClassName", "TestFunctionName")

package io.github.ovso.algorithm

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class Palindrome {
    @Test
    fun main() {
//        println(solution("abcdcba"))
        val solution = solution("abcdcba")
        println("solution = $solution")

    }

    private fun solution(s: String): Int {
        var answer = 1
        val len = s.length
        val a = s.toCharArray()
        val dp = Array(len) { IntArray(len) }

        // 1. 1자리
        for (i in 0 until len) dp[i][i] = 1

        // 2. 2자리
        for (i in 0 until len - 1) {
            if (a[i] == a[i + 1]) {
                dp[i][i + 1] = 1
                answer = 2
            }
        }
        // 3. 3자리 이상
        for (k in 3..len) {
            for (i in 0..len - k) {
                val j = i + k - 1 // k길이 만큼 떨어진 index
                if (a[i] == a[j] && dp[i + 1][j - 1] == 1
                ) { // 문자열이 같고, [i-1][j+1] 가 팰린드롬이라면
                    dp[i][j] = 1
                    answer = Math.max(answer, k)
                }
            }
        }
        return answer
    }

}

//https://velog.io/@sa833591/%EA%B0%80%EC%9E%A5-%EA%B8%B4-%ED%8C%B0%EB%A6%B0%EB%93%9C%EB%A1%AC-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-Lv.3