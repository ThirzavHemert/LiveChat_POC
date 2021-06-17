package com.example.livechat_poc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class ChatRoomActivity extends AppCompatActivity {

    private ChatRoomAdapter adapter;
    private List<Message> chatList = new ArrayList<>();
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_room);
        initRecyclerView();

        editText =findViewById(R.id.editText);
    }

    private void initRecyclerView() {
//        Log.i(TAG, "initRecyclerView called");
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        adapter = new ChatRoomAdapter(ChatRoomActivity.this, chatList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(ChatRoomActivity.this));
    }

    private void addItemToRecyclerView(Message message){
        chatList.add(message);
        adapter.notifyItemInserted(chatList.size());
        editText.setText("");
    }
}
