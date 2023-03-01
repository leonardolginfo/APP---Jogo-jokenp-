package br.com.lginfo.gamejokempo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView player1;
    ImageView player2;
    ImageButton rock;
    ImageButton paper;
    ImageButton cut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player1 = findViewById(R.id.imgPlayer1);
        player2 = findViewById(R.id.imgPlayer2);
        rock = findViewById(R.id.imgBtnRock);
        paper = findViewById(R.id.imgBtnPaper);
        cut = findViewById(R.id.imgBtnCut);
    }

    public void btnClick(View view){

    }
}