package com.example.livechat_poc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ChatRoomAdapter extends RecyclerView.Adapter<ChatRoomAdapter.ViewHolder> {


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_chat_room_adapter);
//
//    }
    private Context context;
    private List<Message> chatList;

    //class ChatRoomAdapter(val context : Context, val chatList : ArrayList<Message>) : RecyclerView.Adapter<ChatRoomAdapter.ViewHolder>(){
    public ChatRoomAdapter(Context context, List<Message> chatList){
        this.context = context;
        this.chatList = chatList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_chat, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.username.setText("Name");
        holder.message.setText("Message");
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

//        ImageView image;
        TextView username;
        TextView message;
//        TextView allergy;
//        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
//            image= itemView.findViewById(R.id.image);
            username = itemView.findViewById(R.id.username);
            message = itemView.findViewById(R.id.message);
//            allergy = itemView.findViewById(R.id.allergy);
//            parentLayout = itemView.findViewById(R.id.parent_layout);
//
//            //set onclick
//            parentLayout.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
//            Log.v(ViewHolder.class.getName(), "clicked on item");
//            int itemIndex = getAdapterPosition();
//            recipeOnClickHandler.onElementClick(view, itemIndex);
        }
    }


}
