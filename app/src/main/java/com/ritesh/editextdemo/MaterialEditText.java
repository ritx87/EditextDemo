package com.ritesh.editextdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ritesh.editextdemo.utils.MoneyTextWatcher;
import com.ritesh.editextdemo.utils.NumberTextWatcher;

public class MaterialEditText extends AppCompatActivity {
    TextInputLayout textInputLayout, errorTIL;
    TextInputEditText email, editText3;
    TextView amountTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_edit_text);
        errorTIL = findViewById(R.id.errorTIL);
        editText3 = findViewById(R.id.editText3);
        editText3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > errorTIL.getCounterMaxLength()) {
                    errorTIL.setError("Number shouldn't exceed more than " + errorTIL.getCounterMaxLength());
                } else {
                    errorTIL.setError(null);
                    errorTIL.setHelperTextEnabled(true);
                    errorTIL.setHelperText("must be between 0 to 15");
                }
            }
        });

    }
}