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
public class InternetbundleFragment extends Fragment {

    View myFragment;
    ViewPager viewPager;
    TabLayout tabLayout;


    public InternetbundleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myFragment =inflater.inflate(R.layout.fragment_internetbundle, container, false);

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

        adapter.addFragment(new InternetdailyFragment(), "Daily");
        adapter.addFragment(new InternetweeklyFragment(),"Weekly");
        adapter.addFragment(new InternetmonthlyFragment(), "Monthly");
        adapter.addFragment(new InternetnightFragment(), "Night");

        viewPager.setAdapter(adapter);



    }






}
