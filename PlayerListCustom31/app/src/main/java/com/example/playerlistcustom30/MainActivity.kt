package com.example.playerlistcustom30

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView


class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        val contryList: ArrayList<Country> = ArrayList()

        contryList.add(Country(R.drawable.bangladesh_img, "Bangladesh", R.string.bangladesh_short_details, R.string.bangladesh_long_details))
        contryList.add(Country(R.drawable.pakistan_img, "Pakistan", R.string.pakistan_short_details,R.string.pakistan_long_deails))
        contryList.add(Country(R.drawable.india_img, "India", R.string.india_short_details,R.string.india_long_detials))
        contryList.add(Country(R.drawable.korea_img, "Korea", R.string.korea_short_details,R.string.kores_long_details))
        contryList.add(Country(R.drawable.canada_img, "Canada", R.string.canada_short_details,R.string.canada_long_details))
        contryList.add(Country(R.drawable.coresia_img, "Croatia", R.string.croatia_short_details,R.string.croatia_long_details))
        contryList.add(Country(R.drawable.finland_img, "Finland", R.string.finland_short_details,R.string.finland_long_datails))
        contryList.add(Country(R.drawable.argentina_img, "Argentina", R.string.argentina_short_details,R.string.argentina_long_details))
        contryList.add(Country(R.drawable.brazil_img, "Brazil", R.string.brazil_short_details,R.string.brazil_long_details))
        contryList.add(Country(R.drawable.bhutan_img, "Bhutan", R.string.bhutan_short_details,R.string.bhutan_long_details))
        contryList.add(Country(R.drawable.indonesia_img, "Indonesia", R.string.indonesia_short_details,R.string.indonesia_long_details))
        contryList.add(Country(R.drawable.portugal_img, "Portugal", R.string.portugal_short_details,R.string.portugal_long_details))
        //contryList.add(Country(R.drawable.russia_img, "Russia", R.string.russia_short_details,R.string.russia_long_details))
       // contryList.add(Country(R.drawable.srilanka_img, "Srilanka", R.string.srilanka_short_details,R.string.srilanka_long_details))
        contryList.add(Country(R.drawable.united_states_img, "United States", R.string.united_states_short_details,R.string.united_states_long_details))


        val playerAdapter = CountryAdapter(this, contryList)

        listView.adapter = playerAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("conName", contryList[position].name)
            intent.putExtra("conShortDetails", contryList[position].shortDetails)
            intent.putExtra("conImage", contryList[position].image)
            startActivity(intent)
        }
    }
}