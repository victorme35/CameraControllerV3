package fr.vico.cameracontrollerv3;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;
import android.widget.Button;
import android.view.View;

public class MainActivity extends Activity {
    Button bt;
    public WebView webView;
    // Création de l'activité
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=(Button)findViewById(R.id.button);

        // Instanciation du WebView
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Information temporaire de test(à supprimer à la convenance du développeur)
                myToast("Chargement de la page web");
                webView = (WebView) findViewById(R.id.webview);
                // Effacement du cache
                webView.clearCache(true);
                // suppression du stockage de données dans le cache
                webView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
                // Chargement de la page web
                webView.loadUrl(getString(R.string.page_AccesSite));

            }
        });

    } // fin de onCreate

    @Override
    protected void onStart()    { super.onStart();}
    @Override
    protected void onRestart()  { super.onRestart();}
    @Override
    protected void onResume()   { super.onResume();}
    @Override
    protected void onPause()    { super.onPause();}
    @Override
    protected void onStop()     { super.onStop();}
    @Override
    protected void onDestroy()  { super.onDestroy();}

    //_____________________________________________________________________
    // Classes filles
    //_____________________________________________________________________

    //_____________________________________________________________________
    // Méthodes filles
    //_____________________________________________________________________

    // Méthode de personnalisation des informations du Toast

    public void myToast(String theMessage){
        Toast toast = Toast.makeText(getApplicationContext(), Html.fromHtml(theMessage), Toast.LENGTH_SHORT);
        // Affichage du toast
        toast.show();
    }

} // Fin class TestWebview

