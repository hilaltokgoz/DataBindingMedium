package com.databindingmedium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.databindingmedium.databinding.ActivityModelBinding

class ModelActivity : AppCompatActivity() {
    lateinit var binding:ActivityModelBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_model)

        binding.book=BookModel("Dune","Frank Herbert","Ithaki",100)

    }
}