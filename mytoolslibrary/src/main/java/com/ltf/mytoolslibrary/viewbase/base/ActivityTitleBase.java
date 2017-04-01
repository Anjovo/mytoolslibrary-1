package com.ltf.mytoolslibrary.viewbase.base;

i PermissionListener 对象。
		 */
		AndPermission.onRequestPermissionsResult(requestCode, permissions, grantResults, new PermissionListener() {
			@Override
			public void onSucceed(int requestCode, List<String> grantPermissions) {
				// 有权限，直接do anything.
				CheckPermissionUtils.getSelectPicUpdateUtils().onBackPermissionResult();
			}

			@Override
			public void onFailed(int requestCode, List<String> deniedPermissions) {
				CheckPermissionUtils.getSelectPicUpdateUtils().onRequestPermissionsResultOnFailed(ActivityTitleBase.this,deniedPermissions);
			}
		});
	}

	public String PACKAGE = "package:";
	// 启动应用的设置
	public void startAppSettings(Activity cx) {
		Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
		intent.setData(Uri.parse( PACKAGE + cx.getPackageName()));
		cx.startActivity(intent);
	}

}
