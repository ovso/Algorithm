@file:Suppress("NonAsciiCharacters", "ClassName", "TestFunctionName")

package io.github.ovso.algorithm

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 지그재그 {
    @Test
    fun main() {

        val n = 5
        val array = Array(n) { IntArray(n) }
        var count = 1

        var currentX = 0
        var currentY = 0

        array[currentX][currentY] = count++

        while (count <= n * n) {

            if (currentX + 1 < n) {
                currentX++
            } else {
                currentY++
            }
            array[currentX][currentY] = count++

            while (currentX - 1 > -1 && currentY + 1 < n) {
                array[--currentX][++currentY] = count++
            }

            if (currentY + 1 < n) {
                currentY++
            } else {
                currentX++
            }
            array[currentX][currentY] = count++


            while (currentY - 1 > -1 && currentX + 1 < n) {
                array[++currentX][--currentY] = count++
            }
        }

        for (xx in array) {
            for (nn in xx) {
                System.out.printf("%d ", nn)
            }
            println()
        }

    }

}