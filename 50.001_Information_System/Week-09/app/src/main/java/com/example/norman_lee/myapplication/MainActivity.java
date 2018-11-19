package com.example.norman_lee.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonConvert;
    Button buttonSetExchangeRate;
    EditText editTextValue;
    TextView textViewResult;
    TextView textViewExchangeRate;
    double exchangeRate;
    public final String TAG = "Logcat";
    private SharedPreferences mPreferences;
    private String sharedPrefFile = "com.example.android.mainsharedprefs";
    public static final String RATE_KEY = "Rate_Key";
    public static final String EXCH_KEY = "Exch_Key";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 4.5 Get a reference to the sharedPreferences object
        mPreferences = getSharedPreferences(sharedPrefFile, MODE_PRIVATE);

        //TODO 4.6 Retrieve the value using the key, and set a default when there is none
        String rate_text = mPreferences.getString(RATE_KEY, "0.0");
        String exch_text = mPreferences.getString(EXCH_KEY,
                String.valueOf(ExchangeRate.calculateExchangeRate()));

        //TODO 3.13 Get the intent and retrieve the exchange rate passed to it
        Intent intent = getIntent();
        exchangeRate = intent.getDoubleExtra(SubActivity.INTENT_EXCH_RATE, Double.valueOf(exch_text));

        //TODO 2.1 Use findViewById to get references to the widgets in the layout
        editTextValue = findViewById(R.id.editTextValue);
        editTextValue.setText(rate_text);
        buttonConvert = findViewById(R.id.buttonConvert);
        textViewExchangeRate = findViewById(R.id.textViewExchangeRate);
        textViewResult = findViewById(R.id.textViewResult);

        //TODO 2.2 Assign a default exchange rate of 2.95 to the textView
        //Here are two ways
//        textViewExchangeRate.setText(String.valueOf(ExchangeRate.calculateExchangeRate()));
//        textViewExchangeRate.setText(R.string.default_exchange_rate);

        textViewExchangeRate.setText(String.valueOf(exchangeRate));

        //TODO 2.3 Set up setOnClickListener for the Convert Button
        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editTextValue.getText().toString();
                Log.i(TAG, "user enter " + userInput);
                if (userInput.equals("")) {
                    Log.i(TAG, "user enter blank");
                    Toast.makeText(MainActivity.this,
                            R.string.warning_blank_edit_text,
                            Toast.LENGTH_LONG).show();
                }else {

                    double result = Double.valueOf(userInput) * exchangeRate;
                    textViewResult.setText(String.valueOf(result));
                }

            }
        });
        //TODO 2.4 Display a Toast & Logcat message if the editTextValue widget contains an empty string
        //TODO 2.5 If not, calculate the units of B with the exchange rate and display it


        //TODO 3.1 Modify the Android Manifest to specify that the parent of SubActivity is MainActivity
        //TODO 3.2 Get a reference to the Set Exchange Rate Button
        buttonSetExchangeRate = findViewById(R.id.buttonSetExchangeRate);
        //TODO 3.3 Set up setOnClickListener for this
        //TODO 3.4 Write an Explicit Intent to get to SubActivity
        buttonSetExchangeRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //TODO 4.1 Go to res/menu/menu_main.xml and add a menu item Set Exchange Rate
    //TODO 4.2 In onOptionsItemSelected, add a new if-statement and code accordingly

    //TODO 5.1 Go to res/menu/menu_main.xml and add a menu item Open Map App
    //TODO 5.2 In onOptionsItemSelected, add a new if-statement
    //TODO 5.3 code the Uri object and set up the intent

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

        if (id == R.id.menu_set_exchange_rate) {
            //TODO write your intent here
            Intent intent = new Intent(this, SubActivity.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.menu_open_map_app){
            String location = getString(R.string.default_location);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme("geo").opaquePart("0.0").appendQueryParameter("q", location);
            Uri geoLocation = builder.build();

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(geoLocation);

            if (intent.resolveActivity(getPackageManager()) != null){
                startActivity(intent);
            }
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //TODO 4.3 override the methods in the Android Activity Lifecycle here
    //TODO 4.4 for each of them, write a suitable string to display in the Logcat

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "OnStart() is executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "OnResume() is executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "OnPause() is executed");
        SharedPreferences.Editor preferenceEditor = mPreferences.edit();
        preferenceEditor.putString(RATE_KEY, editTextValue.getText().toString());
        preferenceEditor.putString(EXCH_KEY, textViewExchangeRate.getText().toString());
        preferenceEditor.apply();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "OnStop() is executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "OnDestroy() is executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "OnRestart() is executed");
    }

    //TODO 4.7 In onPause, get a reference to the SharedPreferences.Editor object
    //TODO 4.8 store the exchange rate using the putString method with a key

}
