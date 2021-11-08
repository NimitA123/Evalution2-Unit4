package com.example.unit4_evalution2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.circularreveal.CircularRevealLinearLayout
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var  recyclerView: RecyclerView
    private   var  responseList = ArrayList<ResultsDTO>()
    private  lateinit var  adapter: Adapter
    private lateinit var  linearLayout: LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        RecyclerView()
        CallApi()
    }

    private fun CallApi() {
       btnNext.setOnClickListener {
           var apiService = Network.getRetrofitInstance().create(ApiService::class.java)
           apiService.getUSer() .enqueue(object : retrofit2.Callback<ResponseDTO> {
               override fun onResponse(
                   call: Call<ResponseDTO>,
                   response: Response<ResponseDTO>
               ) {
                   response.body()?.results.also {
                       responseList = response.body()!!.results as ArrayList<ResultsDTO>
                      }

                   //asserting non null but if the response.body() is null you will get NPE
                   setRecyclerView()

               }

               override fun onFailure(
                   call: Call<ResponseDTO>,
                   t: Throwable
               ) {

               }

           })


       }
       }

    private fun setRecyclerView() {
        adapter = Adapter(responseList)
        linearLayout = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = linearLayout



    }

    private fun RecyclerView() {
        recyclerView = findViewById(R.id.rvRecycleView)
    }
}


