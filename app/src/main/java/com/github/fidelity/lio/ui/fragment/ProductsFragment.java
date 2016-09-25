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
import com.github.fidelity.lio.ui.adapter.ProductRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ProductsFragment extends Fragment {

    @BindView(R.id.productListRecyclerView)
    RecyclerView productListRecyclerView;

    public ProductsFragment() {
    }

    public static ProductsFragment newInstance() {
        return new ProductsFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_products, container, false);
        ButterKnife.bind(this, view);

        ProductRecyclerViewAdapter productRecyclerViewAdapter = new ProductRecyclerViewAdapter(getProductList());
        productListRecyclerView.setAdapter(productRecyclerViewAdapter);
        productListRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));


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
