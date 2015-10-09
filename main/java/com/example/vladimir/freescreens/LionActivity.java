package com.example.vladimir.freescreens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class LionActivity extends AppCompatActivity {
    private EditText LionEditText;
    private TextView LionText;
    private Switch LionSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lion);
        LionEditText = (EditText) findViewById(R.id.editText);
        LionText = (TextView)findViewById(R.id.textView);
        LionSwitch = (Switch) findViewById(R.id.monitored_switch);
        LionSwitch.setChecked(true);
        LionSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                              @Override
                                              public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                  if (isChecked) {
                                                      Toast.makeText(getApplicationContext(), "В возрасте до 2х лет львы не умеют рычать", Toast.LENGTH_LONG).show();
                                                  } else {
                                                      Toast.makeText(getApplicationContext(), "Самое маленькое сердце изо всех хищников имеет… лев", Toast.LENGTH_LONG).show();
                                                  }
                                              }
                                          }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lion, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view) {
        if (LionEditText.getText().length() == 0) {
            LionText.setText("Hello , Lion!");
        } else {
            LionText.setText("Привет, " + LionEditText.getText());
        }
    }
}
