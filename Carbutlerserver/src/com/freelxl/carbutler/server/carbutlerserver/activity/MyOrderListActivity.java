package com.freelxl.carbutler.server.carbutlerserver.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.freelxl.carbutler.server.carbutlerserver.R;
import com.lidroid.xutils.view.annotation.ViewInject;

public class MyOrderListActivity extends Activity {
	
	@ViewInject(R.id.myorderlist_lv)
	private ListView myorderlist_lv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_order_list);

	}

}
