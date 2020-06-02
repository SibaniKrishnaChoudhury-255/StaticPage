# StaticPage

[![platform](https://img.shields.io/badge/platform-android-green)](https://www.android.com)
[![API](https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=19)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![](https://jitpack.io/v/SibaniKrishnaChoudhury-255/StaticPage.svg)](https://jitpack.io/#SibaniKrishnaChoudhury-255/StaticPage)


## Screenshots

*Please click the image below to enlarge.*


<a href="https://user-images.githubusercontent.com/66129155/83515268-b4c3e780-a4f2-11ea-9729-f9d507820473.jpg">
<img src="https://user-images.githubusercontent.com/66129155/83515268-b4c3e780-a4f2-11ea-9729-f9d507820473.jpg" title="StaticPage" height=500/></a>



## Prerequisites


      allProjects{
        repositories {
          ...
          maven { url "https://jitpack.io" }
        }
      }


## Dependency

    Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

    ``` gradle
    dependencies {
      ... 
	    implementation 'com.github.SibaniKrishnaChoudhury-255:StaticPage:1.0.0'
    }
    ```


## How to use?

- #### Add in XML layout file
      <com.example.StaticPage.staticpage
        android:id="@+id/page"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>

		
- #### Add in Java file

      staticpage staticpage1=findViewById(R.id.page);

        staticpage1.setHeaderTitle("Cart")
                    .setHeaderTitleColor("#FF9800")
                    .setIcon(R.drawable.bag)
                    .setFooterTitle("YOUR CART IS EMPTY!")
                    .setFooterMessage("Move to the Home page to shop more")
                    .setButtonTitle("SHOP MORE")
                    .setButtonColor("#FF9800").setButtonTextColor("#ffffff")
                .onButtonClick(new clickListner() {
              @Override
              public void onClick() {
                  Toast.makeText(MainActivity.this, "Internet Connected", Toast.LENGTH_SHORT).show();
              }
          });


    
        
## Props

#### Page props

    - setHeaderTitle(String) :  Header Text
    - setHeaderTitleColor(String) : Header TextColor
    - setFooterTitle(String) : Footer Text
    - setFooterTitleColor(String) : Footer TextColor
    - setFooterMessage(String) : Footer Message
    - setFooterMessageColor(String) : Footer MessageColor
    - setButtonColor(String) : Button BackGroundColor
    - setButtonTextColor(String) :Button TextColor
    - setButtonTitle(String) : Button Text
    - setIcon(int) : Middle Image
    - onButtonClick(clickListner) : Button ClickEvent Handling
    
## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/SibaniKrishnaChoudhury-255/StaticPage/pulls).

Any contributions (large or small/ major or minor/ new features/ bug fixes) are welcomed and appreciated
but will be thoroughly reviewed.

### Contact - Let's become friend

- [Github](https://github.com/SibaniKrishnaChoudhury-255/)
- [Linkedin](https://www.linkedin.com/in/sibani-krishna-choudhury/)


## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)


      Copyright 2020 Sibanikrishna Choudhury

      Licensed under the Apache License, Version 2.0 (the "License");
      you may not use this file except in compliance with the License.
      You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

      Unless required by applicable law or agreed to in writing, software
      distributed under the License is distributed on an "AS IS" BASIS,
      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
      See the License for the specific language governing permissions and
      limitations under the License.
