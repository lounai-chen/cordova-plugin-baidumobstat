# 百度移动统计Cordova插件

## How to debug:
1. clone this project
2. remove the old plugin from the project
  ```
  cordova plugin remove cordova-plugin-baidumobstat
  ```

3. add the plugin

  	```
  	cordova plugin add cordova-plugin-baidumobstat
  	```

4. config
	
	参考cordova-sample部分

5. build and debug
	
	```
	cordova build
	cordova run android  (cordova run ios)
	```
6. MainActivity 初始化的时候,需要注意以下设置
```
StatService.setAuthorizedState(this.getApplicationContext(),false);// 建议有用户隐私策略弹窗的App，用户未同意前设置false,同意之后设置true
```

7. 修改platforms/android/AndroidManifest.xml和platforms/android/android.json和plugins/cordova-plugin-baidumobstat/plugin.xml中的BaiduMobAd_STAT_ID与BaiduMobAd_CHANNEL值. 
      
修改MainActivity.java,  加入百度统计代码. 
```
      import com.baidu.mobstat.StatService;
      ```
      ```
         @Override
    protected void onResume() {
        super.onResume();
        // 
        StatService.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        // 
        StatService.onPause(this);
    }
    ```
    

8. 手动引入 build.gradle
```
dependencies {
  compile 'com.baidu.mobstat:mtj-sdk:latest.integration'
}
```
