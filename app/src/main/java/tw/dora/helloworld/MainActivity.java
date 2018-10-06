package tw.dora.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    //只要是on開頭的方法,都有生命週期,不是拿來呼叫的,而是先定義在這邊
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.Lottery);

    }

    public void text(View view) {
        HashSet<Integer> set = new HashSet<>();
        while (set.size()<6){
            set.add((int)(Math.random()*49+1));
        }
        String temp = set.toString();

        textView.setText(temp);
    }
}
