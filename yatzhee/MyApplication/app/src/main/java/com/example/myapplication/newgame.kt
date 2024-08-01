package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class newgame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newgame)
        fun rollDice() {
            val dice1=Dice(numside = 6)
            val dice2=Dice(numside = 6)
            val dice3=Dice(numside = 6)
            val dice4=Dice(numside = 6)
            val dice5=Dice(numside = 6)
            val diceh1=Dice(numside = 6)
            val diceh2=Dice(numside = 6)
            val diceh3=Dice(numside = 6)
            val diceh4=Dice(numside = 6)
            val diceh5=Dice(numside = 6)

            val qRoll = dice1.roll()
            val qRoll2 = dice2.roll()
            val qRoll3 = dice3.roll()
            val qRoll4 = dice4.roll()
            val qRoll5 = dice5.roll()
            val qRollh = diceh1.roll()
            val qRollh2 = diceh2.roll()
            val qRollh3 = diceh3.roll()
            val qRollh4 = diceh4.roll()
            val qRollh5 = diceh5.roll()

            val img1 = findViewById<ImageView>(R.id.imageView)
            val img2 = findViewById<ImageView>(R.id.imageView2)
            val img3 = findViewById<ImageView>(R.id.imageView3)
            val img4 = findViewById<ImageView>(R.id.imageView4)
            val img5 = findViewById<ImageView>(R.id.imageView5)
            val imgh1 = findViewById<ImageView>(R.id.dice1human)
            val imgh2 = findViewById<ImageView>(R.id.dice2human)
            val imgh3 = findViewById<ImageView>(R.id.dice3human)
            val imgh4 = findViewById<ImageView>(R.id.dice4human)
            val imgh5 = findViewById<ImageView>(R.id.dice5human)

            when (qRoll) {
                1 -> img1.setImageResource(R.drawable.die_face_1)
                2 -> img1.setImageResource(R.drawable.die_face_2)
                3 -> img1.setImageResource(R.drawable.die_face_3)
                4 -> img1.setImageResource(R.drawable.die_face_4)
                5 -> img1.setImageResource(R.drawable.die_face_5)
                6 -> img1.setImageResource(R.drawable.die_face_6)
            }
            when (qRoll2) {
                1 -> img2.setImageResource(R.drawable.die_face_1)
                2 -> img2.setImageResource(R.drawable.die_face_2)
                3 -> img2.setImageResource(R.drawable.die_face_3)
                4 -> img2.setImageResource(R.drawable.die_face_4)
                5 -> img2.setImageResource(R.drawable.die_face_5)
                6 -> img2.setImageResource(R.drawable.die_face_6)
            }
            when (qRoll3) {
                1 -> img3.setImageResource(R.drawable.die_face_1)
                2 -> img3.setImageResource(R.drawable.die_face_2)
                3 -> img3.setImageResource(R.drawable.die_face_3)
                4 -> img3.setImageResource(R.drawable.die_face_4)
                5 -> img3.setImageResource(R.drawable.die_face_5)
                6 -> img3.setImageResource(R.drawable.die_face_6)
            }
            when (qRoll4) {
                1 -> img4.setImageResource(R.drawable.die_face_1)
                2 -> img4.setImageResource(R.drawable.die_face_2)
                3 -> img4.setImageResource(R.drawable.die_face_3)
                4 -> img4.setImageResource(R.drawable.die_face_4)
                5 -> img4.setImageResource(R.drawable.die_face_5)
                6 -> img4.setImageResource(R.drawable.die_face_6)
            }
            when (qRoll5) {
                1 -> img5.setImageResource(R.drawable.die_face_1)
                2 -> img5.setImageResource(R.drawable.die_face_2)
                3 -> img5.setImageResource(R.drawable.die_face_3)
                4 -> img5.setImageResource(R.drawable.die_face_4)
                5 -> img5.setImageResource(R.drawable.die_face_5)
                6 -> img5.setImageResource(R.drawable.die_face_6)
            }
            when (qRollh) {
                1 -> imgh1.setImageResource(R.drawable.die_face_1)
                2 -> imgh1.setImageResource(R.drawable.die_face_2)
                3 -> imgh1.setImageResource(R.drawable.die_face_3)
                4 -> imgh1.setImageResource(R.drawable.die_face_4)
                5 -> imgh1.setImageResource(R.drawable.die_face_5)
                6 -> imgh1.setImageResource(R.drawable.die_face_6)
            }
            when (qRollh2) {
                1 -> imgh2.setImageResource(R.drawable.die_face_1)
                2 -> imgh2.setImageResource(R.drawable.die_face_2)
                3 -> imgh2.setImageResource(R.drawable.die_face_3)
                4 -> imgh2.setImageResource(R.drawable.die_face_4)
                5 -> imgh2.setImageResource(R.drawable.die_face_5)
                6 -> imgh2.setImageResource(R.drawable.die_face_6)
            }
            when (qRollh3) {
                1 -> imgh3.setImageResource(R.drawable.die_face_1)
                2 -> imgh3.setImageResource(R.drawable.die_face_2)
                3 -> imgh3.setImageResource(R.drawable.die_face_3)
                4 -> imgh3.setImageResource(R.drawable.die_face_4)
                5 -> imgh3.setImageResource(R.drawable.die_face_5)
                6 -> imgh3.setImageResource(R.drawable.die_face_6)
            }
            when (qRollh4) {
                1 -> imgh4.setImageResource(R.drawable.die_face_1)
                2 -> imgh4.setImageResource(R.drawable.die_face_2)
                3 -> imgh4.setImageResource(R.drawable.die_face_3)
                4 -> imgh4.setImageResource(R.drawable.die_face_4)
                5 -> imgh4.setImageResource(R.drawable.die_face_5)
                6 -> imgh4.setImageResource(R.drawable.die_face_6)
            }
            when (qRollh5) {
                1 -> imgh5.setImageResource(R.drawable.die_face_1)
                2 -> imgh5.setImageResource(R.drawable.die_face_2)
                3 -> imgh5.setImageResource(R.drawable.die_face_3)
                4 -> imgh5.setImageResource(R.drawable.die_face_4)
                5 -> imgh5.setImageResource(R.drawable.die_face_5)
                6 -> imgh5.setImageResource(R.drawable.die_face_6)
            }
        }
        fun score(){

        }

        var totalRolls = 0
        val singleScore = findViewById<TextView>(R.id.humanscore)
        val totalScore = findViewById<TextView>(R.id.humanscore2)

        val scorebutton1 = findViewById<Button>(R.id.bt6)
        scorebutton1.setOnClickListener{
            scoring()

        }
        val rollbutton1 = findViewById<Button>(R.id.bt5)
        rollDice()
        rollbutton1.setOnClickListener{
            rollDice()
            //val textview3 = findViewById<TextView>(R.id.tv3)
            //textview3.text = "3"
            // val throw1 = Toast.makeText(this,"Dice Rooled" , Toast.LENGTH_LONG)
            // throw1.show()
        }




    }

    private fun scoring() {
        TODO("Not yet implemented")
    }


    class Dice(val numside: Int){
        fun roll():Int{
            return(1..numside).random()
        }


    }

}
