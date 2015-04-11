package com.freelxl.carbutler.server.carbutlerserver.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.freelxl.carbutler.server.carbutlerserver.R;

/**
 * Created by zzh on 2015/4/8.
 */
public class MyOrderListAdapter extends AbsListAdapter {
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder = null;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = LayoutInflater.from(mContext).inflate(
					R.layout.item_myorderlist, null);
			holder.order_content_tv = (TextView) convertView
					.findViewById(R.id.order_content_tv);
			holder.price_tv = (TextView) convertView
					.findViewById(R.id.price_tv);
			holder.order_time_tv = (TextView) convertView
					.findViewById(R.id.order_time_tv);
			holder.my_order_State_tv = (TextView) convertView
					.findViewById(R.id.my_order_State_tv);
			holder.arrow_right_btn = (ImageView) convertView
					.findViewById(R.id.arrow_right_btn);
			holder.item_myorderlist_rl = (RelativeLayout) convertView
					.findViewById(R.id.item_myorderlist_rl);
			holder.item_order_detail_ll = (LinearLayout) convertView
					.findViewById(R.id.item_order_detail_ll);
			holder.order_detail_and_price_ll = (LinearLayout) convertView
					.findViewById(R.id.order_detail_and_price_ll);
			holder.order_time_and_state_ll = (LinearLayout) convertView
					.findViewById(R.id.order_time_and_state_ll);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		mDataList.get(position);
		// holder.order_content_tv.setText();

		return convertView;
	}

	class ViewHolder {
		TextView order_content_tv;
		TextView price_tv;
		TextView order_time_tv;
		TextView my_order_State_tv;
		ImageView arrow_right_btn;
		RelativeLayout item_myorderlist_rl;
		LinearLayout item_order_detail_ll;
		LinearLayout order_detail_and_price_ll;
		LinearLayout order_time_and_state_ll;
	}
}
