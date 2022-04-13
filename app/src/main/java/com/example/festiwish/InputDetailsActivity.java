package com.example.festiwish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;


import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;
import android.widget.Toast;

import java.net.URLEncoder;


public class InputDetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_details);
        EditText edittext = findViewById(R.id.edittext);
        Button send = findViewById(R.id.send);


        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String nm = edittext.getText().toString();

                String msg = "Hello There " + nm + ", Wish You and You Family A Very Happy Holi. Wishing you and your family success, happiness and prosperity this Holi and always! Have a colorful and joyous Holi!\n May all the seven of the rainbow bring cheer in your life. Happy Holi! ";

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, msg);
                intent.setPackage("com.whatsapp");
                startActivity(intent);

            }
        });

    }
}