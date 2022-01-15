package com.libo.toutiaocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            homePage()
        }
    }
}

//@Composable
//fun homePage() {
//    Column {
//        //上面viewPager页面
//        HorizontalPager() {
//
//        }
//
//        bottomNavigationView()
//    }
//}
//
//@Composable
//fun HorizontalPager() {
//
//}
//
//@Composable
//fun bottomNavigationView() {
//
//}
