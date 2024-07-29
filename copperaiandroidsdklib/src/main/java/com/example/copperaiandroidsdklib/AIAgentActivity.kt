package com.example.copperaiandroidsdklib

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AIAgentActivity : AppCompatActivity() {

    lateinit var myWebView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        myWebView = WebView(this)
        myWebView.webViewClient = WebViewClient()
        setContentView(myWebView)
        myWebView.settings.javaScriptEnabled = true
        myWebView.settings.domStorageEnabled = true
        val url : String?= intent.getStringExtra("url")
        if(url!=null){
            myWebView.loadUrl(url)
        }else{
            Toast.makeText(this,"Invalid Url", Toast.LENGTH_LONG).show()
            finish()
        }

    }
}