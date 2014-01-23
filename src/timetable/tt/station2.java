package timetable.tt;

import java.util.Calendar;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

public class station2 extends ListActivity {
	
	Calendar cal = Calendar.getInstance();
    int hour = cal.get(Calendar.HOUR_OF_DAY);
    int min = cal.get(Calendar.MINUTE);
    
    String[] listItems = {"05.30","06.00","06.45","07.00","07.15","07.30","07.40",
            "08.00","08.15","08.30","08.45","09.00",
            "09.20","09.40","10.00","10.20","10.40","11.00","11.30",
            "12.00","12.30","13.00","13.30","14.00","14.30",
            "15.00","15.30","16.00" ,"16.30" ,"17.00" ,"17.20" ,"17.40" ,
            "18.00" ,"18.20","18.40" ,"19.00" ,"19.20 ","19.40",
            "20.00","20.20","20.40","21.10","21.40","22.10"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.station2);
        setListAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems));
        
        float k = new Float(min);
        float n = hour + (k/100);
        int v=0;
        int index =0;
        String g="05.30";
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