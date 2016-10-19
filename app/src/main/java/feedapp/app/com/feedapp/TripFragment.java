package feedapp.app.com.feedapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import feedapp.app.com.feedapp.adapter.TripAdapter;


public class TripFragment extends Fragment {

    /*ToDo: Variable Declaration */
   private RecyclerView mRecyclerView;


    public TripFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_trip, container, false);

        MainActivity.mImageView.setVisibility(View.GONE);

        Bundle mBundle=getArguments();

        //TODO recycler view here
        mRecyclerView= (RecyclerView) view.findViewById(R.id.mRecyclerView_tripid);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(new TripAdapter(getActivity(),mBundle));

        return view;
    }

}
