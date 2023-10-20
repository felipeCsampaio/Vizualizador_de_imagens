package br.ulbra.apostila2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {

        ImageView imgFoto;
        Button btFoto1,btFoto2;
        TextView txtInformacao;

        @Override
    public void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            imgFoto = (ImageView) findViewById(R.id.imgFoto);
            btFoto1 = (Button)findViewById(R.id.btFoto1);
            btFoto2 = (Button)findViewById(R.id.btFoto2);
            txtInformacao = (TextView)findViewById(R.id.txtInformacao);
            btFoto1.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imgFoto.setImageResource(R.drawable.img1);
                    txtInformacao.setText("Foto1");                }
            }));

            btFoto2.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View arg0){
                    imgFoto.setImageResource(R.drawable.img3);
                    txtInformacao.setText("Foto 2");
                }
            }));
        }

}

