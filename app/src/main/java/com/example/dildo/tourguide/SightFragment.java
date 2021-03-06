package com.example.dildo.tourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SightFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.string.acropolis, R.string.acropolis_desc, 20, 30948, R.drawable.acropolis));
        places.add(new Place(R.string.acropolis_museum, R.string.acro_museum_desc, 5, 170984, R.drawable.acrop_museum));
        places.add(new Place(R.string.archaeological_museum, R.string.arch_museum_desc, 10, 21433, R.drawable.arch_museum));
        places.add(new Place(R.string.temple_of_zeus, R.string.temple_zeus_desc, 2, 84732, R.drawable.zeus_temple));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), places);

        final ListView listView = (ListView) rootView.findViewById(R.id.places_list);

        listView.setAdapter(itemsAdapter);


        return rootView;
    }
}
