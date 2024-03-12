package com.example.islami

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.islami.databinding.ActivityMainBinding
import com.example.islami.hadeth.HadethFragment
import com.example.islami.quran.QuranFragment
import com.example.islami.radio.RadioFragment
import com.example.islami.tasbeh.TasbehFragment

class MainActivity : AppCompatActivity() {
   private lateinit var viewBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        initViews()
    }
        private fun initViews(){
        viewBinding.content.navigationBar.setOnItemSelectedListener {item->
            when(item.itemId) {
                R.id.nav_quran -> {
                showFragment(QuranFragment())
                }

                R.id.nav_hadeth -> {
                  showFragment(HadethFragment())
                }

                R.id.nav_tasbeh -> {
                  showFragment(TasbehFragment())
                }

                R.id.nav_radio -> {
                  showFragment(RadioFragment())
                }
            }
            return@setOnItemSelectedListener true
            }

    }
        private fun showFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container,Fragment())
            .commit()


    }
    }