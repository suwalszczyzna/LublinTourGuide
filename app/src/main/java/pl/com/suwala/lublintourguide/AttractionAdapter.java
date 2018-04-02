package pl.com.suwala.lublintourguide;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    public AttractionAdapter(Context context, ArrayList<Attraction> attractions) {
        super(context, 0, attractions);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Attraction currentAttraction = getItem(position);
        TextView titleTextView = listItemView.findViewById(R.id.title);
        titleTextView.setText(currentAttraction.getName());
        TextView addressTextView = listItemView.findViewById(R.id.address);
        addressTextView.setText(currentAttraction.getAdress());
        TextView pricelevel = listItemView.findViewById(R.id.priceLevelName);
        pricelevel.setText(R.string.price_level);
        TextView priceLevelTextView = listItemView.findViewById(R.id.priceLevel);
        priceLevelTextView.setText(currentAttraction.getPriceLevel());
        ImageView imageView = listItemView.findViewById(R.id.picture);
        imageView.setImageResource(currentAttraction.getPicture());
        return listItemView;
    }
}