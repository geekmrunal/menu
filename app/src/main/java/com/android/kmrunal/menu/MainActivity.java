package com.android.kmrunal.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        CharSequence str;
        // Find first menu item TextView and print the text to the logs
        TextView menu1 = (TextView) findViewById(R.id.menu_item_1);
        str = menu1.getText();
        Log.i("mkmk"," \n We clicked" + str );
        // Find second menu item TextView and print the text to the logs
        TextView menu2 = (TextView) findViewById(R.id.menu_item_2);
        str = menu2.getText();
        Log.i("mkmk"," \n We clicked" + str );
        // Find third menu item TextView and print the text to the logs
        TextView menu3 = (TextView) findViewById(R.id.menu_item_3);
        str = menu3.getText();
        Log.i("mkmk"," \n We clicked" + str );
    }
}
