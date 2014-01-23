package timetable.tt;

import java.util.Calendar;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

public class estate2 extends ListActivity {
	
	Calendar cal = Calendar.getInstance();
    int hour = cal.get(Calendar.HOUR_OF_DAY);
    int min = cal.get(Calendar.MINUTE);
    
    String[] listItems = {"05.50","06.20","07.05","07.20","07.35",
            "07.50","08.00","08.20","08.35","08.50",
            "09.05","09.20","09.40","10.00","10.20","10.40","11.00","11.20",
            "11.50","12.20","12.50","13.20","13.50","14.20","14.50",
            "15.20","15.50","16.20","16.50" ,"17.20" ,"17.40",
            "18.00" ,"18.20" ,"18.40" ,"19.00" ,"19.20 ","19.40",
            "20.00","20.20","20.40","21.00","21.30","22.00","22.30"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estate2);
        setListAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems));
        
        float k = new Float(min);
        float n = hour + (k/100);
        int v=0;
        String g="05.50";
        int l = listItems.length;
        int index =0;
        for(int j=0;v!=1 && j<l;j++)
        {
            if(n<=Float.parseFloat(listItems[j]))
            {
                g=listItems[j];
                v=1;
                index =j;
            }
        }
        getListView().setSelection(index);    
        Toast.makeText(getBaseContext(), "The next bus is at "+g, Toast.LENGTH_LONG).show();
        
    }
}