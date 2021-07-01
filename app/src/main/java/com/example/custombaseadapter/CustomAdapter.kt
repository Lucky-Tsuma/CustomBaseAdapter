package com.example.custombaseadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(context: Context, countryList: MutableList<String>, flags: IntArray) :
    BaseAdapter() {
    private var context: Context = context
    private var countryList: MutableList<String> = countryList
    private var flags: IntArray = flags
    override fun getCount(): Int {
        return countryList.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val mView: View? =
            LayoutInflater.from(context).inflate(R.layout.activity_listview, parent, false)
        val country = mView!!.findViewById<TextView>(R.id.textView)
        val icon = mView.findViewById<ImageView>(R.id.icon)

        country.text = countryList[position]
        icon.setImageResource(flags[position])

        return mView

    }

}