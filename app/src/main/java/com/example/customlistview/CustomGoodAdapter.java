package com.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGoodAdapter extends BaseAdapter {
    public CustomGoodAdapter(Context ctx, int layoutItem, ArrayList<Goods> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    Context ctx;
    int layoutItem;
    ArrayList<Goods> arrayList;


    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //Ánh xạ giao diện qua code
        view = LayoutInflater.from(ctx).inflate(layoutItem,viewGroup,false);
        TextView tvNameProduct = view.findViewById(R.id.tvNameProduct);
        TextView tvNameStore = view.findViewById(R.id.tvNameStore);
        ImageView imageGoods = view.findViewById(R.id.imageGoods);

        // Gán giá trị
        tvNameProduct.setText(arrayList.get(i).getNameProduct());
        tvNameStore.setText(arrayList.get(i).getNameStore());
        imageGoods.setImageResource(arrayList.get(i).getImageGoods());
        return view;
    }
}
