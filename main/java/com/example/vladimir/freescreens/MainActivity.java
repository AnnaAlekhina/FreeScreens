package com.example.vladimir.freescreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void onClickLion(View view) {
    Intent intent=new Intent(MainActivity.this,LionActivity.class);
        startActivity(intent);
    }

    public void onClickFlamingo(View view) {
        Intent intent2=new Intent(MainActivity.this,FlamingoActivity.class);
        startActivity(intent2);
    }

    public void onClickSecret(View view) {
        Intent intent3=new Intent(MainActivity.this,SoundActivity.class);
        startActivity(intent3);
    }
}
