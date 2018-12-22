package com.bynalab.pc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Bynalab on 7/1/2017.
 */

public class combination extends Activity {

    EditText n;
    EditText r;
    TextView c;
    TextView output;
    Button solve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.combination);

        n = (EditText)findViewById(R.id.n);
        r = (EditText)findViewById(R.id.r);
        c = (TextView)findViewById(R.id.p);
        output = (TextView)findViewById(R.id.output);
        solve = (Button)findViewById(R.id.solve);

        solve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ed_text_n = n.getText().toString().trim();
                String ed_text_r = r.getText().toString().trim();

                if (ed_text_n.isEmpty() || ed_text_n.length() == 0 || ed_text_n.equals("") || ed_text_n == null) {
                    output.setText("Input n");
                } else if (ed_text_r.isEmpty() || ed_text_r.length() == 0 || ed_text_r.equals("") || ed_text_r == null) {
                    output.setText("Input r");

                } else {

                    int nth = Integer.parseInt(n.getText().toString());
                    int rth = Integer.parseInt(r.getText().toString());

                    long n_factorial = 1;
                    long sub = (nth - rth);
                    long sub_factorial = 1;
                    long r_factorial = 1;

                    for (int i = 1; i <= nth; i++) {


                        n_factorial = n_factorial * i;

                    }

                    for (int i = 1; i <= sub; i++) {


                        sub_factorial = sub_factorial * i;

                    }

                    for (int i = 1; i <= rth; i++) {


                        r_factorial = r_factorial * i;

                    }

                    long compute = (n_factorial / (sub_factorial * r_factorial));

                    output.setText(nth + "C" + rth + " = " + String.valueOf(compute));

                }
            }
        });

    }
}