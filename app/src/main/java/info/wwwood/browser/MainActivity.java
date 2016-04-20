package info.wwwood.browser;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent().getData()!=null) {
            String urlString=getIntent().getData().toString();

            WebView main_wvNavegador = (WebView) findViewById(R.id.main_wvNavegador);
            main_wvNavegador.setWebViewClient(new WebViewClient()); // perquè les redireccions les gestioni el propi browser
            main_wvNavegador.loadUrl(urlString);

            /***********SI VOLEM CREAR NOSALTRES UN HTML HO PODEM PASSAR AIXÍ **************************/
            //main_wvNavegador.loadData("<html><body><h1>Hola</h1></body></html>","text/html","utf-8");
            /********************************************************************************************/

        }

       // main_wbNavegador.loadUrl(data);


    }
}
