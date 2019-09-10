package com.example.myfirsttextpatriciogalindo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView myTextView = (TextView) findViewById(R.id.etiqueta);
        myTextView.setText("a continuacion viene una notificacion");
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText( this,"Este es mi toast Simple", Toast.LENGTH_LONG);
        toast.show();
    }

}
