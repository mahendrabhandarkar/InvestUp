package com.meetup.invesup.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.meetup.invesup.R;
import com.meetup.invesup.model.InvestorModel;

import java.util.List;


public class InvestorListAdapter extends BaseAdapter {

    private List<InvestorModel> investorModelList;
    private LayoutInflater layoutInflater;
    private Context context;

    public InvestorListAdapter(Context context,List<InvestorModel> investorModelList)
    {
        this.context=context;
        this.investorModelList=investorModelList;
        layoutInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount()
    {
       return investorModelList.size();
    }

    @Override
    public Object getItem(int position)
    {
        return investorModelList.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item_layout, null);
            holder = new ViewHolder();
            holder.imageView = (ImageView) convertView.findViewById(R.id.idImageView);
            holder.bussinessNameText = (TextView) convertView.findViewById(R.id.idTextBussinessName);
            holder.emailIDText = (TextView) convertView.findViewById(R.id.idTextBussinessEmailID);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        InvestorModel investorModel = this.investorModelList.get(position);
        holder.bussinessNameText.setText(investorModel.getBussinessName());
        holder.emailIDText.setText(investorModel.getEmailID());

       // int imageId = this.getMipmapResIdByName(country.getFlagName());

        //holder.imageView.setImageResource(imageId);

        return convertView;
    }

    static class ViewHolder {
        ImageView imageView;
        TextView bussinessNameText;
        TextView emailIDText;
    }

}
