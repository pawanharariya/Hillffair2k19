package com.appteam.adapters;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.appteam.hillfair2k19.R;
import com.appteam.model.Schedule;

import java.util.List;

/**
 * Coded by ThisIsNSH on 9/20/2018.
 */

public class ScheduleAdapter extends RecyclerView.Adapter<ScheduleAdapter.MyViewHolder> {

    List<Schedule> scheduleList;
    Activity activity;
    int likes;
    private boolean check = true;

    public ScheduleAdapter(List<Schedule> scheduleList, Activity activity) {
        this.activity = activity;
        this.scheduleList = scheduleList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.adapter_schedule, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        Schedule schedule = scheduleList.get(position);
        holder.clubName.setText(schedule.getClubName());
        holder.eventName.setText(schedule.getEventName());
        holder.date.setText(schedule.getDate());
        holder.time.setText(schedule.getTime());
    }

    @Override
    public int getItemCount() {
        return scheduleList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView clubName, eventName, date, time;


        public MyViewHolder(View itemView) {
            super(itemView);
            clubName = itemView.findViewById(R.id.clubName);
            eventName = itemView.findViewById(R.id.EventName);
            date = itemView.findViewById(R.id.date);
            time = itemView.findViewById(R.id.time);
        }
    }
}
