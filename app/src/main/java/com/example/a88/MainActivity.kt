package com.example.a88

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
                var answer = arrayOf<IntArray>()
                /* a x b  b x c -- > a x c 꼴로 되어야한다.
                 3x2 2x2  --> 3 x 2

                 1 4  3 3      [15 15]
                 3 2  3 3 .... [15 15]
                 4 1           [15 15]
                 */
                var a =arr1.size // a
                var b =arr1[0].size // b
                //var arr2_i =arr2.size // b
                var c =arr2[0].size // c
                answer = Array<IntArray>(a,{Array<Int>(arr2[0].size,{0}).toIntArray()})

                //배열 곱하기
                for(i in 0 until a){
                    for(j in 0 until b){
                        for(k in 0 until c) {
                            answer[i][k] += arr1[i][j] * arr2[j][k]
                        }
                    }
                }
                return answer
            }
        }
        val a =Solution()
        a.solution(arrayOf(intArrayOf(1,4),intArrayOf(3,2),intArrayOf(4,1)),
            arrayOf(intArrayOf(3,3),intArrayOf(3,3)))
        a.solution(arrayOf(intArrayOf(2,3,2),intArrayOf(4,2,4),intArrayOf(3,1,4)),
            arrayOf(intArrayOf(5,4,3),intArrayOf(2,4,1),intArrayOf(3,1,1)))
    }
}