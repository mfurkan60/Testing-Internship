package com.example.factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //tanımlamalar
    EditText facNumber;
    TextView result;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        definition();
        onclickvalues();
    }

    private void definition(){
        //tüm değerleri tanımladık
        facNumber = (EditText) findViewById(R.id.facNumber);
        result = (TextView) findViewById(R.id.result);
        button = (Button) findViewById(R.id.button);
    }

    public void onclickvalues(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //edit text değeri al. Edittext değeri string olarak gelmektedir.
                String tempValue = facNumber.getText().toString();
                //integer olarak çevime
                int deger = Integer.parseInt(tempValue);
                int calculateValue = calculate(deger);
                result.setText("Result is:"+calculateValue);

            }
        });
    }
    public int calculate(int n){
            if(n == 0){
                return 1;
            }else{
                return n* calculate(n-1);
            }



    }
}