package com.zhy;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.zhy.view.CircleMenuLayout;
import com.zhy.view.CircleMenuLayout.OnMenuItemClickListener;

public class CircleMenuActivity extends Activity {

	private CircleMenuLayout mCircleMenuLayout;

	private String[] mItemTexts = new String[] { "安全中心 ", "特色服务", "投资理财",
			"转账汇款", "我的账户", "信用卡" };
	private int[] mItemImgs = new int[] { R.drawable.home_mbank_1_normal,
			R.drawable.home_mbank_2_normal, R.drawable.home_mbank_3_normal,
			R.drawable.home_mbank_4_normal, R.drawable.home_mbank_5_normal,
			R.drawable.home_mbank_6_normal };
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cicrle_menu);
		mCircleMenuLayout = (CircleMenuLayout) findViewById(R.id.id_menulayout);
		mCircleMenuLayout.setMenuItemIconsAndTexts(mItemImgs, mItemTexts);

		mCircleMenuLayout
				.setOnMenuItemClickListener(new OnMenuItemClickListener() {

					@Override
					public void itemClick(View view, int pos) {
						Toast.makeText(CircleMenuActivity.this, mItemTexts[pos],
								Toast.LENGTH_SHORT).show();

					}

					@Override
					public void itemCenterClick(View view) {
						Toast.makeText(CircleMenuActivity.this,
								"you can do something just like ccb  ",
								Toast.LENGTH_SHORT).show();

					}
				});
	}

}
