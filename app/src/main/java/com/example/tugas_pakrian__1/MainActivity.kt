package com.example.tugas_pakrian__1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var extbtn: Button
    private lateinit var gotoCalculatorBtn: Button
    private lateinit var dbHelper: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




//        binding =ActivitySigupBinding.inflate(layoutInflater)
//        setContentView(binding.root);
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        extbtn = findViewById(R.id.exitbtn)
        extbtn.setOnClickListener(this)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    // Pindahkan fungsi ini ke luar `onCreate`
    fun goToCalculator(view: View) {
        val intent = Intent(this, kalkulator::class.java)
        startActivity(intent)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.exitbtn) {
            finish()
        }
    }

}

