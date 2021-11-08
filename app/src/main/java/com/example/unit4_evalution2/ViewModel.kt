package com.example.unit4_evalution2

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewModel(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var textView = itemView.findViewById<TextView>(R.id.tv1)
    var textView1 = itemView.findViewById<TextView>(R.id.tv2)
    var textView2 = itemView.findViewById<TextView>(R.id.tv3)
    var textView3 = itemView.findViewById<TextView>(R.id.tv4)
    var textView4 = itemView.findViewById<TextView>(R.id.tv5)
    var textView5 = itemView.findViewById<TextView>(R.id.tv6)


     fun setData(resultsDTO: ResultsDTO){

    }
}