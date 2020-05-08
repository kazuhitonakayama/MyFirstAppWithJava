package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(android.view.View view) {
        TextView bmiScore = (TextView)this.findViewById(R.id.bmiScore);
        EditText heightForm = (EditText)this.findViewById(R.id.heightForm);
        EditText weightForm = (EditText)this.findViewById(R.id.weightForm);
        // ここで多分どこの何を参照するかを定義してる

        String strHeight,strWeight;
        strHeight = heightForm.getText().toString();
        strWeight = weightForm.getText().toString();
        //　んで実際にそれぞれの入力内容を文字列として取得


        double height,weight,bmi;
        height = Double.parseDouble(strHeight);
        weight = Double.parseDouble(strWeight);
        //　文字列として取得したものから数値を取り出す

        height /= 100;
        bmi = weight/(height * height);
        String msg = "BMIスコア" + String.format("%.1f",bmi);

        bmiScore.setText(msg);
        // bmiScore.setText(String.format("%.1f",msg));
    }
}
