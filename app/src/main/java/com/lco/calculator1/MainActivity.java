package com.lco.calculator1;

import android.app.slice.Slice;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button Button0, Button1,Button2,Button3, Button4,Button5,Button6, Button7,Button8,Button9, Buttonac,Buttonmul,Buttondiv,Buttonplus,Buttonminus,Buttondot,Buttonequal,Buttonpercentile;
TextView num;
    
//     bhai accept kr pull request

float value1, value2,value3;
boolean sum,subtraction,division,multiply,percentile;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    getSupportActionBar().hide();//hiding the title bar
    this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);//for full screen

    Button0=findViewById(R.id.btn0);
        Button1=findViewById(R.id.btn1);
        Button2=findViewById(R.id.btn2);
        Button3=findViewById(R.id.btn3);
        Button4=findViewById(R.id.btn4);
        Button5=findViewById(R.id.btn5);
        Button6=findViewById(R.id.btn6);
        Button7=findViewById(R.id.btn7);
        Button8=findViewById(R.id.btn8);
        Button9=findViewById(R.id.btn9);
        Buttonac=findViewById(R.id.ac);
        Buttondiv=findViewById(R.id.divide);
        Buttonequal=findViewById(R.id.equal);
        Buttonminus=findViewById(R.id.minus);
        Buttonpercentile=findViewById(R.id.percentile);
        Buttonmul=findViewById(R.id.multi);
        Buttonplus=findViewById(R.id.plus);
        Buttondot=findViewById(R.id.btndot);
        num=findViewById(R.id.number);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num.setText(num.getText()+"1");
            }
        });
    Button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num.setText(num.getText()+"2");
        }
    });
    Button3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num.setText(num.getText()+"3");
        }
    });
    Button4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num.setText(num.getText()+"4");
        }
    });
    Button5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num.setText(num.getText()+"5");
        }
    });
    Button6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num.setText(num.getText()+"6");
        }
    });
    Button7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num.setText(num.getText()+"7");
        }
    });
    Button8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num.setText(num.getText()+"8");
        }
    });
    Button9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num.setText(num.getText()+"9");
        }
    });
    Button0.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            num.setText(num.getText()+"0");
        }
    });
    Buttonac.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           // num.setText("");
            String textString = num.getText().toString();
            if( textString.length() > 0 ) {
                num.setText(textString.substring(0, textString.length() - 1 ));
                //text.setSelection(text.getText().length());//position cursor at the end of the line
            }

        }
    });
    Buttonac.setOnLongClickListener(new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            num.setText("");
            return false;
        }
    });

    Buttondot.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           // num.setText(num.getText()+".");

if(num.getText().toString()=="")
{
    num.setText("0");
}
 /*           if(count==0)
            {
                count++;
            num.setText( num.getText() + ".");
            }
            else
            {
            }*/

String s=num.getText().toString();
int y=s.length();
char g[]=new char[y];
g=s.toCharArray();
int count=0;
for(int i=0;i<y;i++) {
    if (g[i] == '.') {
        count++;
    } else {
        count = count;
    }
}
    if(count==0)
    {
        num.setText(num.getText()+".");
    }
    else{
        Toast.makeText(MainActivity.this, "already exist", Toast.LENGTH_SHORT).show();
       // num.setText(num.getText());
    }

        }
    });
    Buttonplus.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(num.getText()=="")
            {
                num.setText("");
            }
            else
            {
                value1=Float.parseFloat(num.getText().toString());
                num.setText(num.getText()+" ");
               sum=true;
              num.setText("");
num.setText("+");
num.setText(null);

            }
        }
    });
    Buttonminus.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(num.getText()=="")
            {
                num.setText("");
            }
            else
            {
                value1=Float.parseFloat(num.getText().toString());
                num.setText(num.getText()+" ");
                subtraction=true;
              num.setText("");
num.setText("-");
num.setText(null);

            }
        }
    });
    Buttonmul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(num.getText()=="")
            {
                num.setText("");
            }
            else
            {
                value1=Float.parseFloat(num.getText().toString());
                num.setText(num.getText()+" ");
                multiply=true;
                num.setText("");
                num.setText("*");
                num.setText("");


            }
        }
    });
    Buttonpercentile.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(num.getText()=="")
            {
                num.setText("");
            }
            else
            {
                value1=Float.parseFloat(num.getText().toString());
                num.setText(num.getText()+" ");
               percentile =true;
                num.setText("");
                num.setText("%");
                num.setText(null);


            }
        }
    });
    Buttondiv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(num.getText()=="")
            {
                num.setText("");
            }
            else
            {
                value1=Float.parseFloat(num.getText().toString());
                num.setText(num.getText()+" ");
                division=true;
                num.setText("");
                num.setText("/");
                num.setText(null);


            }
        }
    });
    Buttonequal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(num.getText()=="")
            {
                num.setText("");
            }
            else{

            value2=Float.parseFloat(num.getText().toString());

            if(sum==true)
            {
                num.setText("");
                value3=value1+value2;
                num.setText(value1+value2+" ");
                sum=false;


            }
            if(subtraction==true)
            {
                num.setText("");
                value3=value1+value2;
                num.setText(value1-value2+" ");
                subtraction=false;


            }
            if(multiply==true)
            {
                num.setText("");
                value3=value1+value2;
                num.setText(value1*value2+" ");
                multiply=false;


            }
            if(division==true)
            {
                num.setText("");
                value3=value1+value2;
                num.setText(value1/value2+" ");
                division=false;


            }
            if(percentile==true)
            {
                num.setText("");
                num.setText(value1%value2+" ");
                division=false;


            }


            }


        }
    });







}
}
