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

public class HotelFragment extends Fragment {
    public HotelFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.hotel_list, container, false);
        final ArrayList<Attraction> hotel = new ArrayList<Attraction>();
        hotel.add(new Attraction(
                getString(R.string.h1_name),
                getString(R.string.h1_desc),
                getString(R.string.h1_address),
                getString(R.string.h1_phonenumber),
                getString(R.string.h1_price),
                getString(R.string.h1_url),
                R.drawable.hotel_biesiada));
        hotel.add(new Attraction(
                getString(R.string.h2_name),
                getString(R.string.h2_desc),
                getString(R.string.h2_address),
                getString(R.string.h2_phonenumber),
                getString(R.string.h2_price),
                getString(R.string.h2_url),
                R.drawable.hotel_victoria));
        hotel.add(new Attraction(getString(R.string.h3_name),
                getString(R.string.f3_desc),
                getString(R.string.h3_address),
                getString(R.string.h3_phonenumber),
                getString(R.string.h3_price),
                getString(R.string.h3_url),
                R.drawable.pianohotel));
        hotel.add(new Attraction(
                getString(R.string.h4_name),
                getString(R.string.h4_desc),
                getString(R.string.h4_address),
                getString(R.string.h4_phonenumber),
                getString(R.string.h4_price),
                getString(R.string.h4_url),
                R.drawable.dom_na_podwalu));
        hotel.add(new Attraction(getString(R.string.h5_name),
                getString(R.string.h5_desc),
                getString(R.string.h5_address),
                getString(R.string.h5_phonenumber),
                getString(R.string.h5_price),
                getString(R.string.h5_url),
                R.drawable.hotel_europa));
        hotel.add(new Attraction(
                getString(R.string.h1_name),
                getString(R.string.h1_desc),
                getString(R.string.h1_address),
                getString(R.string.h1_phonenumber),
                getString(R.string.h1_price),
                getString(R.string.h1_url),
                R.drawable.hotel_biesiada));
        hotel.add(new Attraction(
                getString(R.string.h2_name),
                getString(R.string.h2_desc),
                getString(R.string.h2_address),
                getString(R.string.h2_phonenumber),
                getString(R.string.h2_price),
                getString(R.string.h2_url),
                R.drawable.hotel_victoria));
        hotel.add(new Attraction(getString(R.string.h3_name),
                getString(R.string.f3_desc),
                getString(R.string.h3_address),
                getString(R.string.h3_phonenumber),
                getString(R.string.h3_price),
                getString(R.string.h3_url),
                R.drawable.pianohotel));
        hotel.add(new Attraction(
                getString(R.string.h4_name),
                getString(R.string.h4_desc),
                getString(R.string.h4_address),
                getString(R.string.h4_phonenumber),
                getString(R.string.h4_price),
                getString(R.string.h4_url),
                R.drawable.dom_na_podwalu));
        hotel.add(new Attraction(getString(R.string.h5_name),
                getString(R.string.h5_desc),
                getString(R.string.h5_address),
                getString(R.string.h5_phonenumber),
                getString(R.string.h5_price),
                getString(R.string.h5_url),
                R.drawable.hotel_europa));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), hotel);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Attraction attraction = hotel.get(position);
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