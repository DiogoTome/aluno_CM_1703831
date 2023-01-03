package org.meicode.appfinal_diogotome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void visitou (View view) {
        Intent intent=new Intent( this ,MainActivity4.class);
        startActivity(intent);
    }
    public void embora (View view) {
        Intent intent=new Intent( this ,MainActivity5.class);
        startActivity(intent);
    }


    public void retroceder (View view) {
        Intent intent=new Intent( this ,MainActivity2.class);
        startActivity(intent);
    }



}