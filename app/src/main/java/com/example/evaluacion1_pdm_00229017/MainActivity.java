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

    private void bind() {
        btn1 = findViewById(R.id.LL_FirstBtn);
        btn2 = findViewById(R.id.LL_SecondB);
        btn3 = findViewById(R.id.LL_ThirdB);
        btn4 = findViewById(R.id.LL_FourthBtn);
        btn5 = findViewById(R.id.LL_FifthB);
        btn6 = findViewById(R.id.LL_SixthB);
        btn7 = findViewById(R.id.LL_SeventhBtn);
        btn8 = findViewById(R.id.LL_eightB);
        btn9 = findViewById(R.id.LL_NineB);
    }

    private void countPP() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.LL_FirstBtn:
                break;
            case R.id.LL_SecondB:
                break;
            case R.id.LL_ThirdB:
                break;
            case R.id.LL_FourthBtn:
                break;
            case R.id.LL_FifthB:
                break;
            case R.id.LL_SixthB:
                break;
            case R.id.LL_SeventhBtn:
                break;
            case R.id.LL_eightB:
                break;
            case R.id.LL_NineB:
                break;
            default:
                break;
        }
    }
}
