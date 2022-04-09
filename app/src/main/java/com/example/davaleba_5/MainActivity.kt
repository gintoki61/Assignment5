package com.example.davaleba_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    lateinit var rundistance: TextView
    lateinit var runswimming: TextView
    lateinit var runcalories: TextView
    lateinit var average: TextView
    lateinit var avaragerunswimming: TextView
    lateinit var avaragecalories: TextView
    lateinit var showRun: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rundistance = findViewById(R.id.number_1)
        runswimming = findViewById(R.id.number_2)
        runcalories = findViewById(R.id.number_3)
        average = findViewById(R.id.textView4)
        avaragerunswimming = findViewById(R.id.textView5)
        avaragecalories = findViewById(R.id.textView6)
        showRun = findViewById(R.id.textView7)


        val sumRun= App.instance.db.getWorkDao().getSum()?.toString()
        showRun.append("მანძილის ჯამი - $sumRun")
        val getAverage = App.instance.db.getWorkDao().getAverage()?.toString()
        average.append("მანძილის საშუალო - $getAverage")
        val getAverageRunSwimming = App.instance.db.getWorkDao().getAverageRunSwimming()?.toString()
        avaragerunswimming.append(" მანძილის საშვალო - $getAverageRunSwimming")
        val getAverageRunCalories = App.instance.db.getWorkDao().getAverageRunCalories()?.toString()
        avaragecalories.append("კალორიის საშუალო - $getAverageRunCalories")







    }
    fun Insert(view: View) {
        if (TextUtils.isEmpty(rundistance.text)){
            rundistance.setError("error")
        } else if (TextUtils.isEmpty(runswimming.text)){
            runswimming.setError("error")
        } else if (TextUtils.isEmpty(runcalories.text)){
            runcalories.setError("error")
        } else
            App.instance.db.getWorkDao().deleteAll()
            App.instance.db.getWorkDao().insert(Work(0, rundistance.text.toString().toInt(), runswimming.text.toString().toInt(), runcalories.text.toString().toInt() ))
            App.instance.db.getWorkDao().getAllWorks()?.forEach { Works -> Log.d("MyData", Works.toString())  }
    }
    }


