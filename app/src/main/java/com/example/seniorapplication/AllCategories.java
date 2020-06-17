package com.example.seniorapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.seniorapplication.R;
import com.example.seniorapplication.ui.onBuilding;

public class AllCategories extends AppCompatActivity {

    ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.categories);

        backBtn = findViewById(R.id.back_pressed);

        backBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                AllCategories.super.onBackPressed();
            }
        });
        

    }
    public void myListener2(View target){
        Intent intent = new Intent(getApplicationContext(), AllCategories_call.class);
        startActivity(intent);
    }
}
