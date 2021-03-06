package com.zhy.handle_runtime_change;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zhy.R;

/**
 * Android 屏幕旋转 处理 AsyncTask 和 ProgressDialog 的最佳方案
 *
 * http://blog.csdn.net/lmj623565791/article/details/37936275
 *
 */
public class HandRuntimeChangeActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_handle_runtime_change);
	}

	public void openAsyncTaskAndSaveInstanceState(View view) {
		Intent intent = new Intent(this, SavedInstanceStateUsingActivity.class);
		startActivity(intent);
	}

	public void openFragmentRetainDataActivity(View view) {
		Intent intent = new Intent(this, FragmentRetainDataActivity.class);
		startActivity(intent);
	}

	public void openConfigChangesTestActivity(View view) {
		Intent intent = new Intent(this, ConfigChangesTestActivity.class);
		startActivity(intent);
	}

	public void openFixProblemsActivity(View view) {
		Intent intent = new Intent(this, FixProblemsActivity.class);
		startActivity(intent);
	}
}
