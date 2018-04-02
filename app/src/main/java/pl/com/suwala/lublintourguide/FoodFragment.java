package pl.com.suwala.lublintourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class FoodFragment extends Fragment {
    public FoodFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.hotel_list, container, false);
        final ArrayList<Attraction> food = new ArrayList<Attraction>();
        food.add(new Attraction(
                getString(pl.com.suwala.lublintourguide.R.string.r1_name),
                getString(R.string.r1_desc),
                getString(R.string.r1_address),
                getString(R.string.r1_phonenumber),
                getString(R.string.r1_price),
                getString(R.string.r1_url),
                R.drawable.kardamon));
        food.add(new Attraction(
                getString(R.string.r2_name),
                getString(R.string.r2_desc),
                getString(R.string.r2_address),
                getString(R.string.r2_phonenumber),
                getString(R.string.r2_price),
                getString(R.string.r2_url),
                R.drawable.mandragora));
        food.add(new Attraction(
                getString(R.string.r3_name),
                getString(R.string.r3_desc),
                getString(R.string.r3_address),
                getString(R.string.r3_number),
                getString(R.string.r3_price),
                getString(R.string.r3_url),
                R.drawable.czarcia1));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), food);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Attraction attraction = food.get(position);
                Intent i = new Intent(getContext(), ScrollingActivity.class);
                i.putExtra("attractionName", attraction.getName());
                i.putExtra("attractionAddress", attraction.getAdress());
                i.putExtra("attractionPhone", attraction.getPhoneNumber());
                i.putExtra("attractionDescr", attraction.getDescription());
                i.putExtra("attractionPic", attraction.getPicture());
                i.putExtra("attractionUrl", attraction.getUrl());
                startActivity(i);
            }
        });
        return rootView;
    }
}