package com.example.kegetapikey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Касательно api_key - в gradle добавлен код на groove, который отрабатывается во время
        // компиляции, а именно автоматически генерирует файл BuildConfig и добавляет туда
        // константу - например: public static final String NASA_API_KEY = "DEMO_KEY";
        // или   public static final String WEATHER_API_KEY = "56.....49";

//  Примечание
//        В .properties название ключа вида -
//        yandex_weather_api_key="56.....49",
//        в BuildConfig - WEATHER_API_KEY ,
//        а запросе api - addRequestProperty("X-Yandex-API-Key", "56.....49")
//        или addRequestProperty("X-Yandex-API-Key", BuildConfig.WEATHER_API_KEY)



//  Общие для всех

        // 1-создаем в корне проекта файл apikey.properties (либо app.properties...) c ключом
        // 2-добавляем данный файл в соседний .gitignore


//  Option 1.

        // 3-добавляем текст на Groove в gradle
        // 4-забираем в BuildConfig.WEATHER_API_KEY
        findViewById<TextView>(R.id.txt1_key).text = BuildConfig.WEATHER_API_KEY
    }

}