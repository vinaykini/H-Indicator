package timetable.tt;

import java.util.Calendar;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class estate3 extends ListActivity {
	
	Calendar cal = Calendar.getInstance();
    int hour = cal.get(Calendar.HOUR_OF_DAY);
    int min = cal.get(Calendar.MINUTE);
    
    String[] listItems = {"07.20","08.20","08.50","09.20","09.50","10.20","10.50","11.20",
            "12.20","13.20","14.20","15.20","16.20" ,"16.50" ,"17.20" ,"17.50" ,
            "18.20" ,"18.50" ,"19.20" ,"19.50","20.20","20.50","21.20","21.50"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estate3);
        setListAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems));
        int index=0;
        float k = new Float(min);
        float n = hour + (k/100);
        int v=0;
        String g="07.20";
        int l = listItems.length;
        for(int j=0;v!=1 && j<l;j++)
        {
            if(n<=Float.parseFloat(listItems[j]))
            {
            	index = j;
                g=listItems[j];
                v=1;
            }
        }
       
        getListView().setSelection(index);
        Toast.makeText(getBaseContext(), "the next bus is at "+g, Toast.LENGTH_LONG).show();
    }
}