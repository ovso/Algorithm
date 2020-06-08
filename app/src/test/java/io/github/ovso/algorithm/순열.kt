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

    @Test
    fun 정수_순열구하기() {
        fun print(arr: IntArray, k: Int) {
            for (i in 0 until k) {
                if (i == k - 1) println(arr[i]) else print(arr[i].toString() + ",")
            }
        }

        fun swap(arr: IntArray, i: Int, j: Int) {
            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
        }

        fun permutation(arr: IntArray, depth: Int, n: Int, k: Int) {
            if (depth == k) { // 한번 depth 가 k로 도달하면 사이클이 돌았음. 출력함.
                print(arr, k)
                return
            }
            for (i in depth until n) {
                swap(arr, i, depth)
                permutation(arr, depth + 1, n, k)
                swap(arr, i, depth)
            }
        }

        val arr = intArrayOf(1, 2, 3, 4)
        permutation(arr, 0, 4, 4)
    }

    @Test
    fun 문자_순열구하() {
        fun permutation(chars: CharArray, depth: Int, r: Int) {
            if (depth == r) {
                for (i in 0 until r) {
                    print(chars[i].toString() + "\t")
                }
                println()
                return
            }
            for (i in depth until chars.size) {
                val tmp = chars[depth]
                chars[depth] = chars[i]
                chars[i] = tmp

                permutation(chars, depth + 1, r)

                // 스왑한거 다시 되돌리기
                chars[i] = chars[depth]
                chars[depth] = tmp
            }
        }

        val chars = charArrayOf('a', 'b', 'c', 'd')
        permutation(chars, 0, 3)

    }

}