package timetable.tt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sunday extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sunday);
        
        Button e = (Button)findViewById(R.id.station3);
        e.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i= new Intent(sunday.this, station3.class);
				startActivity(i);
			}
		});
        Button f = (Button)findViewById(R.id.estate3);
        f.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent j= new Intent(sunday.this, estate3.class);
				startActivity(j);
			}
		});
    }
}