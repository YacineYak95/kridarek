package com.example.kidarek;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HorizontalListViewFragment extends Fragment {



    ArrayList<Post> listitems = new ArrayList<Post>();




    public HorizontalListViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.parent_recycler_view, container, false);

         RecyclerView MyRecyclerView = (RecyclerView) view.findViewById(R.id.horizontal_list);
        MyRecyclerView.setHasFixedSize(true);
        LinearLayoutManager MyLayoutManager = new LinearLayoutManager(getActivity());
        MyLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);







        Logement loge1 = new Logement();
        loge1.setTitle("AKHAK");
        Logement loge2 = new Logement();
        loge1.setTitle("AKHAK1");
        Logement loge3 = new Logement();
        loge1.setTitle("AKHAK2");
        Logement loge4 = new Logement();
        loge1.setTitle("AKHAK3");
        Logement loge5 = new Logement();
        loge1.setTitle("AKHAK4");
        Logement loge6 = new Logement();
        loge1.setTitle("AKHA5");
        Logement loge7 = new Logement();
        loge1.setTitle("AKHA6");

        Logement loge23 = new Logement();
            loge1.setTitle("AKHAM");

        Post p1 = new Post("Cate1");


        Post p2 = new Post("Cate2");

        p1.getListLogement().add(loge1);
        p1.getListLogement().add(loge2);
        p1.getListLogement().add(loge3);
        p1.getListLogement().add(loge4);
        p1.getListLogement().add(loge5);
        p1.getListLogement().add(loge6);


        p1.getListLogement().add(loge2);




        listitems.add(p1);

        listitems.add(p2);

        VerticalAdapter adapter = new VerticalAdapter(getActivity(), listitems);




        if (listitems.size() > 0 & MyRecyclerView != null) {
            MyRecyclerView.setAdapter(adapter);
        }
        MyRecyclerView.setLayoutManager(MyLayoutManager);

        return view;
    }

}
