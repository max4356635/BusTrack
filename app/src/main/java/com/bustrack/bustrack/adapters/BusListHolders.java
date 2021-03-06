package com.bustrack.bustrack.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.bustrack.bustrack.R;
import com.bustrack.bustrack.entity.BusObject;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Administrator on 2017/04/09 0009.
 */

public class BusListHolders extends RecyclerView.ViewHolder{
    private static final String TAG = StopListHolders.class.getSimpleName();

    public TextView busShortName;

    public TextView departureStop;

    public TextView arriveTime;

    public Button trackButton;

    public BusListHolders(final View itemView, final List<BusObject> busObjects){
        super(itemView);
        busShortName = (TextView)itemView.findViewById(R.id.bus_short_name);
        departureStop = (TextView)itemView.findViewById(R.id.departure_stop);
        arriveTime = (TextView)itemView.findViewById(R.id.arrive_time);
        trackButton = (Button)itemView.findViewById(R.id.track_bus_button);
    }
}
