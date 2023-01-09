package org.meicode.appfinal_diogotome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private ImageView youtube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        youtube = (ImageView) findViewById(R.id.imageView);

/*
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(view.getId());
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=GKdl-GCsNJ0&ab_channel=TheBeatles-Topic")));
            }
        });
*/

    }










    public void ir (View view) {
        Intent intent=new Intent( this ,MainActivity3.class);
        startActivity(intent);
    }


    public void voltar (View view) {
        Intent intent=new Intent( this ,MainActivity.class);
        startActivity(intent);
    }

    public void Enviar(View view) {
        TextView tx=findViewById(R.id.textView5 );
        tx.setText("blink 182-all the small things");
    }

    public void Enviar2(View view) {
        TextView tx=findViewById(R.id.textView6 );
        tx.setText("David Bowie-starman");
    }

    public void Enviar3(View view) {
        TextView tx=findViewById(R.id.textView7 );
        tx.setText("nirvana-breed");
    }


    public void send2(View view) {
        String uri="https://www.youtube.com/watch?v=X791IzOwt3Q&ab_channel=LedZeppelin-Topic";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(intent);
    }


    public void send3(View view) {
        String uri="https://www.youtube.com/watch?v=nkxka9mxGvA&ab_channel=SamtheKid-Topic";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(intent);
    }

    public void send1(View view) {
        String uri="https://www.youtube.com/watch?v=GKdl-GCsNJ0&ab_channel=TheBeatles-Topic";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(intent);
    }
}