package com.example.eduardgomez.learnandroid;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ViewHolder> {

    private List<User> users;

    public ExampleAdapter(List<User> users) {
        this.users = users;
    }

    @Override
    public ExampleAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        User user = users.get(i);
        viewHolder.name.setText(user.getName());
        viewHolder.lastname.setText(user.getLastname());
    }

    @Override
    public int getItemCount() {
        return this.users.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView lastname;
        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.text_name);
            lastname = itemView.findViewById(R.id.text_lastname);
        }
    }

}
