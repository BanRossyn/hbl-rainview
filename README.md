<p align="center">
  <h1 align="center">RainView Android Library</h1>
</p>

      
 [![](https://jitpack.io/v/banrossyn/hbl-rainview.svg)](https://jitpack.io/#banrossyn/hbl-rainview)
![GitHub all releases](https://img.shields.io/github/downloads/banrossyn/hbl-rainview/total?label=Downlaods)
![GitHub](https://img.shields.io/github/license/banrossyn/hbl-rainview)




This is a really simple animation for Android. You could find similar animations when sending "Happy birthday" or something else special in WeChat app.

Now you are able to add this funny thing to your own app as well. Give a surprise to your users on Christmas Day by dropping emojis!


<p align="center">
    <a >
    
![](https://github.com/BanRossyn/hbl-rainview/blob/main/RainView.gif)
    </a>
  </p>



## Dependency

Add this in your root `settings.gradle` file (**not** your module `build.gradle` file):

```gradle

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
    ....
        maven { url "https://jitpack.io" }
        ...
    }
}
```

Then, add the library to your module `build.gradle`

```gradle
dependencies {
    implementation 'com.github.banrossyn:hbl-rainview:{latest_version}'
    //You must use percentlayout Dependency
    implementation 'androidx.percentlayout:percentlayout:1.0.0'
}
```

#### Config

- per
    - How many emojis will dropping in each flow, default 6
- duration
    - The total duration of the animation, default 8000ms
- dropDuration
    - The average dropping duration for a specific emoji, default 2400ms
- dropFrequency
    - The interval between two flows, default 500ms

Config in layout. `EmojiRainLayout` inherits from `FrameLayout`. You can just use it as a native `FrameLayout` view.

```xml
<com.banrossyn.hbl.RainView.EmojiRainLayout
        android:id="@+id/emojilayout"
        android:layout_width="match_parent"
        android:layout_height="match_parent">


    </com.banrossyn.hbl.RainView.EmojiRainLayout>
```

Config in java code.
```java
public class MainActivity extends AppCompatActivity {

    private EmojiRainLayout mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // bind view
        mContainer = findViewById(R.id.emojilayout);

        // add emoji sources
        mContainer.addEmoji(R.drawable.e_eye_love);
        mContainer.addEmoji(R.drawable.e_eye_love);
        mContainer.addEmoji(R.drawable.e_eye_love);
        mContainer.addEmoji(R.drawable.e_eye_love);
        mContainer.addEmoji(R.drawable.e_eye_love);
     

        // set emojis per flow, default 6
        mContainer.setPer(8);

        // set total duration in milliseconds, default 8000
        mContainer.setDuration(7500);

        // set average drop duration in milliseconds, default 2400
        mContainer.setDropDuration(2400);

        // set drop frequency in milliseconds, default 500
        mContainer.setDropFrequency(500);
    }
}
```
Start animation.
```java
mContainer.startDropping();
```

Stop animation.
```java
mContainer.stopDropping();
```


## License

```
Copyright 2020 Rossyn

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements. See the NOTICE file distributed with this work for
additional information regarding copyright ownership. The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License. You may obtain a copy of
the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
License for the specific language governing permissions and limitations under
the License.
```
