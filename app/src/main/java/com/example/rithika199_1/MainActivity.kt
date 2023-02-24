package com.example.rithika199_1

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fontsize = 5f
        var color = 0
        var bgcolor = 0


        val toast = findViewById<TextView>(R.id.toast)
        val font = findViewById<Button>(R.id.font)
        val style = findViewById<Button>(R.id.style)
        val dtoast = findViewById<Button>(R.id.d_toast)
        val background = findViewById<Button>(R.id.background)
        val screen = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.screen)


        font.setOnClickListener {
            fontsize = (fontsize + 5) % 50
            if (fontsize == 0f) {
                toast.textSize = 5f
            } else {
                toast.textSize = fontsize
            }

        }

        style.setOnClickListener {
            if (color % 3 == 0) {
                toast.setTextColor(Color.RED)
            }
            if (color % 3 == 1) {
                toast.setTextColor(Color.GREEN)
            }
            if (color % 3 == 2) {
                toast.setTextColor(Color.BLUE)
            }
            color++

        }

        background.setOnClickListener {

            if (bgcolor % 3 == 0) {
                screen.setBackgroundColor(Color.RED)
            }
            if (bgcolor % 3 == 1) {
                screen.setBackgroundColor(Color.GREEN)
            }
            if (bgcolor % 3 == 2) {
                screen.setBackgroundColor(Color.BLUE)
            }
            bgcolor++
        }
        dtoast.setOnClickListener {
            Toast.makeText(this, "This is a Toast Message!", Toast.LENGTH_SHORT).show()

        }


    }
}
