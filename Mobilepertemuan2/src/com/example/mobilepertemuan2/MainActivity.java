package com.example.mobilepertemuan2;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final EditText inputNpm = (EditText) findViewById(R.id.inputNpm);
        final EditText inputNama = (EditText) findViewById(R.id.inputNama);
        final Button btnSubmit = (Button) findViewById(R.id.btnok);
        final TextView txtTampil = (TextView) findViewById(R.id.txthasil);
        final EditText inputNilai = (EditText) findViewById(R.id.inputNilai);
        
        btnSubmit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int iNilai = Integer.parseInt(inputNilai.getText().toString());
				// TODO Auto-generated method stub
				if(iNilai>60){
					txtTampil.setText(inputNpm.getText().toString()+"\n"+inputNama.getText().toString()+" LULUS");
				}else {
					txtTampil.setText(inputNpm.getText().toString()+"\n"+inputNama.getText().toString()+" Tidak LULUS");
				}
				
				
			}
		});
        
        
        
    }

    
}
