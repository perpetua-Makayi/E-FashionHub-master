package com.makeuponfleek.e_fashionhub;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by nigel on 6/1/2017.
 */
public class CustomAdapter extends ArrayAdapter<String> {
    private final String[] product;
    private final Context context;
    private Integer[] imageId;

    public CustomAdapter(Context context, String[] products,Integer[] imageId) {
        super(context, R.layout.custom_row, products);
        this.context = context;
        this.product = products;
        this.imageId=imageId;
    }


    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.custom_row, parent, false);

        String productItems = getItem(position);
        TextView productDetail = (TextView) customView.findViewById(R.id.productDetail);
        ImageView productImage = (ImageView) customView.findViewById(R.id.productImageView);




        productDetail.setText(productItems);
        productImage.setImageResource(imageId[position]);
        return customView;
    }

}