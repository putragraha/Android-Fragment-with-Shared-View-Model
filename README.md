# Android Application using Fragment with Shared View Model
An Experimental Android application of Mine built with fragment to chunck view and using View Model to help data communication between fragments

## Explanataion
### Fragment
An amazing feature of Android which happen to help split view of Android application to small chunk, and obviously, might ease us maintain and extend it 

### View Model
An abstraction of Model which means it consist of data in model. This view model guy is maintaining a live data which changes simultaneously on every changes happen to model. This also observable by view which made view also showing the realtime data from model

## Tech Stack
- Java Language
- Android SDK version : 28
- Arch lifecycle for MVVM pattern, might be done by implementing following code in your app build.gradle
```
implementation 'android.arch.lifecycle:extensions:1.1.1'
```