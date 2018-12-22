package com.bynalab.pc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button factorial;
    Button permutation;
    Button combination;
    TextView courtesy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factorial = (Button)findViewById(R.id.factorial);
        permutation = (Button)findViewById(R.id.permutation);
        combination = (Button)findViewById(R.id.combination);
        courtesy = (TextView)findViewById(R.id.courtesy);

        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent_factorial = new Intent(MainActivity.this, factorial.class);
                startActivity(intent_factorial);

            }
        });
        permutation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent_permutation = new Intent(MainActivity.this, permutation.class);
                startActivity(intent_permutation);
            }
        });

        combination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent_combination = new Intent(MainActivity.this, combination.class);
                startActivity(intent_combination);
            }
        });


    }
}
