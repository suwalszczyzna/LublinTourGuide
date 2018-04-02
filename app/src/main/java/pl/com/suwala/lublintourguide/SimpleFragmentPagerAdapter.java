package pl.com.suwala.lublintourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new HotelFragment();
            case 1:
                return new FoodFragment();
            case 2:
                return new MuseumFragment();
            case 3:
                return new PhoneFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }


    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return context.getString(R.string.hotel);
            case 1:
                return context.getString(R.string.food);
            case 2:
                return context.getString(R.string.museums);
            case 3:
                return context.getString(R.string.phones);
            default:
                return null;
        }

    }
}