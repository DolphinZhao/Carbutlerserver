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
import com.lidroid.xutils.view.annotation.event.OnClick;

import java.util.HashMap;

public class SettingActivity extends Activity {

	@ViewInject(R.id.title)
	CommonTitle title;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setting);
		ViewUtils.inject(this);
		title.setMiddleText("设置");
	}

	@OnClick(R.id.feedback)
	public void feedback(View view) {
		Intent intent = new Intent(this, FeedbackActivity.class);
		startActivity(intent);
	}

	@OnClick(R.id.update)
	public void update(View view) {

		HashMap<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("versionsType", "安卓");

		new HttpRequest<BaseJson>(SettingActivity.this,
				ConstantValue.findSersions, paramMap, BaseJson.class) {

			@Override
			public void onSuccess(BaseJson fromJson) {

			}

		}.request();
	}

	@OnClick(R.id.about)
	public void about(View view) {
		Intent intent = new Intent(this, AboutActivity.class);
		startActivity(intent);
	}

	@OnClick(R.id.exit)
	public void exit(View view) {

	}

}
