package com.example.livechat_poc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Loaded",Toast.LENGTH_SHORT);
        Button button = findViewById(R.id.buttonChat);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT);
                Intent myIntent = new Intent(MainActivity.this, ChatRoomActivity.class);
//                myIntent.putExtra("key", username); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        });
    }
}
