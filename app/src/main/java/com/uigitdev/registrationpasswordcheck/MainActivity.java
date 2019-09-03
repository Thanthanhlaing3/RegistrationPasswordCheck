package com.uigitdev.registrationpasswordcheck;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {
    private EditText email_input_field, password_input_field;
    private TextView email_error_text;
    private CardView p_item_1_icon_parent, p_item_2_icon_parent, p_item_3_icon_parent, p_item_4_icon_parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
