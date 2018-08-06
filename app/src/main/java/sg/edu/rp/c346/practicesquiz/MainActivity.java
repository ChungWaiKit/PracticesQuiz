package sg.edu.rp.c346.practicesquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Spinner spn1;
    WebView wvdisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         spn1 = findViewById(R.id.spinner);
         wvdisplay = findViewById(R.id.webview);

        wvdisplay .setWebViewClient(new WebViewClient());





        spn1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


                switch (i){
                    case 0:
                        String url = "https://www.rp.edu.sg";
                        wvdisplay.loadUrl(url);
                        break;
                    case 1:
                        String url2 = "https://www.google.com";
                        wvdisplay.loadUrl(url2);

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }
}
