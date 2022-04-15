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
