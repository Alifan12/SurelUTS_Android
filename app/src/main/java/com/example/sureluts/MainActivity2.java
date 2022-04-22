package com.example.sureluts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView subjekDefault = findViewById(R.id.subjek);
        ImageView image2Default = findViewById(R.id.image2);
        TextView senderDefault = findViewById(R.id.sender);
        TextView timeDefault = findViewById(R.id.time);
        TextView toDefault = findViewById(R.id.to);
        TextView messageDefault = findViewById(R.id.message);

        Intent intent = getIntent();

        String Subjek = intent.getStringExtra("SUBJEK_DEFAULT");
        int imageProfile = intent.getIntExtra("GAMBAR_DEFAULT", 0);
        String Sender = intent.getStringExtra("SENDER_DEFAULT");
        String Time = intent.getStringExtra("TIME_DEFAULT");
        String To = intent.getStringExtra("TO_DEFAULT");
        String Message = intent.getStringExtra("MESSAGE_DEFAULT");

        subjekDefault.setText(Subjek);
        image2Default.setImageResource(imageProfile);
        senderDefault.setText(Sender);
        timeDefault.setText(Time);
        toDefault.setText(To);
        messageDefault.setText(Message);
    }
}