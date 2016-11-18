package at.fh.swengb.userlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import at.fh.swengb.userlist.model.User;

/**
 * Created by hribernn15 on 18.11.2016.
 */

public class CustomAdapter extends android.widget.BaseAdapter {

    List<User> listUsers;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<User> listUsers) {
        this.context = applicationContext;
        this.listUsers= listUsers;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listUsers.size();
    }

    @Override
    public Object getItem(int i) {
        return listUsers.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }

        TextView viewName=(TextView)view.findViewById(R.id.textViewListName);
        TextView viewAddress=(TextView)view.findViewById(R.id.textViewListAddress);
        TextView viewPhone=(TextView)view.findViewById(R.id.textViewListPhone);

        User user = listUsers.get(i);
        viewName.setText(user.getFirstName()+" "+user.getLastName());
        viewAddress.setText(user.getAddress());
        viewPhone.setText(user.getPhoneNumber());

        return view;
    }
}
