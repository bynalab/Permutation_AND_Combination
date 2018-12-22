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

public class factorial extends Activity {

    EditText n;
    Button solve;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.factorial);

        n = (EditText)findViewById(R.id.n);
        solve = (Button)findViewById(R.id.solve);
        output = (TextView)findViewById(R.id.output);

        solve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ed_text_n = n.getText().toString().trim();

                if (ed_text_n.isEmpty() || ed_text_n.length() == 0 || ed_text_n.equals("") || ed_text_n == null) {
                    output.setText("Input n");

                } else {

                    long nth = Integer.parseInt(n.getText().toString());
                    long factorial = 1;

                    for (int i = 1; i <= nth; i++) {


                        factorial = factorial * i;

                    }

                    output.setText(nth + "! = " + String.valueOf(factorial));

                }
            }
        });

    }
}
