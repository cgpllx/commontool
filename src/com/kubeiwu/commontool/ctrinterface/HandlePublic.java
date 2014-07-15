package com.kubeiwu.commontool.ctrinterface;

import android.view.View;
import android.widget.TabWidget;

public interface HandlePublic {
	/**
	 * 设置Widget背景
	 * @param widgetview
	 */
	void setTabWidgetBackground(TabWidget widgetview);

	/**
	 * 设置Widget item的背景
	 * @param widgetview
	 */
	void setTabWidgetChildViewBackground(View widgetchildview);
}
