package com.example.playerlistcustom30

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.google.android.material.imageview.ShapeableImageView

class CountryAdapter (context: Context,countryList:ArrayList<Country>)
    : ArrayAdapter<Country>(context,0,countryList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var countryListView = convertView
        if (countryListView == null){
            countryListView = LayoutInflater.from(context).inflate(R.layout.country_item,parent,false)
        }
        val couName = countryListView!!.findViewById<TextView>(R.id.countryName)
        val couShortDetails = countryListView.findViewById<TextView>(R.id.countryShortDetails)
        val couImage = countryListView.findViewById<ShapeableImageView>(R.id.countyImg)

        couName.setText(getItem(position)!!.name)
        couShortDetails.setText(getItem(position)!!.shortDetails)
        couImage.setImageResource(getItem(position)!!.image)

        return countryListView


    }








}