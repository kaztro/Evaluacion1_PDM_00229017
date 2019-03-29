package com.example.evaluacion1_pdm_00229017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_send;
    LinearLayout btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    TextView tv_cont1, tv_cont2, tv_cont3, tv_cont4, tv_cont5, tv_cont6, tv_cont7, tv_cont8, tv_cont9;
    EditText et_username, et_mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {

    }
}
