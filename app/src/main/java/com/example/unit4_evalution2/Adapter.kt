package com.example.unit4_evalution2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adapter(private var resultsDTO: ArrayList<ResultsDTO>) : RecyclerView.Adapter<ViewModel>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewModel {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewModel(view)

    }

    override fun onBindViewHolder(holder: ViewModel, position: Int) {
       var data = resultsDTO.get(position)
       holder.setData(data)
    }

    override fun getItemCount(): Int {
        return resultsDTO.size
    }
}