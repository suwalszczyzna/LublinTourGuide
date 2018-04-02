package pl.com.suwala.lublintourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class MuseumFragment extends Fragment {
    public MuseumFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.hotel_list, container, false);
        final ArrayList<Museum> museums = new ArrayList<Museum>();
        museums.add(new Museum(
                getString(R.string.m1_name),
                getString(R.string.m1_hours),
                getString(R.string.m1_address),
                getString(R.string.m1_phonenumber),
                R.drawable.majdanek
        ));
        museums.add(new Museum(
                getString(R.string.m2_name),
                getString(R.string.m2_hours),
                getString(R.string.m2_address),
                getString(R.string.m2_phonenumber),
                R.drawable.skansen
        ));
        museums.add(new Museum(
                getString(R.string.m3_name),
                getString(R.string.m3_hours),
                getString(R.string.m3_address),
                getString(R.string.m3_phonenumber),
                R.drawable.zamek_lubelski
        ));
        MuseumAdapter adapter = new MuseumAdapter(getActivity(), museums);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
