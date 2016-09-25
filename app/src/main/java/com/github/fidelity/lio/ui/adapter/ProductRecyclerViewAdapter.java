package com.github.fidelity.lio.ui.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.Product;
import com.github.fidelity.lio.R;
import com.github.fidelity.lio.ui.activity.ProductDetaliedActivity;

import java.util.List;

public class ProductRecyclerViewAdapter extends RecyclerView.Adapter<ProductRecyclerViewAdapter.ProductsViewHolder> {

    private List<Product> productList;

    public ProductRecyclerViewAdapter(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public ProductsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_recycler_view_product_search, parent, false);
        return new ProductsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductsViewHolder holder, int position) {
        holder.buildItem(productList.get(position));
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    private View productContainer;

    public class ProductsViewHolder extends RecyclerView.ViewHolder {

        public ProductsViewHolder(View itemView) {
            super(itemView);
            productContainer = itemView;
        }

        public void buildItem(Product product) {
            productContainer.setOnClickListener(view -> {
                Intent intent = new Intent(productContainer.getContext(), ProductDetaliedActivity.class);
                productContainer.getContext().startActivity(intent);
            });
        }
    }

}
