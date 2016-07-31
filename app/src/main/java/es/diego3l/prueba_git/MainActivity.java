package es.diego3l.prueba_git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button boton;
    TextView texto;
    boolean condicion = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.text);
        boton = (Button) findViewById(R.id.boton);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!condicion){
                   texto.setText("Cambiamos Texto");
                    condicion = true;
                } else {
                    texto.setText("Hola Mundo");
                    condicion = false;
                }
            }
        });

    }
}
