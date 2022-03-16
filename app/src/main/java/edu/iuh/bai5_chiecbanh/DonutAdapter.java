package edu.iuh.bai5_chiecbanh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DonutAdapter extends BaseAdapter {
    private Context ctx;
    private int layout;
    private ArrayList<Donut> arrayList;

    public DonutAdapter(Context ctx, int layout, ArrayList<Donut> arrayList) {
        this.ctx = ctx;
        this.layout = layout;
        this.arrayList = arrayList;
    }

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

        ViewHolder viewHolder;
        if(view == null){
            view = LayoutInflater.from(ctx).inflate(layout, viewGroup, false);

            viewHolder = new ViewHolder();
            viewHolder.imageView = view.findViewById(R.id.imageView);
            viewHolder.tvName = view.findViewById(R.id.tvName);
            viewHolder.tvMoTa = view.findViewById(R.id.tvMoTa);
            viewHolder.tvPrice = view.findViewById(R.id.tvPrice);

            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }
            viewHolder.tvName.setText(arrayList.get(i).getName());
            viewHolder.tvMoTa.setText(arrayList.get(i).getNameMoTa());
            viewHolder.tvPrice.setText(String.valueOf(arrayList.get(i).getNewPrice()));
            viewHolder.imageView.setImageResource(arrayList.get(i).getImageThing());

        return view;
    }

    private class ViewHolder{
        ImageView imageView;
        TextView tvName;
        TextView tvMoTa;
        TextView tvPrice;
    }
}
