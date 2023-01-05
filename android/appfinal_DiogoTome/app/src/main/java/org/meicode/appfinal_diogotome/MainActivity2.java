package org.meicode.appfinal_diogotome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainActivity2 extends AppCompatActivity {
    String musicas="";
    String file ="/musicas.txt";
    String uri1="";
    String uri2="";
    String uri3="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        BufferedReader reader = null;
        String dir = System.getProperty("user.dir");
        System.out.println(dir);
        try {
            reader = new BufferedReader(new FileReader(file));
            String currentLine = reader.readLine();
            System.out.println("******************");
            System.out.println(currentLine);
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public void ir (View view) {
        // seguinte
        Intent intent=new Intent( this ,MainActivity3.class);
        startActivity(intent);
    }


    public void voltar (View view) {
        // atrás
        Intent intent=new Intent( this ,MainActivity.class);
        startActivity(intent);
    }


    public void Send1(View view) {
        uri1="https://www.youtube.com/watch?v=NCtzkaL2t_Y";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(uri1));
        startActivity(intent);
    }

    public void Send2(View view) {
        uri2="https://www.youtube.com/watch?v=NCtzkaL2t_Y";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(uri2));
        startActivity(intent);
    }


    public void Send3(View view) {
        uri3="https://www.youtube.com/watch?v=45cYwDM";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(uri3));
        startActivity(intent);
    }
}