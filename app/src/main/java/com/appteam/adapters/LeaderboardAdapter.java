package com.appteam.adapters;


import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.appteam.hillfair2k19.R;
import com.appteam.model.Leaderboard;

import java.util.List;

/**
 * .
 */

public class LeaderboardAdapter extends RecyclerView.Adapter<LeaderboardAdapter.MyViewHolder> {
    List<Leaderboard> leaderboardList;
    Activity activity;

    public LeaderboardAdapter(List<Leaderboard> leaderboardList, Activity activity) {
        this.activity = activity;
        this.leaderboardList = leaderboardList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.adapter_leaderboard, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        final Leaderboard club = leaderboardList.get(position);
        holder.name.setText(club.getName());
        holder.candies.setText(String.valueOf(club.getCandies()));
        holder.gender.setText(club.getGender());
        holder.rank.setText(String.valueOf(position + 1));
    }

    @Override
    public int getItemCount() {
        return leaderboardList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView candies;
        TextView name;
        TextView gender;
        TextView rank;

        public MyViewHolder(View itemView) {
            super(itemView);
            candies = itemView.findViewById(R.id.candies);
            name = itemView.findViewById(R.id.name);
            gender = itemView.findViewById(R.id.gender);
            rank = itemView.findViewById(R.id.rank);
        }
    }
}
