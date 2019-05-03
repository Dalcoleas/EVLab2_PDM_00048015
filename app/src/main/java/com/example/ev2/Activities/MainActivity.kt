package com.example.ev2.Activities

import android.graphics.Color
import android.graphics.SumPathEffect
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.ev2.Fragments.Dynamic
import com.example.ev2.Fragments.Static
import com.example.ev2.R
import kotlinx.android.synthetic.main.fragment_dynamic.*
import kotlinx.android.synthetic.main.fragment_static.*
import kotlin.random.Random

class MainActivity : AppCompatActivity(), Static.OnFragmentInteractionListener, Dynamic.OnFragmentInteractionListener1 {
    override fun onFragmentInteraction(color: Color) {

    }

    override fun ChangeColor1(some: String) {

    }

    override fun ChangeColor2(some: String) {

    }



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFragment()

        next.setOnClickListener{
            dynamic_frag.setBackgroundColor(Color.rgb(0,100,0))
        }

        prev.setOnClickListener({
            dynamic_frag.setBackgroundColor(Color.rgb(0,0,100))
        })

    }

    fun initFragment(){
        val newFrag = Dynamic.newInstance("1", "2")
        supportFragmentManager.beginTransaction().replace(R.id.frag_change,newFrag).commit()
    }
}
