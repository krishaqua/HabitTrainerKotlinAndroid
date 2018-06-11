package com.tektikr.habittrainer

import android.graphics.Bitmap

data class Habit(val title: String, val description: String, val image:Bitmap)

/*
fun getSampleHabits(): List<Habit> {
    return listOf(
            Habit("Go for a walk", " A nice walk keeps both body and mind strong",
                    R.drawable.walk),
            Habit("Drink a glass of water", "A refreshing glass of water gets you hydrated",
            R.drawable.water
            )
    )
}
*/
