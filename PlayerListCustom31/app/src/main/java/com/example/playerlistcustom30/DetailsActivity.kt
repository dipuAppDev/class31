package com.example.playerlistcustom30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {

    private lateinit var conImage:ImageView
    private lateinit var conName:TextView
    private lateinit var conLongDetails:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        conImage = findViewById(R.id.conImage)
        conName = findViewById(R.id.conName)
        conLongDetails = findViewById(R.id.conLongDetails)


        conImage.setImageResource(intent.getIntExtra("conImage", 0))
        conName.text = intent.getStringExtra("conName")
        //conLongDetails.setText(intent.getIntExtra("playerdetails", 0))






    }
}