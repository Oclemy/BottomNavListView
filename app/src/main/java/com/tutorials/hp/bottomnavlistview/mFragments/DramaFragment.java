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
public class DramaFragment extends Fragment {

    String[] drama={"Blindspot","The Player","Silicon Valley","Hannibal","XIII"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.drama_frgament,container,false);

        ListView lv= (ListView) rootView.findViewById(R.id.dramaListView);
        ArrayAdapter adapter=new ArrayAdapter(this.getActivity(),android.R.layout.simple_list_item_1,drama);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), drama[position], Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}
