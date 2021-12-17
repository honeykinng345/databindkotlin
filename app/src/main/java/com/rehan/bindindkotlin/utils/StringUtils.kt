package com.rehan.bindindkotlin.utils

object StringUtils {

        @JvmStatic
        fun getTotalRatings(totalRatings: Int): String {
            return "($totalRatings)"
        }
        @JvmStatic
        fun getPrice(price: Double): String {
            return "$price$"
        }


}