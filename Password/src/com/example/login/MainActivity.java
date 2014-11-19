package com.example.login;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	EditText txtNombre;
	EditText txtContrasenia;
	TextView txtError;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btnEnviar = (Button)findViewById(R.id.button1);
		txtNombre = (EditText) findViewById(R.id.txtName);
		txtContrasenia = (EditText) findViewById(R.id.txtPassword);
		txtError = (TextView) findViewById(R.id.txtError);
		
		btnEnviar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				entrarEmail();
			}
		});
	}
	
	private void entrarEmail()
	{
		String nombre = "root", contrasenia="moviles";
		String getName = txtNombre.getText().toString();
		String getPassword = txtContrasenia.getText().toString();
		
		if(nombre.equals(getName) && contrasenia.equals(getPassword))
		{
			Intent intencionCorreo = new Intent(this, Email.class);
			startActivity(intencionCorreo);
		}else{
			txtError.setText("Falló al entrar");
		}
		
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