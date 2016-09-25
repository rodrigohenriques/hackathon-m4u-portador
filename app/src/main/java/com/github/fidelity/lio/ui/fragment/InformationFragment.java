package com.github.fidelity.lio.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.Product;
import com.github.fidelity.lio.R;
import com.github.fidelity.lio.ui.adapter.NearBuyRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class InformationFragment extends Fragment {

    @BindView(R.id.nearBuyRecyclerView)
    RecyclerView nearBuyRecyclerView;


    public InformationFragment() {
    }

    public static InformationFragment newInstance() {
        return new InformationFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_information, container, false);
        ButterKnife.bind(this, view);

        NearBuyRecyclerViewAdapter nearBuyRecyclerViewAdapter = new NearBuyRecyclerViewAdapter(getProductList());
        nearBuyRecyclerView.setAdapter(nearBuyRecyclerViewAdapter);
        nearBuyRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        return view;
    }

    private List<Product> getProductList() {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product());
        productList.add(new Product());
        productList.add(new Product());
        productList.add(new Product());
        productList.add(new Product());

        return productList;

    }

}
