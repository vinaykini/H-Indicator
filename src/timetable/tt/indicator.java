package timetable.tt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class indicator extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button a = (Button)findViewById(R.id.button1);
        a.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i= new Intent(indicator.this, weekday.class);
				startActivity(i);
			}
		});
        Button b = (Button)findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent j= new Intent(indicator.this, saturday.class);
				startActivity(j);
			}
		});
        Button c = (Button)findViewById(R.id.button3);
        c.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent k= new Intent(indicator.this, sunday.class);
				startActivity(k);
			}
		});
        
        Button d = (Button)findViewById(R.id.button4);
        d.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent k= new Intent(indicator.this, contactus.class);
				startActivity(k);
			}
		});
        
        Button e = (Button)findViewById(R.id.button5);
        e.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent k= new Intent(indicator.this, information.class);
				startActivity(k);
			}
		});
        
    }
}