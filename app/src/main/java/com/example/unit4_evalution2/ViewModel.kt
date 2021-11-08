package com.example.unit4_evalution2

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewModel(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var ImageView = itemView.findViewById<ImageView>(R.id.image)
    var textView = itemView.findViewById<TextView>(R.id.tv1)
    var textView1 = itemView.findViewById<TextView>(R.id.tv2)
    var textView2 = itemView.findViewById<TextView>(R.id.tv3)
    var textView3 = itemView.findViewById<TextView>(R.id.tv4)
    var textView4 = itemView.findViewById<TextView>(R.id.tv5)
    var textView5 = itemView.findViewById<TextView>(R.id.tv6)
    var textView6 = itemView.findViewById<TextView>(R.id.tv7)


     fun setData(resultsDTO: ResultsDTO){
       //  ImageView.setImageResource(resultsDTO.picture.medium.)
         textView.text = resultsDTO.name?.first.toString()
         textView1.text = resultsDTO.gender.toString()
         textView2.text = resultsDTO.location?.city.toString()
         textView3.text = resultsDTO.location?.country.toString()
         textView4.text = resultsDTO.phone.toString()
         textView5.text = resultsDTO.dob?.date.toString()
         textView6.text = resultsDTO.email.toString()


    }
}



