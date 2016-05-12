package com.tutorials.hp.bottomnavlistview.mFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.tutorials.hp.bottomnavlistview.R;

/**
 * Created by Oclemmy on 5/10/2016 for ProgrammingWizards Channel and http://www.Camposha.com.
 */
public class CrimeFragment extends Fragment {

    String[] crime={"Blacklist","Crisis","Gotham","Banshee","Breaking Bad"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.crime_fragment,container,false);

        ListView lv= (ListView) rootView.findViewById(R.id.crimeListView);
        ArrayAdapter adapter=new ArrayAdapter(this.getActivity(),android.R.layout.simple_list_item_1,crime);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(),crime[position],Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}
