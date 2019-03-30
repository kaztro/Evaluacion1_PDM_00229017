package com.example.evaluacion1_pdm_00229017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.evaluacion1_pdm_00229017.utils.AppConstants;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_send;
    LinearLayout btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    TextView tv_cont1, tv_cont2, tv_cont3, tv_cont4, tv_cont5, tv_cont6, tv_cont7, tv_cont8, tv_cont9, p1, p2, p3, p4, p5, p6, p7, p8, p9;
    EditText et_username, et_mail;
    int c1, c2, c3, c4, c5, c6, c7, c8, c9, total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bind();

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn_send.setOnClickListener(this);
    }

    private void bind() {
        btn_send = findViewById(R.id.btn_send);

        btn1 = findViewById(R.id.LL_FirstBtn);
        btn2 = findViewById(R.id.LL_SecondB);
        btn3 = findViewById(R.id.LL_ThirdB);
        btn4 = findViewById(R.id.LL_FourthBtn);
        btn5 = findViewById(R.id.LL_FifthB);
        btn6 = findViewById(R.id.LL_SixthB);
        btn7 = findViewById(R.id.LL_SeventhBtn);
        btn8 = findViewById(R.id.LL_eightB);
        btn9 = findViewById(R.id.LL_NineB);

        tv_cont1 = findViewById(R.id.tv_cont1);
        tv_cont2 = findViewById(R.id.tv_cont2);
        tv_cont3 = findViewById(R.id.tv_cont3);
        tv_cont4 = findViewById(R.id.tv_cont4);
        tv_cont5 = findViewById(R.id.tv_cont5);
        tv_cont6 = findViewById(R.id.tv_cont6);
        tv_cont7 = findViewById(R.id.tv_cont7);
        tv_cont8 = findViewById(R.id.tv_cont8);
        tv_cont9 = findViewById(R.id.tv_cont9);

        et_username = findViewById(R.id.et_usuario);
        et_mail = findViewById(R.id.et_mail);

        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;
        c5 = 0;
        c6 = 0;
        c7 = 0;
        c8 = 0;
        c9 = 0;
    }

    private void countPP(TextView tv, int cont) {
        tv.setText(cont + "");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.LL_FirstBtn:
                c1 += 1;
                countPP(tv_cont1, c1);
                break;
            case R.id.LL_SecondB:
                c2 += 1;
                countPP(tv_cont2, c2);
                break;
            case R.id.LL_ThirdB:
                c3 += 1;
                countPP(tv_cont3, c3);
                break;
            case R.id.LL_FourthBtn:
                c4 += 1;
                countPP(tv_cont4, c4);
                break;
            case R.id.LL_FifthB:
                c5 += 1;
                countPP(tv_cont5, c5);
                break;
            case R.id.LL_SixthB:
                c6 += 1;
                countPP(tv_cont6, c6);
                break;
            case R.id.LL_SeventhBtn:
                c7 += 1;
                countPP(tv_cont7, c7);
                break;
            case R.id.LL_eightB:
                c8 += 1;
                countPP(tv_cont8, c8);
                break;
            case R.id.LL_NineB:
                c9 += 1;
                countPP(tv_cont9, c9);
                break;
            case R.id.btn_send:
                total = c1+c2+c3+c4+c5+c6+c7+c8+c9;
                Intent mIntent = new Intent(MainActivity.this, ResumeActivity.class);
                sendingIntents(mIntent, AppConstants.KEY_USER, et_username.getText().toString());
                sendingIntents(mIntent, AppConstants.KEY_MAIL, et_mail.getText().toString());
                sendingIntents(mIntent, AppConstants.C1, c1 + "");
                sendingIntents(mIntent, AppConstants.C2, c2 + "");
                sendingIntents(mIntent, AppConstants.C3, c3 + "");
                sendingIntents(mIntent, AppConstants.C4, c4 + "");
                sendingIntents(mIntent, AppConstants.C5, c5 + "");
                sendingIntents(mIntent, AppConstants.C6, c6 + "");
                sendingIntents(mIntent, AppConstants.C7, c7 + "");
                sendingIntents(mIntent, AppConstants.C8, c8 + "");
                sendingIntents(mIntent, AppConstants.C9, c9 + "");
                sendingIntents(mIntent, AppConstants.TOTAL, total + "");
                startActivity(mIntent);
                break;
            default:
                break;
        }
    }

    private void sendingIntents(Intent i, String k, String c) {
        i.putExtra(k, c);
    }
}
