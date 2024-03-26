package com.biharbhumii.biharlandrecord;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class show_bihar_land_record extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_bihar_land_record);
        getSupportActionBar().setTitle("Bihar Land Record");

        webView = findViewById(R.id.webview);

        int position = getIntent().getIntExtra("story_key", 0);

        // For 1st row
        if (position == 0) {
            webView.setWebViewClient(new WebViewClient());
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://biharbhumi.bihar.gov.in/Biharbhumi/UserLogin");
        }

        if (position == 1) {
            webView.setWebViewClient(new WebViewClient());
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://parimarjan.bihar.gov.in/biharBhumireport/MutationStatusNew");
        }

        if (position == 2) {
            webView.setWebViewClient(new WebViewClient());
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://biharbhumi.bihar.gov.in/Biharbhumi/MutationReport");
        }

        if (position == 3) {
            webView.setWebViewClient(new WebViewClient());
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://biharbhumi.bihar.gov.in/Biharbhumi/UserLogin");
        }
    }
}
