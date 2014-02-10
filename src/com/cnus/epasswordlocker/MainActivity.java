package com.cnus.epasswordlocker;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_layout);
        
//        ImageView img = (ImageView) findViewById(R.id.action_row1);
//        img.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				
//				//Starting a new Intent
//                Intent nextScreen = new Intent(getApplicationContext(), CategoryActivity.class);
// 
//                //Sending data to another Activity
//                //nextScreen.putExtra("category", R.string.row1col1);
//                 
//                //Log.e("n", inputName.getText()+"."+ inputEmail.getText());
// 
//                startActivity(nextScreen);
//			}
//		});
       
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.epl_main_actions, menu);
 
        return super.onCreateOptionsMenu(menu);
    }
    
    public void onRow1Clicked(View view){
    	ImageView img = (ImageView)findViewById(R.id.action_row1);
    	
    	Intent categoryActivity = new Intent(getApplicationContext(), CategoryActivity.class);
    	startActivity(categoryActivity);
    }

    public void onToggleClicked(View view) {
        // Is the toggle on?
        boolean on = ((ToggleButton) view).isChecked();
        
        if (on) {
            // Enable lock
        	Toast.makeText(getApplicationContext(), "The switch is ON",
        			Toast.LENGTH_SHORT).show();
        } else {
            // Disable lock
        	Toast.makeText(getApplicationContext(), "The switch is OFF",
        			Toast.LENGTH_SHORT).show();
        }
    }

    
}
