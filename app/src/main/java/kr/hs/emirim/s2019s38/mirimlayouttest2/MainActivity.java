package kr.hs.emirim.s2019s38.mirimlayouttest2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linear1=new LinearLayout(this);
        LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                                                                        LinearLayout.LayoutParams.MATCH_PARENT);
        linear1.setBackgroundColor(Color.rgb(181,178,255));
        linear1.setOrientation(LinearLayout.VERTICAL);

        /*Button btn=new Button(this);
        btn.setText("클릭하세요");
        btn.setBackgroundColor(Color.rgb(128,65,217));
        btn.setTextColor(Color.WHITE);
        linear1.addView(btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"JAVA코드로 작성한 버튼 입니다.",Toast.LENGTH_LONG).show();
            }
        });*/
        TextView textv=new TextView(this);
        textv.setText("It Cookbook, Android");
        linear1.addView(textv);

        Button btn=new Button(this);
        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.YELLOW);
        linear1.addView(btn);


        setContentView(linear1,params);
//        setContentView(R.layout.activity_main);
    }
}