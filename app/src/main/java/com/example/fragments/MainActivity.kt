package com.example.fragments

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.fragments.ui.login.LoginFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn_clock = findViewById<Button>(R.id.btn_clock)
        val btn_exam = findViewById<Button>(R.id.btn_exam)
        val btn_validate = findViewById<Button>(R.id.btn_validate)


        btn_clock.setOnClickListener {
            relpaceWithFragment(Clock_Fragment())
        }

        btn_exam.setOnClickListener {
            relpaceWithFragment(Exam_Fragament())
        }

        btn_validate.setOnClickListener {
            relpaceWithFragment(LoginFragment())
        }


    }

    private fun relpaceWithFragment(frag : Fragment) {

        val fragManager = supportFragmentManager
        val fragTransaction = fragManager.beginTransaction()
        fragTransaction.replace(R.id.frameLayout,frag)
        fragTransaction.commit()
    }
}