package com.widget.kang.widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener{
    int number_value;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnPlus,btnMinus,btnMulti,btnDiv,btnequal,btncancel;
    TextView tv,tv2;
    String str,result;
    String sentance;
    ArrayList<Integer> buhoarray = new ArrayList<>();
    ArrayList<Double> valuearray = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        result = "";
        sentance = "";
        tv = (TextView)findViewById(R.id.textView2);
        tv2 = (TextView)findViewById(R.id.showPart);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btn0 = (Button)findViewById(R.id.btn0);
        btnPlus = (Button)findViewById(R.id.btnPlus);
        btnMinus= (Button)findViewById(R.id.btnMinus);
        btnMulti= (Button)findViewById(R.id.btnMul);
        btnDiv= (Button)findViewById(R.id.btnDiv);
        btnequal= (Button)findViewById(R.id.btnEqual);
        btncancel= (Button)findViewById(R.id.btnCancel);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btncancel.setOnClickListener(this);
        btnequal.setOnClickListener(this);
        tv.setOnClickListener(this);
        tv2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btn0 :
                str = btn0.getText().toString();
                result = result + str;
                sentance = sentance + str;
                tv.setText(result);
                tv2.setText(result);
                break;
            case R.id.btn1 :
                str = btn1.getText().toString();
                result = result + str;
                sentance = sentance + str;
                tv.setText(result);
                tv2.setText(result);
                break;
            case R.id.btn2 :
                str = btn2.getText().toString();
                result = result + str;
                sentance = sentance + str;
                tv.setText(result);
                tv2.setText(result);
                break;
            case R.id.btn3 :
                str = btn3.getText().toString();
                result = result + str;
                sentance = sentance + str;
                tv.setText(result);
                tv2.setText(result);
                break;
            case R.id.btn4 :
                str = btn4.getText().toString();
                result = result + str;
                sentance = sentance + str;
                tv.setText(result);
                tv2.setText(result);
                break;
            case R.id.btn5 :
                str = btn5.getText().toString();
                result = result + str;
                sentance = sentance + str;
                tv.setText(result);
                tv2.setText(result);
                break;
            case R.id.btn6:
                str = btn6.getText().toString();
                result = result + str;
                sentance = sentance + str;
                tv.setText(result);
                tv2.setText(result);
                break;
            case R.id.btn7 :
                str = btn7.getText().toString();
                result = result + str;
                sentance = sentance + str;
                tv.setText(result);
                tv2.setText(result);
                break;
            case R.id.btn8 :
                str = btn8.getText().toString();
                result = result + str;
                sentance = sentance + str;
                tv.setText(result);
                tv2.setText(result);
                break;
            case R.id.btn9 :
                str = btn9.getText().toString();
                result = result + str;
                sentance = sentance + str;
                tv.setText(result);
                tv2.setText(result);
                break;

            case R.id.btnPlus :
                result = result + "+";
                sentance = sentance + " ";
                tv.setText(result);
                tv2.setText(result);
                buhoarray.add(1);
                break;

            case R.id.btnMinus :

                result = result + "-";
                sentance = sentance + " ";
                tv.setText(result);
                tv2.setText(result);
                buhoarray.add(2);
                break;

            case R.id.btnMul :
                result = result + "*";
                sentance = sentance + " ";
                tv.setText(result);
                tv2.setText(result);
                buhoarray.add(3);
                break;

            case R.id.btnDiv :
                result = result + "/";
                sentance = sentance + " ";
                tv.setText(result);
                tv2.setText(result);
                buhoarray.add(4);
                break;

            case R.id.btnCancel :
                result = "";
                sentance = "";
                valuearray.clear();
                buhoarray.clear();
                tv.setText("Result : ");
                break;

            case R.id.btnEqual :
                int result = 0,i,j;
                String array[] = sentance.split(" ");

                for(i = 0 ; i < array.length ; i ++)
                    valuearray.add(Double.parseDouble(array[i])) ;



                j = buhoarray.size();
                for(i = 0 ; i < j ; i++){
                    if(buhoarray.get(i) == 3) {
                        valuearray.set(i + 1, valuearray.get(i) * valuearray.get(i + 1));
                        valuearray.set(i,0.0);
                    }
                    else if(buhoarray.get(i) == 4) {
                        valuearray.set(i + 1, valuearray.get(i) / valuearray.get(i + 1));
                        valuearray.set(i,0.0);
                    }
                }
                int Max = valuearray.size();
                for(i = 0 ; i <  Max ; i ++) {
                    if (valuearray.contains(0.0)) {
                        j = valuearray.indexOf(0.0);
                        valuearray.remove(j);
                    }
                    if (buhoarray.contains(3)) {
                        j = buhoarray.indexOf(3);
                        buhoarray.remove(j);
                    }
                    if (buhoarray.contains(4)) {
                        j = buhoarray.indexOf(4);
                        buhoarray.remove(j);
                    }
                }
                j = buhoarray.size();
                for(i = 0 ; i < buhoarray.size() ; i++){
                    if(buhoarray.get(i) == 1.0) {
                        valuearray.set(i + 1, valuearray.get(i) + valuearray.get(i + 1));
                        valuearray.set(i,0.0);
                    }
                    else if(buhoarray.get(i) == 2.0) {
                        valuearray.set(i + 1, valuearray.get(i) - valuearray.get(i + 1));
                        valuearray.set(i,0.0);
                    }

                }
                Max = valuearray.size();
                for(i = 0 ; i <  Max ; i ++){
                    if(valuearray.contains(0.0)) {
                        j = valuearray.indexOf(0.0);
                        valuearray.remove(j);
                    }
                }
                tv.setText(String.valueOf(valuearray.get(0)));
                break;
        }
    }
}
