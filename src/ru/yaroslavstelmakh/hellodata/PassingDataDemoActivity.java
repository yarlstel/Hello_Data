package ru.yaroslavstelmakh.hellodata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PassingDataDemoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_passingdatademo);
	}
	
	
	public void onClick(View v)
	{
		EditText edUserName = (EditText)findViewById(R.id.editText_toWhom);
		EditText edDescription = (EditText)findViewById(R.id.editText_description);
		EditText edWho = (EditText)findViewById(R.id.editText_who);
		
		Intent intent = new Intent(PassingDataDemoActivity.this, PrivetActivity.class);
		
		intent.putExtra("username", edUserName.getText().toString());
		intent.putExtra("gift", edDescription.getText().toString());
		intent.putExtra("who", edWho.getText().toString());
		startActivity(intent);
	}
}
