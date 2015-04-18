package com.labatm.jimmydai.circleprogress;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.labatm.jimmydai.circleprogress.dialoglib.MyCircleProgressDialog;

public class MainActivity extends ActionBarActivity {

    MyCircleProgressDialog myCircleProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCircleProgressDialog = new MyCircleProgressDialog(this);
        myCircleProgressDialog.showMyCircleProgress("Loading", 5);
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
            myCircleProgressDialog.showMyCircleProgress("Setting", 5);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
