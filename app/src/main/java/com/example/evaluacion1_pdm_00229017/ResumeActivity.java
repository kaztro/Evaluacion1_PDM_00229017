package com.example.evaluacion1_pdm_00229017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.evaluacion1_pdm_00229017.utils.AppConstants;

public class ResumeActivity extends AppCompatActivity {

    TextView tv_user, tv_mail, tv_c1, tv_c2, tv_c3, tv_c4, tv_c5, tv_c6, tv_c7, tv_c8, tv_c9, total;
    Button btn_Share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        bind();

        Bundle bundle = getIntent().getExtras();

        String getUser = bundle.getString(AppConstants.KEY_USER);
        String getMail = bundle.getString(AppConstants.KEY_MAIL);
        String getTot = bundle.getString(AppConstants.TOTAL);
        String getC1 = bundle.getString(AppConstants.C1);
        String getC2 = bundle.getString(AppConstants.C2);
        String getC3 = bundle.getString(AppConstants.C3);
        String getC4 = bundle.getString(AppConstants.C4);
        String getC5 = bundle.getString(AppConstants.C5);
        String getC6 = bundle.getString(AppConstants.C6);
        String getC7 = bundle.getString(AppConstants.C7);
        String getC8 = bundle.getString(AppConstants.C8);
        String getC9 = bundle.getString(AppConstants.C9);

        settingText(getUser, tv_user);
        settingText(getMail, tv_mail);
        settingText(getTot, total);
        settingText(getC1, tv_c1);
        settingText(getC2, tv_c2);
        settingText(getC3, tv_c3);
        settingText(getC4, tv_c4);
        settingText(getC5, tv_c5);
        settingText(getC6, tv_c6);
        settingText(getC7, tv_c7);
        settingText(getC8, tv_c8);
        settingText(getC9, tv_c9);

        String info = "Usuario: "
                + getUser
                + "Correo: "
                + getMail
                + "Total: "
                + getTot
                +"Producto 1: "
                + getC1
                +"Producto 2: "
                + getC2
                +"Producto 3: "
                + getC3
                +"Producto 4: "
                + getC4
                +"Producto 5: "
                + getC5
                +"Producto 6: "
                + getC6
                +"Producto 7: "
                + getC7
                +"Producto 8: "
                + getC8
                +"Producto 9: "
                + getC9;

        btn_Share.setOnClickListener(v -> {
            Intent mI = new Intent();
            mI.setAction(Intent.ACTION_SEND);
            mI.setType("text/plain");
            mI.putExtra(Intent.EXTRA_TEXT, info);
            startActivity(mI);
        });
    }

    private void bind() {
        tv_user = findViewById(R.id.user_name_resume);
        tv_mail = findViewById(R.id.user_mail_resume);
        tv_c1 = findViewById(R.id.tv_cont1_resume);
        tv_c2 = findViewById(R.id.tv_cont2_resume);
        tv_c3 = findViewById(R.id.tv_cont3_resume);
        tv_c4 = findViewById(R.id.tv_cont4_resume);
        tv_c5 = findViewById(R.id.tv_cont5_resume);
        tv_c6 = findViewById(R.id.tv_cont6_resume);
        tv_c7 = findViewById(R.id.tv_cont7_resume);
        tv_c8 = findViewById(R.id.tv_cont8_resume);
        tv_c9 = findViewById(R.id.tv_cont9_resume);
        total = findViewById(R.id.insert_total);

        btn_Share = findViewById(R.id.btn_share);
    }

    private void settingText(String text, TextView tv) {
        tv.setText(text);
    }

}
