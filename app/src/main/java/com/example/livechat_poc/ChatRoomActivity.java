package com.example.livechat_poc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class ChatRoomActivity extends AppCompatActivity {

    private static String TAG = ChatRoomActivity.class.getName();

    private ChatRoomAdapter adapter;
    private List<Message> chatList = new ArrayList<>();
    private EditText editText;
    private ImageView send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_room);
        initRecyclerView();

        editText =findViewById(R.id.editText);
        send = findViewById(R.id.send);

        Message m1 = new Message("Username1", "Hello");
        Message m2 = new Message("User2", "Bye");

        chatList.add(m1);
        chatList.add(m2);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Message m = new Message("username", editText.getText().toString());
                addItemToRecyclerView(m);
            }
        });
    }

    private void initRecyclerView() {
        Log.i(TAG, "initRecyclerView called");
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        adapter = new ChatRoomAdapter(ChatRoomActivity.this, chatList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(ChatRoomActivity.this));
    }

    private void addItemToRecyclerView(Message message){
        Log.i(TAG, "addItemToRecyclerView called");
        chatList.add(message);
//        adapter.notifyItemInserted(chatList.size());
        adapter.notifyDataSetChanged();
        editText.setText("");
    }
}
