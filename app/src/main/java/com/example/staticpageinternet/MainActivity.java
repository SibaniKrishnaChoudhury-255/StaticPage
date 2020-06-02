package com.example.staticpageinternet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.StaticPage.clickListner;
import com.example.StaticPage.staticpage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        staticpage staticpage1=findViewById(R.id.page);

        staticpage1.setHeaderTitle("Cart")
                    .setHeaderTitleColor("#FF9800")
                    .setIcon(R.drawable.bag)
                    .setFooterTitle("YOUR CART IS EMPTY!")
                    .setFooterMessage("Move to the Home page to shop more")
                    .setButtonTitle("SHOP MORE")
                    .setButtonColor("#FF9800").setButtonTextColor("#ffffff")
                .onButtonClick(new clickListner() {
              @Override
              public void onClick() {
                  Toast.makeText(MainActivity.this, "Internet Connected", Toast.LENGTH_SHORT).show();
              }
          });



    }
}
