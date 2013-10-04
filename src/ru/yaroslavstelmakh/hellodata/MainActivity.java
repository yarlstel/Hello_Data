package ru.yaroslavstelmakh.hellodata;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
	public TextView tvHello;
	Button butCrowsCounter, butGreen, butRed, butYellow;
	int count = 0, count_cats = 0;
	public RelativeLayout relativeLayout;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {    	
        super.onCreate(savedInstanceState);        
        setContentView(R.layout.activity_main); 
        butCrowsCounter = (Button)findViewById(R.id.butCrowsCounter);
        butGreen = (Button)findViewById(R.id.butGreen);
        butRed = (Button)findViewById(R.id.butRed);
        butYellow = (Button)findViewById(R.id.butYellow);
        tvHello = (TextView) findViewById(R.id.textView1);
        relativeLayout = (RelativeLayout)findViewById(R.id.relativelayout);        
        butCrowsCounter.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tvHello.setText("Я насчитал " + ++count + " ворон и " + count_cats + " котов.");
			}
		});
        butGreen.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				tvHello.setText(R.string.butGreen_string);
				relativeLayout.setBackgroundResource(R.color.background_green);
			}
		});
    }

   

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void onClick(View v) {
    	Intent intent;
    	switch (v.getId()) {
    	case R.id.butHello:
    		tvHello.setText("Hello Data");
    		break;
    	case R.id.butSecond:
    		intent = new Intent(MainActivity.this, SecondActivity.class);
    		startActivity(intent);
    		break;
    	case R.id.butDemo:
    		intent = new Intent(MainActivity.this, PassingDataDemoActivity.class);
    		startActivity(intent);
    		break;
    	}
	}
    
    public void butHello_Click(View v) {
    	tvHello.setText("Hello Data2");
    }
    
    public void butAbout_Click(View v)
    {
    	Intent intent = new Intent(MainActivity.this, AboutActivity.class);
    	startActivity(intent);
    }
    
    public void butCats_Click(View v) {
    	tvHello.setText("Я насчитал " + count + " ворон и " + ++count_cats + " котов.");
    }
    
    public void butColor_Click(View v) {
    	switch (v.getId()) {
    	case R.id.butRed:
        	tvHello.setText(R.string.butRed_string);
        	relativeLayout.setBackgroundResource(R.color.background_red);
        	break;
    	case R.id.butYellow:
        	tvHello.setText(R.string.butYellow_string);
        	relativeLayout.setBackgroundResource(R.color.background_yellow);
        	break;   		
    	}
    }

    
}
