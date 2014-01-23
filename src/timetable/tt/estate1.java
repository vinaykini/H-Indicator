package timetable.tt;

import java.util.Calendar;

import android.app.Activity;
import android.app.LauncherActivity.ListItem;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

public class estate1 extends ListActivity {
	
	Calendar cal = Calendar.getInstance();
    int hour = cal.get(Calendar.HOUR_OF_DAY);
    int min = cal.get(Calendar.MINUTE);
    
    String[] listItems = {"05.50","06.10","06.35","07.00","07.10","07.30",
            "07.45","07.55","08.05","08.20","08.30","08.40","08.55",
            "09.05","09.20","09.40","09.55","10.10","10.25","10.45","11.05","11.25",
            "11.55","12.25","12.55","13.25","13.45","14.05","14.30",
            "15.00","15.30","16.00" ,"16.20" ,"16.50" ,"17.25" ,"17.45" ,
            "18.05" ,"18.20" ,"18.35" ,"18.55" ,"19.05" ,"19.20 ","19.35",
            "19.50","20.05","20.20","20.35","20.50","21.05","21.15",
            "21.30","22.00","22.30","23.05"};
    int index =0;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estate1);
        setListAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems));
        
        float k = new Float(min);
        float n = hour + (k/100);
        int v=0;
        String g="05.50";
        int l = listItems.length;
        
        for(int j=0;v!=1 && j<l;j++)
        {
            if(n<=Float.parseFloat(listItems[j]))
            {
                g=listItems[j];
                v=1;
                index = j;
            }
        }
        
        getListView().post(new Runnable() {
            @Override
            public void run() {
                getListView().smoothScrollToPosition(index);
            }
        });     
        getListView().setSelection(index);
        getListView().setItemChecked(index, true);
        Toast.makeText(getBaseContext(), "the next bus is at "+g, Toast.LENGTH_LONG).show();
       
    }
}