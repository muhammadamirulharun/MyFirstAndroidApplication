package my.edu.um.fsktm.myfirstandroidapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    EditText input_num1;
    EditText input_num2;
    Button add_btn;
    TextView result_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void Addition (View view){
        input_num1 = (EditText)findViewById(R.id.input_num1);
        input_num2 = (EditText)findViewById(R.id.input_num2);
        result_text = (TextView)findViewById(R.id.result_text);

        int result = Integer.parseInt(input_num1.getText().toString()) + Integer.parseInt(input_num2.getText().toString());

        result_text.setText(Integer.toString(result));
    }
}
