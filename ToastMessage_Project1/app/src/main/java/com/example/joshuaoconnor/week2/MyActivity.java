package com.example.joshuaoconnor.week2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.view.View;


public class MyActivity extends ActionBarActivity {

    @Override //overrides any kind of disturbance.  Say Applications are running on app, other button gets pressed.  I want listener to be listening for button regardless of what is going on.//
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        //grab our button!!! toast_button is an ID in button in activity_my_xml in <button//
        Button btn = (Button)findViewById(R.id.toast_button);
        OnClickListener listener = new OnClickListener() {
            //overrides anything that happens when button clicks!//
            @Override
            public void onClick(View v){
                //Displays Toast Message//
                Toast.makeText(getBaseContext(),"Hi Josh",Toast.LENGTH_SHORT).show();
            }//closes onClick//
        };//closes onClickListener
        btn.setOnClickListener(listener);
    }//closes onCreate



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
