package com.biharbhumii.biharlandrecord;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class About_Bihar_Land_Record extends AppCompatActivity {
    WebView webView;
    ProgressBar pgb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_bihar_land_record);
        getSupportActionBar().hide();
        pgb = findViewById(R.id.pg);
        webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                pgb.setVisibility(View.VISIBLE);
                setTitle("Loading.....");
            }
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                pgb.setVisibility(View.GONE);
                setTitle(view.getTitle());
            }
        });
        // Enable JavaScript
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://grampancgaab.blogspot.com/2024/03/about-us.html");
    }
}