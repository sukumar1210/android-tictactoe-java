package com.example.base_pkg;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int player = 1; // Player 1 = Cross



    public void load(View view){
        ImageView v =(ImageView) view;
        int tag = Integer.parseInt(v.getTag().toString());
        if(player==1){
            v.setImageResource(R.drawable.cross);
            Toast.makeText(this, "Cross", Toast.LENGTH_SHORT).show();
            player = 0;
        }else{
            v.setImageResource(R.drawable.zero);
            Toast.makeText(this, "Zero", Toast.LENGTH_SHORT).show();
            player = 1;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}