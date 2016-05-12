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
public class DocumentaryFragment extends Fragment {

    String[] docs={"Death of The sun","Through the Warmhole","How to make a Jet Engine","Are we Real?"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.documentary_fragment,container,false);

        ListView lv= (ListView) rootView.findViewById(R.id.docsListView);
        ArrayAdapter adapter=new ArrayAdapter(this.getActivity(),android.R.layout.simple_list_item_1,docs);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), docs[position], Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}
