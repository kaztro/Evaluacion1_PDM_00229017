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
    //LinearLayout btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    TextView tv_cont1, tv_cont2, tv_cont3, tv_cont4, tv_cont5, tv_cont6, tv_cont7, tv_cont8, tv_cont9, p1, p2, p3, p4, p5, p6, p7, p8, p9;
    EditText et_username, et_mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bind();

        tv_cont1.setOnClickListener(this);
        tv_cont2.setOnClickListener(this);
        tv_cont3.setOnClickListener(this);
        tv_cont4.setOnClickListener(this);
        tv_cont5.setOnClickListener(this);
        tv_cont6.setOnClickListener(this);
        tv_cont7.setOnClickListener(this);
        tv_cont8.setOnClickListener(this);
        tv_cont9.setOnClickListener(this);
    }

    private void bind() {
        ///EL BOTON////////////////////////////
        btn_send = findViewById(R.id.btn_send);
        /*//LOS "BOTONES"///////////////////////
        btn1 = findViewById(R.id.LL_FirstBtn);
        btn2 = findViewById(R.id.LL_SecondB);
        btn3 = findViewById(R.id.LL_ThirdB);
        btn4 = findViewById(R.id.LL_FourthBtn);
        btn5 = findViewById(R.id.LL_FifthB);
        btn6 = findViewById(R.id.LL_SixthB);
        btn7 = findViewById(R.id.LL_SeventhBtn);
        btn8 = findViewById(R.id.LL_eightB);
        btn9 = findViewById(R.id.LL_NineB);*/
        ///LOS CONTADORES/////////////////////
        tv_cont1 = findViewById(R.id.tv_cont1);
        tv_cont2 = findViewById(R.id.tv_cont2);
        tv_cont3 = findViewById(R.id.tv_cont3);
        tv_cont4 = findViewById(R.id.tv_cont4);
        tv_cont5 = findViewById(R.id.tv_cont5);
        tv_cont6 = findViewById(R.id.tv_cont6);
        tv_cont7 = findViewById(R.id.tv_cont7);
        tv_cont8 = findViewById(R.id.tv_cont8);
        tv_cont9 = findViewById(R.id.tv_cont9);
        ///LOS PRODUCTOS///////////////////////
        ///LOS EDITS///////////////////////////
        et_username = findViewById(R.id.et_usuario);
        et_mail = findViewById(R.id.et_mail);
    }

    private void countPP(TextView tv, int cont) {
        tv.setText(cont);
    }

    @Override
    public void onClick(View v) {
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0;
        switch (v.getId()) {
            case R.id.tv_cont1:
                c1++;
                countPP(tv_cont1, c1);
                break;
            case R.id.tv_cont2:
                c2++;
                countPP(tv_cont2, c2);
                break;
            case R.id.tv_cont3:
                c3++;
                countPP(tv_cont3, c3);
                break;
            case R.id.tv_cont4:
                c4++;
                countPP(tv_cont4, c4);
                break;
            case R.id.tv_cont5:
                c5++;
                countPP(tv_cont5, c5);
                break;
            case R.id.tv_cont6:
                c6++;
                countPP(tv_cont6, c6);
                break;
            case R.id.tv_cont7:
                c7++;
                countPP(tv_cont7, c7);
                break;
            case R.id.tv_cont8:
                c8++;
                countPP(tv_cont8, c8);
                break;
            case R.id.tv_cont9:
                c9++;
                countPP(tv_cont9, c9);
                break;
            default:
                break;
        }
    }
}
