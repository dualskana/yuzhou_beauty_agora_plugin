#### version: v1.0.0

#### Prepare
1. unzip Frameworks.zip to ios/ 
2. example/lib/main.dart 修改license

#### 开启美颜:

功能：开启美颜

```dart
var handle = await engine.getNativeHandle();
await YuzhouBeautyAgoraPlugin.turnOnBeauty(handle);
```

#### 关闭美颜:

功能：关闭美颜

```dart
var handle = await engine.getNativeHandle();
await YuzhouBeautyAgoraPlugin.turnOffBeauty(handle);
```

#### 设置美颜参数

```dart
enum SimpleBeautyType {
  CHEEKBONE_WIDTH,      // 颧骨
  THIN_FACE,            // 瘦脸
  EYE_HEIGHT,           // 眼高
  SKIN_SMOOTH,          // 磨皮
  SKIN_WHITENING,       // 美白
  RUDDY,                // 红润
  SHARPEN,              // 锐化
  FACE_WIDTH,           // 脸宽
  JAW_SHAPE,            // 削脸
  SHORTEN_FACE,         // 短脸
  CHIN_LENGTH,          // 下巴
  FOREHEAD,             // 额头
  JAW_WIDTH,            // 下颌骨
  BIG_EYE,              // 大眼
  EYE_BRIGHT,           // 亮眼
  SKIN_SMOOTHING_EYES,  // 祛眼袋
  EYE_DISTANCE,         // 眼距
  EYE_TILT,             // 眼睛角度
  NOSE_WIDTH,           // 鼻子宽度
  NOSE_LIFT,            // 鼻高
  NOSE_SIZE,            // 鼻子大小
  NOSE_RIDGE_WIDTH,     // 鼻梁
  NOSE_TIP_SIZE,        // 鼻尖
  MOUTH_SIZE,           // 嘴唇大小
  LIP_THICKNESS,        // 嘴唇厚度
  TEETH_WHITE,          // 白牙
  NASOLABIAL_FOLDS      // 祛法令纹
}

YuzhouBeautyAgoraPlugin.setSimpleBeautyValue(SimpleBeautyType.BIG_EYE, 1.0);
```

#### 设置美妆|风格妆

```dart
YuzhouBeautyAgoraPlugin.setMakeup(
                          "data/user/0/com.sc.jojo/files/cosmos/makeup_style/heitonghua",
                          0.9,
                          0.4
                      );
```

#### 设置贴纸

```dart
YuzhouBeautyAgoraPlugin.setSticker(
                          "/data/user/0/com.sc.jojo/files/cosmos/sticker/xiha"
                      );
```