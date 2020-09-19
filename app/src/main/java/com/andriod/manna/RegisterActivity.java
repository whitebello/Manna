package com.andriod.manna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.andriod.manna.R;

public class RegisterActivity extends AppCompatActivity {

    Button btn_reg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btn_reg1 = findViewById(R.id.btn_reg1);

        btn_reg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Register2Activity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}
