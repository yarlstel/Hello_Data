package ru.yaroslavstelmakh.hellodata;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView tvHello;
	Button butCrowsCounter;
	int count = 0;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {    	
        super.onCreate(savedInstanceState);        
        setContentView(R.layout.activity_main); 
        butCrowsCounter = (Button)findViewById(R.id.ButCrowsCounter);
        tvHello = (TextView) findViewById(R.id.textView1);
        butCrowsCounter.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tvHello.setText("� �������� " + ++count + "�����");
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
		tvHello.setText("Hello Data");
	}
    
    public void butHello_Click(View v) {
    	tvHello.setText("Hello Data2");
    }
    
}
