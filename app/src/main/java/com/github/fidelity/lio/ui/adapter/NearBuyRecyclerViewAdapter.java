package com.github.fidelity.lio.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.Product;
import com.github.fidelity.lio.R;

import java.util.List;

public class NearBuyRecyclerViewAdapter extends RecyclerView.Adapter<NearBuyRecyclerViewAdapter.NearBuyViewHolder> {

    private List<Product> productList;

    public NearBuyRecyclerViewAdapter(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public NearBuyRecyclerViewAdapter.NearBuyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_recycler_view_product, parent, false);
        return new NearBuyRecyclerViewAdapter.NearBuyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NearBuyRecyclerViewAdapter.NearBuyViewHolder holder, int position) {
        holder.buildItem(productList.get(position));
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class NearBuyViewHolder extends RecyclerView.ViewHolder {

        public NearBuyViewHolder(View itemView) {
            super(itemView);
        }

        public void buildItem(Product product) {

        }
    }

}
