package pl.com.suwala.lublintourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ScrollingActivity extends AppCompatActivity {
    CollapsingToolbarLayout collapsingToolbarLayout;
    int image;
    String name;
    String address;
    String phone;
    String description;
    String urlAdress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        toolbar.setNavigationIcon(android.support.v7.appcompat.R.drawable.abc_ic_ab_back_material);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();
            }
        });

        TextView tv_phone = findViewById(R.id.src_phone);
        TextView tv_adress = findViewById(R.id.src_address);
        TextView tv_descr = findViewById(R.id.src_descr);
        collapsingToolbarLayout = findViewById(R.id.toolbar_layout);

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                name = "Attraction";
                address = "ul. Street 1, Lublin";
                phone = "000 000 000";
                description = "...";
                urlAdress = "http://google.com/";
                image = R.drawable.hotel_default;
            } else {
                name = extras.getString("attractionName");
                address = extras.getString("attractionAddress");
                phone = extras.getString("attractionPhone");
                description = extras.getString("attractionDescr");
                urlAdress = extras.getString("attractionUrl");
                image = extras.getInt("attractionPic");
            }
        } else {
            name = (String) savedInstanceState.getSerializable("attractionName");
            address = (String) savedInstanceState.getSerializable("attractionAddress");
            phone = (String) savedInstanceState.getSerializable("attractionPhone");
            description = (String) savedInstanceState.getSerializable("attractionDescr");
            urlAdress = (String) savedInstanceState.getSerializable("attractionUrl");
            image = (int) savedInstanceState.getSerializable("attractionPic");
        }

        tv_adress.setText(address);
        tv_descr.setText(description);
        tv_phone.setText(phone);
        collapsingToolbarLayout.setBackgroundResource(image);
        collapsingToolbarLayout.setTitle(name);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openUrl = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAdress));
                startActivity(openUrl);
            }
        });

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
        outState.putSerializable("attractionPic",image);
        outState.putSerializable("attractionName", name);
        outState.putSerializable("attractionAddress",address);
        outState.putSerializable("attractionDescr",description);
        outState.putSerializable("attractionUrl",urlAdress);
        outState.putSerializable("attractionPhone",phone);
    }
}
