package timetable.tt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class saturday extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saturday);
        
        Button e = (Button)findViewById(R.id.station2);
        e.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i= new Intent(saturday.this, station2.class);
				startActivity(i);
			}
		});
        Button f = (Button)findViewById(R.id.estate2);
        f.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent j= new Intent(saturday.this, estate2.class);
				startActivity(j);
			}
		});
    }
}