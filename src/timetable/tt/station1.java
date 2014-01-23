package timetable.tt;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;
import android.content.*;
import java.util.*;

public class station1 extends ListActivity {
	
	Calendar cal = Calendar.getInstance();
    int hour = cal.get(Calendar.HOUR_OF_DAY);
    int min = cal.get(Calendar.MINUTE);
    

    
    
    String[] listItems = {"05.30","05.50","06.15","06.40","06.50","07.10","07.25","07.35",
            "07.45","07.55","08.05","08.15","08.30","08.40","08.55",
            "09.15","09.30","09.45","10.00","10.20","10.40","11.00","11.30",
            "12.00","12.30","13.00","13.20","13.45","14.10","14.40",
            "15.10","15.40","16.00" ,"16.30" ,"17.00" ,"17.20" ,"17.40" ,
            "17.55" ,"18.10" ,"18.30" ,"18.40" ,"18.55" ,"19.10 ","19.25",
            "19.40","19.55","20.10","20.25","20.40","20.55","21.10",
            "21.40","22.10","22.45"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.station1);
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