package com.asmld.dairy;

import android.app.ListFragment;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 * Created by xyj on 13-12-16.
 */
public class listFragment extends ListFragment {
    ArrayAdapter<String> dataList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dataList = new ArrayAdapter<String>(getActivity(), R.layout.fragment_list_item, Data_Cheeses.CHEESES);
        setListAdapter(dataList);
    }
}