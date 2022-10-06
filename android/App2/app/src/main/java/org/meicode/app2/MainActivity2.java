package org.meicode.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void Retroceder (View view) {
        Intent intent=new Intent( this, MainActivity.class);
        startActivity(intent);
    }



    public void Enviar(View view) {
        TextView tx=findViewById(R.id.textView5);
                tx.setText("mudou");
    }
}