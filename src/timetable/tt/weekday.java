package timetable.tt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class weekday extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weekday);
        
        Button c = (Button)findViewById(R.id.station1);
        c.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i= new Intent(weekday.this, station1.class);
				startActivity(i);
			}
		});
        Button d = (Button)findViewById(R.id.estate1);
        d.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent j= new Intent(weekday.this, estate1.class);
				startActivity(j);
			}
		});
    }
}