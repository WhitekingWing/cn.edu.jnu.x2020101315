package cn.edu.jnu.x2020101315;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = this.findViewById(R.id.button_enter);
        EditText editText = this.findViewById(R.id.editText_score);
        TextView textView = this.findViewById(R.id.textView);
        BowlingGame bowlingGame = new BowlingGame();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enter = editText.getText().toString();
                String[] rolls = enter.split(",");
                for (int i = 0; i < rolls.length; i++) {
                    bowlingGame.roll(Integer.parseInt(rolls[i]));
                }
                textView.setText(""+bowlingGame.getScore());
            }
        });
    }
}