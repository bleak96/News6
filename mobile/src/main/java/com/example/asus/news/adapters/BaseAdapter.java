package com.example.asus.news.adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

abstract class BaseAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    private Context context;
    private List<T> list;
    private LayoutInflater inflater;

    public abstract void onBindViewHolder(VH holder, int position, T item);

    BaseAdapter(Context context, @Nullable List<T> list) {
        this.context = context;
        if (null != list) {
            this.list = list;
        } else {
            this.list = new ArrayList<>();
        }
    }

    public void addAll(List<T> elements) {
        list.addAll(elements);
        notifyDataSetChanged();
    }

    @Override
    public final void onBindViewHolder(VH holder, int position) {
        onBindViewHolder(holder, position, getItem(position));
    }

    @Override
    public int getItemCount() {
        return null != list ? list.size() : 0;
    }

    @Nullable
    public T getItem(int position) {
        return null != list ? list.get(position) : null;
    }

    @Override
    public long getItemId(int position) {
        return list.get(position).hashCode();
    }

    protected View inflate(ViewGroup parent, int layoutId) {
        return getInflater(context).inflate(layoutId, parent, false);
    }

    protected LayoutInflater getInflater(Context context) {
        if (inflater == null) {
            inflater = LayoutInflater.from(context);
        }
        return inflater;
    }

}