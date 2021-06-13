package com.example.payoneerpaymentapitask.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.payoneerpaymentapitask.R;
import com.example.payoneerpaymentapitask.models.Applicable;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ListResultRecyclerViewAdapter extends RecyclerView.Adapter<ListResultRecyclerViewAdapter.ListResultViewHolder> {

    private List<Applicable> mApplicableList = new ArrayList<>();
    private int mCheckedPosition = -1;

    @NonNull
    @Override
    public ListResultRecyclerViewAdapter.ListResultViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.base_list_item, parent, false);
        return new ListResultViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListResultRecyclerViewAdapter.ListResultViewHolder holder, int position) {
        Applicable applicableData = mApplicableList.get(position);
        holder.mItemName.setText(applicableData.getLabel());
        String logoUrl = applicableData.getLinks().getLogo();
        Picasso.get().load(logoUrl).placeholder(R.drawable.circular_progress_animation).into(holder.mItemLogo);

        holder.mCheckBox.setChecked(position == mCheckedPosition);
        applicableData.setSelected(position == mCheckedPosition);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == mCheckedPosition) {
                    holder.mCheckBox.setChecked(false);
                    mCheckedPosition = -1;
                } else {
                    mCheckedPosition = position;
                    notifyDataSetChanged();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mApplicableList.size();
    }

    public void setValues(List<Applicable> applicableList) {
        this.mApplicableList = applicableList;
        notifyDataSetChanged();
    }

    static class ListResultViewHolder extends RecyclerView.ViewHolder {
        private TextView mItemName;
        private ImageView mItemLogo;
        private CheckBox mCheckBox;
        private View mView;

        public ListResultViewHolder(@NonNull View itemView) {
            super(itemView);

            mView = itemView.findViewById(R.id.id_containerLayout_1);
            mItemName = itemView.findViewById(R.id.id_item_name);
            mItemLogo = itemView.findViewById(R.id.id_item_logo);
            mCheckBox = itemView.findViewById(R.id.id_checkbox);
        }
    }
}
