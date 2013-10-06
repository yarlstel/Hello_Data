package ru.yaroslavstelmakh.hellodata;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class PrivetActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_privet);
		
		TextView txtInfo = (TextView)findViewById(R.id.textView1);
		
		String user = "ЖЫвотное";
		String gift = "дырку от бублика", who;
		
		user = getIntent().getExtras().getString("username");
		gift = getIntent().getExtras().getString("gift");
		who = getIntent().getStringExtra("who");
		
		txtInfo.setText(user + ", вам передали " + gift + " от " + who);
	}
}
