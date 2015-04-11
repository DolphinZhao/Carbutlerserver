package com.freelxl.carbutler.server.carbutlerserver.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.freelxl.baselibrary.bean.BaseJson;
import com.freelxl.baselibrary.utils.HttpRequest;
import com.freelxl.carbutler.server.carbutlerserver.R;
import com.freelxl.carbutler.server.carbutlerserver.config.ConstantValue;
import com.freelxl.carbutler.server.carbutlerserver.view.CommonTitle;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

import java.util.HashMap;

public class MyIncomeActivity extends Activity {

	@ViewInject(R.id.title)
	CommonTitle title;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_income);
		ViewUtils.inject(this);
		title.setMiddleText("收入");
		title.setRightText("提现");
		title.setOnRightTextClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent = new Intent(MyIncomeActivity.this,
						WithdrawActivity.class);
				startActivity(intent);
			}
		});

		fillData();
	}

	private void fillData() {
		HashMap<String, String> paramMap = new HashMap<String, String>();
		new HttpRequest<BaseJson>(MyIncomeActivity.this,
				ConstantValue.findMyIncome, paramMap, BaseJson.class) {

			@Override
			public void onSuccess(BaseJson fromJson) {

			}
		}.request();
	}

}
