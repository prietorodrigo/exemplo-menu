package com.example.aplicacaomenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.action_search) {
            Toast.makeText(getApplicationContext(),"Botao Search", Toast.LENGTH_LONG).show();
            return true;
        }
        else if (item.getItemId()==R.id.action_refresh) {
            Toast.makeText(getApplicationContext(),"Botao Refresh", Toast.LENGTH_LONG).show();
            return true;
        }
        else if (item.getItemId()==R.id.action_settings) {
            Toast.makeText(getApplicationContext(),"Botao Settings", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}