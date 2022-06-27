package com.example.kegetapikey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//  Примечание
//        В .properties название ключа - yandex_weather_api_key ,
//        в BuildConfig - WEATHER_API_KEY ,
//        а запросе api - addRequestProperty("X-Yandex-API-Key", "627a...........783")



//  Общие для всех

        // 1-создаем в корне проекта файл apikey.properties (либо app.properties...) c ключом
        // 2-добавляем данный файл в соседний .gitignore


//  Option 1.

        // 3-добавляем текст на Groove в gradle
        // 4-забираем в BuildConfig.WEATHER_API_KEY
        findViewById<TextView>(R.id.txt1_key).text = BuildConfig.WEATHER_API_KEY
    }

}