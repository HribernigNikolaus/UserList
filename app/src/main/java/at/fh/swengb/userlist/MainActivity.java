package at.fh.swengb.userlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import at.fh.swengb.userlist.model.ShowUserActivity;
import at.fh.swengb.userlist.model.User;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    private List<User> listUsers;

    private ListView myListView;

    private CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = (ListView) findViewById(R.id.myUserList);

        listUsers = new ArrayList<>();
        listUsers.add(new User("Johann","Blauensteiner","Alte Poststraße 147, 8020 Graz","01 020304050"));
        listUsers.add(new User("Peter","Salhofer","Alte Poststraße 149, 8020 Graz","01 123456"));
        listUsers.add(new User("Max","Mustermann","Alte Poststraße 1, 8020 Graz","01 021221250"));
        listUsers.add(new User("Maria","Musterfrau","Eggenberger Allee 5, 8020 Graz","01 02024050"));
        listUsers.add(new User("John","Doe","Herrengasse 10, 8010 Graz","0316 011150"));
        listUsers.add(new User("Jane","Doe","Neue Poststraße 147, 8020 Graz","01 020304050"));

        myAdapter = new CustomAdapter(this,listUsers);

        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        User selectedUser = listUsers.get(i);
        Intent intent = new Intent(view.getContext(),ShowUserActivity.class);
        intent.putExtra("user",selectedUser);
        startActivity(intent);

    }
}
