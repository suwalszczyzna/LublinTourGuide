package pl.com.suwala.lublintourguide;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MuseumAdapter extends ArrayAdapter<Museum> {
    public MuseumAdapter(Context context, ArrayList<Museum> museum) {
        super(context, 0, museum);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.card_list_item, parent, false);
        }
        Museum currentAttraction = getItem(position);
        TextView museumTitle = listItemView.findViewById(R.id.s_title);
        museumTitle.setText(currentAttraction.getMuseumName());

        TextView musemAddress = listItemView.findViewById(R.id.s_address);
        musemAddress.setText(currentAttraction.getMuseumAddress());

        TextView museumHours = listItemView.findViewById(R.id.s_hours);
        museumHours.setText(currentAttraction.getMuseumHours());

        TextView museumPhone = listItemView.findViewById(R.id.s_phone);
        museumPhone.setText(currentAttraction.getMuseumPhone());

        ImageView imageView = listItemView.findViewById(R.id.s_pic);
        imageView.setImageResource(currentAttraction.getMuseumPicture());

        return listItemView;
    }
}
