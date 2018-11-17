package com.ankur.biggernumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int num1;
    int num2;
    int c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gen();
        }



    public void gen()
    {
        Random rand=new Random();
        num1= rand.nextInt(101);
        Button number1=(Button)findViewById(R.id.b1);
        String myString1=String.valueOf(num1);
        number1.setText(myString1);

        num2= rand.nextInt(101);
        Button number2=(Button)findViewById(R.id.b2);
        String myString2=String.valueOf(num2);
        number2.setText(myString2);

    }

    public void btn1(View view)
    {
        if(num1>num2)
        {
            Toast.makeText(this, "Right answer", Toast.LENGTH_SHORT).show();
            c++;
            TextView tv1=(TextView)findViewById(R.id.score);
            String sc=String.valueOf(c);
            tv1.setText("Points : " +sc);
        }
        else
        {
            Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show();
            c--;
            if(c<0)
            {
                c=0;
                TextView tv1=(TextView)findViewById(R.id.score);

                tv1.setText("Points : 0");
            }

            TextView tv1=(TextView)findViewById(R.id.score);
            String sc=String.valueOf(c);
            tv1.setText("Points : " +sc);
        }
        gen();
    }
    public void btn2(View view)
    {
        if(num2>num1)
        {
            Toast.makeText(this, "Right answer", Toast.LENGTH_SHORT).show();
            c++;
            TextView tv1=(TextView)findViewById(R.id.score);
            String sc=String.valueOf(c);
            tv1.setText("Points : " +sc);
        }
        else
        {
            Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show();
            c--;
            if(c<0)
            {
                c=0;
                TextView tv1=(TextView)findViewById(R.id.score);
                tv1.setText("Points : 0");
            }
            TextView tv1=(TextView)findViewById(R.id.score);
            String sc=String.valueOf(c);
            tv1.setText("Points : " +sc);
        }
        gen();
    }
}





