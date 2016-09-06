package com.example.verticalprogressbar;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class MainActivity extends ActionBarActivity {

	private VerticalProgressBar vpProgressBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}

	/**初始化控件 */
	private void initView() {
		vpProgressBar = (VerticalProgressBar) findViewById(R.id.vp_progress);
		run();
	}

	/**测试progressbar*/
	private void run() {
		new Thread(){
			public void run() {
				try {
					for (int i= 0;i<=100;i++) {
						Thread.sleep(50);//休息50毫秒
						vpProgressBar.setProgress(i);//更新进度条进度
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			};
		}.start();
	}


}
