package af.drawerbtmnav.app;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import af.drawerbtmnav.app.Adapter.fragmenttabsAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class SMS_Bundles extends Fragment {

    View myFragment;
    ViewPager viewPager;
    TabLayout tabLayout;


    public SMS_Bundles() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     myFragment = inflater.inflate(R.layout.fragment_sms__bundles, container, false);

     viewPager= myFragment.findViewById(R.id.viewPager);
     tabLayout = myFragment.findViewById(R.id.tabLayout);




     return myFragment;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setUpViewPager(ViewPager viewPager) {

        fragmenttabsAdapter adapter = new fragmenttabsAdapter(getChildFragmentManager());

        adapter.addFragment(new SmsdailyFragment(), "Daily");
        adapter.addFragment(new SmsweeklyFragment()," Weekly");
        adapter.addFragment(new SmsmonthlyFragment(), "Monthly");

        viewPager.setAdapter(adapter);



    }
}
