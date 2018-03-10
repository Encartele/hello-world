package net.cidnet.customer.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   public TextView hwtv;
   public Button hwbtn;
   public int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hwtv = findViewById(R.id.hwTV);
        hwbtn = findViewById(R.id.hwBtn);
        hwbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                hwtv.setText("You have pressed the Hello World button " +  i + " time(s)!!");
            }
        });
    }
}
