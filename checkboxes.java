package my.edu.um.fsktm.myfirstandroidapplication;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

public class checkboxes extends AppCompatActivity {

    CheckBox blue_cb;
    CheckBox yellow_cb;
    CheckBox red_cb;
    ConstraintLayout background_layout;
    ImageView color_image;

    protected void pickColor(){
        background_layout = (ConstraintLayout)findViewById(R.id.background_layout);
        if(blue_cb.isChecked()){

            color_image.setImageResource(R.drawable.blue);
//            background_layout.setBackgroundColor(getResources().getColor(R.color.blue));
            Toast.makeText(getApplicationContext(), "Blue is selected", Toast.LENGTH_SHORT).show();

        }
        if(yellow_cb.isChecked()){

            color_image.setImageResource(R.drawable.yellow);
//            background_layout.setBackgroundColor(getResources().getColor(R.color.yellow));
            Toast.makeText(getApplicationContext(), "Yellow is selected", Toast.LENGTH_SHORT).show();

        }if(red_cb.isChecked()){

            color_image.setImageResource(R.drawable.red);
//            background_layout.setBackgroundColor(getResources().getColor(R.color.red));
            Toast.makeText(getApplicationContext(), "Red is selected", Toast.LENGTH_SHORT).show();

        }if (blue_cb.isChecked() && yellow_cb.isChecked()){
            color_image.setImageResource(R.drawable.green);
//            background_layout.setBackgroundColor(getResources().getColor(R.color.green));
            Toast.makeText(getApplicationContext(), "Green is selected", Toast.LENGTH_SHORT).show();

        }if(blue_cb.isChecked() && red_cb.isChecked()){
            color_image.setImageResource(R.drawable.purple);
//            background_layout.setBackgroundColor(getResources().getColor(R.color.purple));
            Toast.makeText(getApplicationContext(), "Purple is selected", Toast.LENGTH_SHORT).show();

        }if(yellow_cb.isChecked() && red_cb.isChecked()){
            color_image.setImageResource(R.drawable.orange);
//            background_layout.setBackgroundColor(getResources().getColor(R.color.orange));
            Toast.makeText(getApplicationContext(), "Orange is selected", Toast.LENGTH_SHORT).show();

        }if(yellow_cb.isChecked() && red_cb.isChecked() && blue_cb.isChecked()){
            color_image.setImageResource(R.drawable.black);
//            background_layout.setBackgroundColor(getResources().getColor(R.color.grey));
            Toast.makeText(getApplicationContext(), "All is selected", Toast.LENGTH_SHORT).show();
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkboxes);

        blue_cb = (CheckBox) findViewById(R.id.blue_cb);
        yellow_cb = (CheckBox) findViewById(R.id.yellow_cb);
        red_cb = (CheckBox) findViewById(R.id.red_cb);
        color_image = (ImageView) findViewById(R.id.color_image);

        blue_cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    pickColor();
               }
        });

        yellow_cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              pickColor();}
        });

        red_cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pickColor();}
        });

    }
}
