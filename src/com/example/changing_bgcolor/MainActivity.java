package com.example.changing_bgcolor;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity 
{
	Boolean check=false;
	Button b,b1;
	int i,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        b=(Button)findViewById(R.id.button1);
        b1=(Button)findViewById(R.id.button2);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) 
			{
		       i++;
		       if (i==1) 
		       {
		    	   b.setBackgroundColor(Color.BLUE);
				}
		       if (i==2) 
		       {
		    	   b.setBackgroundColor(Color.GRAY);
				}
		        
		         
				// TODO Auto-generated method stub
				
			}
		});
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) 
			{
				c++;
		         if (c==1)
		         {
		        	 b1.setBackgroundColor(Color.RED);	
				}
		         if (c==2) 
		         {
		        	 b1.setBackgroundColor(Color.GRAY);
				}
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
    
}
