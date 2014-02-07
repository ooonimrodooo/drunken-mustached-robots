package com.dupre.simplecalculator;

import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
	
	
	Button btnAdd;
	Button btnSub;
	Button btnMult;
	Button btnDiv;
	Button btnOne;
	Button btnTwo;
	Button btnThree;
	Button btnFour;
	Button btnFive;
	Button btnSix;
	Button btnSeven;
	Button btnEight;
	Button btnNine;
	Button btnZero;
	Button btnNeg;
	Button btnEquals;
	Button btnDot;
	
	TextView tvResult;
	
	
		
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnOne = (Button) findViewById(R.id.btnOne);
        tvResult = (TextView) findViewById(R.id.tvResult);
        
        btnAdd.setOnClickListener((OnClickListener) this);
        btnSub.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
    }

        public void onClick (View v){
        	
        	
        	
        
        switch (v.getId()){
        case R.id.btnAdd:        	
        	
        case R.id.btnSub:
        	
        case R.id.btnMult:
        	
        case R.id.btnDiv:
        	
        case R.id.btnOne:
        
        case R.id.btnTwo:
        
        case R.id.btnThree:
        
        case R.id.btnFour:
        
        case R.id.btnFive:
        
        case R.id.btnSix:
        
        case R.id.btnSeven:
        
        case R.id.btnEight:
        
        case R.id.btnNine:
        	
        case R.id.btnZero:
        
        case R.id.btnNeg:
        
        case R.id.btnEquals:
        
        case R.id.btnDot:
        
        default:
        		break;
        }
        
      
        
        	
        }
} 
