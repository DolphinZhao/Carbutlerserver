package com.freelxl.carbutler.server.carbutlerserver.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.ListView;

/**
 * Created by zzh on 2015/4/8.
 */
public abstract class AbsListAdapter<T> extends BaseAdapter {

    protected Context mContext;
    protected ListView mListView;
    protected List<T> mDataList;

    public AbsListAdapter() {

    }

    public void addDataList(List<T> list) {
        if (this.mDataList != null) {
            this.mDataList.clear();
        } else {
            mDataList = new ArrayList<T>();
        }
        this.mDataList.addAll(list);
    }

    public void addDataListBefore(List<T> list) {
        if (this.mDataList != null) {
            this.mDataList.addAll(0, list);
        } else {
            this.mDataList = new ArrayList<T>();
            this.mDataList.addAll(list);
        }
    }

    public void addMoreDataList(List<T> list) {
        if (this.mDataList == null) {
            this.mDataList = new ArrayList<T>();
        }
        this.mDataList.addAll(list);
    }

    public void clearAdapterListData() {
        if (mDataList != null) {
            mDataList.clear();
            mDataList = null;
        }
    }

    public List<T> getDataList() {
        if (mDataList != null) {
            return mDataList;
        }
        return null;
    }

    public T getObjectItem(int position) {
        if (mDataList != null && position < mDataList.size()) {
            return mDataList.get(position);
        }
        return null;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        if (mDataList != null) {
            return mDataList.size();
        } else {
            return 0;
        }
    }

    @Override
    public Object getItem(int position) {
        if (null != mDataList && position < mDataList.size() && position > -1) {
            return mDataList.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

}
