package com.example.StaticPage;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class staticpage extends LinearLayout {
    TextView headerTitle,footerTitle,footerMessage;
    Button refresh_button;
    ImageView image;
    public clickListner buttonListner;


    public staticpage(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.staticpage, this, true);

        headerTitle=findViewById(R.id.headerTitle);
        footerTitle=findViewById(R.id.footerTitle);
        footerMessage=findViewById(R.id.footerMessage);
        refresh_button=findViewById(R.id.refresh_btn);
        image=findViewById(R.id.image);
    }

    public staticpage(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public staticpage(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public staticpage(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    public staticpage setHeaderTitle(String userheaderTitle){
        headerTitle.setText(userheaderTitle);
        return this;
    }
    public staticpage setHeaderTitleColor(String userheaderTitlecolor){
        headerTitle.setTextColor(Color.parseColor(userheaderTitlecolor));
        return this;
    }
    public staticpage setFooterTitle(String userFooterTitle){
        footerTitle.setText(userFooterTitle);
        return this;
    }
    public staticpage setFooterTitleColor(String userFooterTitlecolor){
        footerTitle.setTextColor(Color.parseColor(userFooterTitlecolor));
        return this;
    }
    public staticpage setFooterMessage(String userFooterMessage){
        footerMessage.setText(userFooterMessage);
        return this;

    }

    public staticpage setFooterMessageColor(String userFooterMessagecolor){
        footerMessage.setTextColor(Color.parseColor(userFooterMessagecolor));
        return this;
    }

    public staticpage setButtonColor(String buttonColor){
        refresh_button.setBackgroundColor(Color.parseColor(buttonColor));
        return this;
    }

    public staticpage setButtonTextColor(String button_textColor){
        refresh_button.setTextColor(Color.parseColor(button_textColor));
        return this;
    }

    public staticpage setButtonTitle(String buttonTitle){
        refresh_button.setText(buttonTitle);
        refresh_button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonListner!=null)
                buttonListner.onClick();
            }
        });
        return this;
    }

    public staticpage setIcon(int icon){
        image.setImageResource(icon);
        return this;
    }

    public  staticpage onButtonClick(clickListner listner){
        buttonListner=listner;
        return this;
    }

}



