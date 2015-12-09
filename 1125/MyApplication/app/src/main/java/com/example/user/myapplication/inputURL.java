package com.example.user.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;

/**
 * Created by user on 2015/11/25.
 */
public class inputURL extends Activity{
    public void onCreate(Bundle save){
        super.onCreate(save);
        setContentView(R.layout.input_url);

        final EditText editText =(EditText)findViewById(R.id.editText);

        final WebView webView =(WebView)findViewById(R.id.webView);

        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode==KeyEvent.KEYCODE_ENTER){
                    String rul=editText.getEditableText().toString();
                    webView.loadUrl(rul);
                    return true;
                }
                return false;
            }
        });
    }
}
