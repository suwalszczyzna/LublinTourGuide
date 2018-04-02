package pl.com.suwala.lublintourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PhoneAdapter extends ArrayAdapter<Phone> {
    public PhoneAdapter(Context context, ArrayList<Phone> phone) {
        super(context, 0, phone);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.simple_list_item, parent, false);
        }

        Phone currentPhone = getItem(position);
        TextView museumTitle = listItemView.findViewById(R.id.phoneName);
        museumTitle.setText(currentPhone.getPhoneName());

        TextView musemAddress = listItemView.findViewById(R.id.phoneHolder);
        musemAddress.setText(currentPhone.getPhoneNumber());

        return listItemView;
    }
}
