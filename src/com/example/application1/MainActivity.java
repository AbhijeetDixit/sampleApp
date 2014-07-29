package com.example.application1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{

	EditText number;
	TextView result;
	Button button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getItems();
		button.setOnClickListener(this);
	}
	
	private void getItems(){
		number=(EditText)findViewById(R.id.number);
		result=(TextView)findViewById(R.id.numeric);
		button=(Button)findViewById(R.id.submitbutton);
	}

	@Override
	public void onClick(View v){
		result.setText(number.getText().toString());
	}

}
