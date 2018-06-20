package com.example.eduardgomez.learnandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ExampleAdapter mExampleAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mExampleAdapter = new ExampleAdapter(loadData());
        mRecyclerView.setAdapter(mExampleAdapter);
    }

    public List<User> loadData() {
        List<User> ListUser = new ArrayList();
        ListUser.add(new User("Eduard", "Gomez"));
        ListUser.add(new User("Sebastian", "Arango"));
        ListUser.add(new User("Sergio", "Velez"));
        ListUser.add(new User("Jose", "Angulo"));
        ListUser.add(new User("Camilo", "Henao"));
        ListUser.add(new User("Edison", "Mejia"));
        ListUser.add(new User("Sebastian", "Florez"));
        ListUser.add(new User("Santiago", "Lopez"));
        ListUser.add(new User("Juan", "Lopez"));
        ListUser.add(new User("Eimer", "Castro"));
        ListUser.add(new User("Sandro", "Londoño"));
        ListUser.add(new User("Carlos", "Alberto"));
        return ListUser;
    }

}
