package com.bustrack.bustrack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.bustrack.bustrack.adapters.StopListAdapter;
import com.bustrack.bustrack.database.DatabaseQuery;
import com.bustrack.bustrack.entity.DatabaseStopObject;
import com.bustrack.bustrack.entity.StopObject;
import com.bustrack.bustrack.helpers.Helper;

import java.util.List;

/**
 * Created by Administrator on 2017/04/09 0009.
 */

public class StopListActivity  extends AppCompatActivity{
    private static final String TAG=StopListActivity.class.getSimpleName();

    private DatabaseQuery query;

    private List<DatabaseStopObject> allStops;

    private StopObject stopObject;

    private RequestQueue queue;

    private List<StopObject> allData;

    private StopListAdapter stopListAdapter;

    private RecyclerView stopRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_stop);

        setTitle(Helper.STOP_LIST);

        queue = Volley.newRequestQueue(StopListActivity.this);
        allData = query.getStoredDataStop();

        if(null != allStops){
            int size = allStops.size();
            for(int i =0; i < size; i++)
            {
                System.out.printIn("Response printing" + all);
            }
        }
    }
}
