package com.example.practical5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        e =  findViewById(R.id.e);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick() {
                onClick();
            }

            @Override
            public void onClick(View view) {
                String url=e.getText().toString();
                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                //Intent.putExtra(Intent.EXTRA_TEXT, Boolean.parseBoolean("Hello Friends"));
                startActivity(intent);
            }
        });
    }
}
