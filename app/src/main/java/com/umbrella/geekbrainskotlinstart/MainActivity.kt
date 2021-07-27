package com.umbrella.geekbrainskotlinstart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val textView: TextView = findViewById(R.id.textView)
        var count = 0
        button.setOnClickListener {
            textView.text = count.toString()
            count++
        }

        val human = Human("Andrey", 21)
        val textViewDataClass: TextView = findViewById(R.id.textViewDataClass)
        textViewDataClass.text = human.toString()

        val copyHuman = human.copy()
        val textViewObject: TextView = findViewById(R.id.textViewDataClassCopy)
        textViewObject.text = copyHuman.toString()

        val humanList = ArrayList<Human>()
        for (i in 1..10) {
            humanList.add(Human("human №" + i, i))
        }

        for (human in humanList) {
            println(human)
        }

        for (i in 30 .. 60 step 5) {
            println("Hello world! We get number $i")
        }
    }
}