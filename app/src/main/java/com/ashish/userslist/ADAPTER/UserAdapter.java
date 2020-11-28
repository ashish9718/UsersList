package com.ashish.userslist.ADAPTER;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ashish.userslist.MODEL.User;
import com.ashish.userslist.R;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private Context context;
    private ArrayList<User> userArrayList;

    public UserAdapter(Context context, ArrayList<User> userArrayList) {
        this.context = context;
        this.userArrayList = userArrayList;
    }


    @NonNull
    @Override
    public UserAdapter.UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.user, parent, false);
        return new UserAdapter.UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.UserViewHolder holder, int position) {

        String name = userArrayList.get(position).getName();
        String email = userArrayList.get(position).getEmail();
        String gender = userArrayList.get(position).getGender();
        String status = userArrayList.get(position).getStatus();

        holder.mname.setText("Name : "+name);
        holder.memail.setText("Email : "+email);
        holder.mgender.setText("Gender : "+gender);
        holder.mstatus.setText("Status : "+status);
    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        public TextView mname,memail,mgender,mstatus;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            mname=itemView.findViewById(R.id.name);
            memail=itemView.findViewById(R.id.email);
            mgender=itemView.findViewById(R.id.gender);
            mstatus=itemView.findViewById(R.id.status);
        }
    }
}
