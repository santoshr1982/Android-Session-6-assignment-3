package app.menu.sub.rsantosh.com.submenuapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
/*This program has been written by R.Santosh on 12.06.2016. To display the usage of the Sub Menu in android.*/
public class SubMenu extends AppCompatActivity {

    //Declaration of text view.
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_menu);

        //Initialisation of text view.
        mTextView = (TextView) findViewById(R.id.sub_menu_xml);

    }

    // This code is written to create the menu on th UI.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        //
        //Declaring and initialisation of Menu inflater.
        MenuInflater menuInflater = getMenuInflater();
        //Calling the menu item from the respective XML files.
        menuInflater.inflate(R.menu.sub_menu,menu);

        return true;
    }

    //This code has been written to activate the click listener on the menu item.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //Beginning of the switch statement.
        switch (item.getItemId()){


            //Case statement to change the color of the font to red.
            case R.id.red:

                mTextView.setTextColor(Color.rgb(200,0,0));
                break;

            //Case statement to change the color of the font to green.
            case R.id.green:

                mTextView.setTextColor(Color.rgb(0,200,0));
                break;

            //Case statement to change the color of the font to blue.
            case R.id.blue:

                mTextView.setTextColor(Color.rgb(0,0,200));
                break;

        }

        return true;
    }
}
