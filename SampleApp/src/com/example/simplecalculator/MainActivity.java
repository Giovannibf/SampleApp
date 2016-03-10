package com.example.simplecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		Button calc = (Button)findViewById(R.id.btnCalculate);
		
		calc.setOnClickListener(new View.OnClickListener()
				{
					public void onCLick(View v)
					{
						EditText number = (EditText)findViewById(R.id.num);
						TextView display = (TextView)findViewById(R.id.display);
						
						double num  = Double.parseDouble(number.getText().toString());
						num = num * 5;
						display.setText(num + "");
					}

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						
					}
				});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
