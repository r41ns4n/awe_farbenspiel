package farbenspiel.sabel.com.farbenspiel;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.graphics.Color.GRAY;

public class MainActivity extends Activity {

    private TextView tvWillkommen;
    private Button btn_red, btn_yellow, btn_end;
    private View root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvWillkommen = findViewById(R.id.tv_willkommen);
        btn_end = findViewById(R.id.btn_end);
        btn_red = findViewById(R.id.btn_red);
        btn_yellow = findViewById(R.id.btn_yellow);

        btn_red.setWidth(200);
        btn_end.setWidth(200);
        btn_yellow.setWidth(200);

        // View Element
        root = tvWillkommen.getRootView();

        // Event Farben
        btn_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                root.setBackgroundColor(Color.RED);
                tvWillkommen.setTextColor(Color.YELLOW);
            }
        });

        btn_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                root.setBackgroundColor(Color.YELLOW);

                tvWillkommen.setTextColor(Color.RED);
            }
        });

        btn_end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    } // END protected void onCreate
} // END class MainActivity extends Activity
