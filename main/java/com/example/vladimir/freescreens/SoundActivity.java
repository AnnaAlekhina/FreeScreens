package com.example.vladimir.freescreens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class SoundActivity extends AppCompatActivity {
    private TextView DogTextView;
    private TextView SheepTextView;
    private TextView CatTextView;
    private TextView ChickenTextView;
    private TextView DuckTextView;
    private TextView CowTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound);
        DogTextView = (TextView)findViewById(R.id.textViewDog);
        SheepTextView = (TextView)findViewById(R.id.textViewSheep);
        CatTextView = (TextView)findViewById(R.id.textViewCat);
        ChickenTextView = (TextView)findViewById(R.id.textViewChicken);
        DuckTextView = (TextView)findViewById(R.id.textViewDuck);
        CowTextView = (TextView)findViewById(R.id.textViewCow);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sound, menu);
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

    public void onClickDog(View view) {
        DogTextView.setText("ГАВ! ГАВ! ГАВ ");
    }

    public void onClickSheep(View view) {
        SheepTextView.setText("Мее! Мее! Мее! ");
    }

    public void onClickCat(View view) {
        CatTextView.setText("Мяу! Мяу! Мяу! ");
    }

    public void onClickDuck(View view) {
        DuckTextView.setText("Кря! Кряу! Кря! ");
    }

    public void onClickChicken(View view) {
        ChickenTextView.setText("Ку - Ка - Ре - Ку! ");
    }

    public void onClickCow(View view) {
        CowTextView.setText("Муу! Муу! Муу! ");
    }
}
