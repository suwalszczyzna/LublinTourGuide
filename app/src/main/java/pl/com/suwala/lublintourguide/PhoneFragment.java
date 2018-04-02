package pl.com.suwala.lublintourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhoneFragment extends Fragment {

    public PhoneFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.hotel_list, container, false);
        final ArrayList<Phone> phones = new ArrayList<Phone>();
        phones.add(new Phone(
                getString(R.string.p1_name),
                getString(R.string.p1_phonenumber)
        ));
        phones.add(new Phone(
                getString(R.string.p2_name),
                getString(R.string.p2_phonenumber)
        ));
        phones.add(new Phone(
                getString(R.string.p3_name),
                getString(R.string.p3_phonenumber)
        ));
        phones.add(new Phone(
                getString(R.string.p4_name),
                getString(R.string.p4_phonenumber)
        ));

        PhoneAdapter adapter = new PhoneAdapter(getActivity(), phones);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Phone phone = phones.get(position);
                String phoneNumber = getString(R.string.phone_1)+phone.getPhoneNumber();
                Intent i=new Intent(Intent.ACTION_DIAL, Uri.parse(phoneNumber));
                startActivity(i);
            }
        });
        return rootView;
    }
}
