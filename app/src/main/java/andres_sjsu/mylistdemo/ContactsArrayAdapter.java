package andres_sjsu.mylistdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by andres on 9/14/15.
 */
public class ContactsArrayAdapter extends ArrayAdapter<Contact> {
        public ContactsArrayAdapter(Context context, ArrayList<Contact> users) {
           super(context, 0, users);
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                // Get the data item for this position
                Contact user = getItem(position);

                // Check if an existing view is being reused, otherwise inflate the view
                if (convertView == null) {
                    convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_contact, parent, false);
                }

                // Lookup view for data population
                TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
                TextView tvHome = (TextView) convertView.findViewById(R.id.tvHome);

                // Populate the data into the template view using the data object
                tvName.setText(user.name);
                tvHome.setText(user.number);

                // Return the completed view to render on screen
                return convertView;

            }

        }