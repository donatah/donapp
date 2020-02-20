package com.example.donapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menu, menu);

        return true;

    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_cook) {
            Intent myintent = new Intent(this, cook.class);
            this.startActivity(myintent);
            return true;
        }

        if (id == R.id.menu_drink) {
            Intent myintent = new Intent(this, drink.class);
            this.startActivity(myintent);
            return true;

        }
        return super.onOptionsItemSelected(item);
    }

    public void sendMessage(View view){
        EditText message=(EditText)findViewById(R.id.message);
        Toast.makeText(this,"send message"+message.getText().toString(),
                Toast.LENGTH_SHORT).show();
Intent intent=new Intent(this,DisplayMessageActivity.class);
startActivity(intent);
message.setText("");

}

}
