package com.widget.kang.widgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class widgetActivity extends AppCompatActivity implements View.OnClickListener{
    //1. 위젯을 정의한다.
    Button btn;
    Button cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget);
        //2.정의된 위젯변수에 xml 의 위젯 id를 가져와서 담아준다. -> R.id.btnGrid
        btn = (Button)findViewById(R.id.btnGrid);   //최상위 클래스인 View로 return을 하기 때문에 (button)으로 캐스팅 해준다.
        cal = (Button)findViewById(R.id.cal);   //최상위 클래스인 View로 return을 하기 때문에 (button)으로 캐스팅 해준다.
        //R -> xml의 ID주소값이 들어있다.
        //3.변수(위젯)을 리스터에 달아준다.
        btn.setOnClickListener(this);               //btn
        cal.setOnClickListener(this);               //btn
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch(v.getId()){

            case R.id.btnGrid:
                //안드로이드 메이저 컴포넌트를 로드하기 위해서는
                //Intent를 통해서 로드할 컴포넌트를 지정해야한다.
                intent = new Intent(this, GridActivity.class);
                                            //대상이 되는 컴포넌트(액티비티, 서비스,컨텐트 프로바이더, 브로드캐스트)
                startActivity(intent);
            case R.id.cal:
                //안드로이드 메이저 컴포넌트를 로드하기 위해서는
                //Intent를 통해서 로드할 컴포넌트를 지정해야한다.
                intent = new Intent(this, CalculatorActivity.class);
                //대상이 되는 컴포넌트(액티비티, 서비스,컨텐트 프로바이더, 브로드캐스트)
                startActivity(intent);
        }
    }
}
