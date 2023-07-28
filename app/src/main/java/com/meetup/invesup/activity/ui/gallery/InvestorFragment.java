package com.meetup.invesup.activity.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.meetup.invesup.MainActivity;
import com.meetup.invesup.adapter.InvestorListAdapter;
import com.meetup.invesup.databinding.FragmentInvestorBinding;
import com.meetup.invesup.model.InvestorModel;

import java.util.ArrayList;
import java.util.List;


public class InvestorFragment extends Fragment {

    private FragmentInvestorBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        InvestorViewModel galleryViewModel =
                new ViewModelProvider(this).get(InvestorViewModel.class);

        binding = FragmentInvestorBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //final TextView textView = binding.textGallery;
        //galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        List<InvestorModel> image_details = getListData();
        final ListView listView = binding.listView;

        listView.setAdapter(new InvestorListAdapter(getActivity(), image_details));

        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                InvestorModel investorModel = (InvestorModel) o;
                Toast.makeText(getActivity(), "Selected :" + " " + investorModel.getBussinessName(), Toast.LENGTH_LONG).show();
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private  List<InvestorModel> getListData() {
        List<InvestorModel> list = new ArrayList<InvestorModel>();
        InvestorModel vietnam = new InvestorModel("Vietnam", "vn");
        InvestorModel usa = new InvestorModel("United States", "us");
        InvestorModel russia = new InvestorModel("Russia", "ru");


        list.add(vietnam);
        list.add(usa);
        list.add(russia);

        return list;
    }
}