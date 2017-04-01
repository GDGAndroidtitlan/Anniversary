package com.androidtitlan.anniversary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment : Fragment? = supportFragmentManager
                .findFragmentById(R.id.fragment_container)

        if (fragment == null){
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container, FragmentTalks())
                    .commit()
        }
    }
}
