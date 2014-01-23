package timetable.tt;

import java.util.Calendar;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

public class station3 extends ListActivity {
	
	Calendar cal = Calendar.getInstance();
    int hour = cal.get(Calendar.HOUR_OF_DAY);
    int min = cal.get(Calendar.MINUTE);
    
    String[] listItems = {"07.00","08.00","08.30","09.00",
            "09.30","10.00","10.30","11.00","12.00","13.00","14.00",
            "15.00","16.00" ,"16.30" ,"17.00" ,"17.30" ,
            "18.00" ,"18.30","19.00" ,"19.30 ","20.00","20.30","21.00","21.30"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.station3);
        setListAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems));
        int index = 0;
        float k = new Float(min);
        float n = hour + (k/100);
        int v=0;
        String g="07.00";
        int l = listItems.length;
        for(int j=0;v!=1 && j<l;j++)
        {
            if(n<=Float.parseFloat(listItems[j]))
            {
            	index =j;
                g=listItems[j];
                v=1;
            }
        }
        getListView().setSelection(index);
        Toast.makeText(getBaseContext(), "the next bus is at "+g, Toast.LENGTH_LONG).show();
    }
}