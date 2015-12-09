package com.example.user.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.RadioGroup;

/**
 * Created by user on 2015/11/25.
 */
public class google extends Activity {
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT;
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;

    public void onCreate(Bundle save){
        super.onCreate(save);

        WebView webView =new WebView(this);
        webView.getSettings().setJavaScriptEnabled(false);

        webView.setWebChromeClient(new WebChromeClient());

        Bundle b=getIntent().getExtras();
        webView.loadUrl(b.getString("url"));

        setContentView(webView,new RadioGroup.LayoutParams(FP,WC));
    }
}
