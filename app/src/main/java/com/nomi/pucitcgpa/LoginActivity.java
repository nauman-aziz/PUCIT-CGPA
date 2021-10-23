package com.nomi.pucitcgpa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {
    EditText _nameText , _emailText  ;
    Button _loginButton ;
    ImageView _imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Fade fade = new Fade();
        View decor = getWindow().getDecorView();
        fade.excludeTarget(decor.findViewById(R.id.action_bar_container), true);
        fade.excludeTarget(android.R.id.statusBarBackground, true);
        fade.excludeTarget(android.R.id.navigationBarBackground, true);
        fade.excludeTarget(android.R.id.background , true);

        _nameText = findViewById(R.id.input_name);
        _emailText = findViewById(R.id.input_email);
        _loginButton = findViewById(R.id.btn_login);
        _imageView = findViewById(R.id.image_activity_1);


    }


}