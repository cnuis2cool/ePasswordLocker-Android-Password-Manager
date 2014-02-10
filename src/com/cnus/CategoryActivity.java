package com.cnus.epasswordlocker;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;


public class CategoryActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_layout);
        
        Intent i = getIntent();
        // Receiving the Data
        String name = i.getStringExtra("category");
        
        Toast.makeText(getApplicationContext(), name,
    			Toast.LENGTH_SHORT).show();
       
    }
}
