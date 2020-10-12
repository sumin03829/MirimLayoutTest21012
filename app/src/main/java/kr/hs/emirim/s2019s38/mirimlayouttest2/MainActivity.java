package kr.hs.emirim.s2019s38.mirimlayouttest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        LinearLayout linear1 = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);

        linear1.setBackgroundColor(Color.rgb(181,178,255));
        linear1.setOrientation(LinearLayout.VERTICAL);

        /*Button btn = new Button(this);
        btn.setText("클릭해보세요.");
        btn.setBackgroundColor(Color.rgb(128,65,217));
        btn.setTextColor(Color.WHITE);
        linear1.addView(btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Java코드로 작성한 버튼입니다.", Toast.LENGTH_LONG).show();
            }
        });*/

        editText1 = new EditText(this);
        textView1 = new TextView(this);
        Button btn = new Button(this);

        editText1.setTextSize(20);
        textView1.setTextSize(20);
        textView1.setTextColor(Color.rgb(128,65,127));
        textView1.setTypeface(Typeface.MONOSPACE, Typeface.BOLD);
        btn.setText("버튼입니다.");
        btn.setBackgroundColor(Color.rgb(225,219,88));

        linear1.addView(editText1);
        linear1.addView(btn);
        linear1.addView(textView1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("'" + editText1.getText().toString() + "'이(가) 입력되었습니다.");
            }
        });

        setContentView(linear1, params);
    }
}