
# react-native-zbluetooth

## Getting started

`$ npm install react-native-zbluetooth --save`

### Mostly automatic installation

`$ react-native link react-native-zbluetooth`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-zbluetooth` and add `RNZbluetooth.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNZbluetooth.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.lgx.bluetooth.RNZbluetoothPackage;` to the imports at the top of the file
  - Add `new RNZbluetoothPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-zbluetooth'
  	project(':react-native-zbluetooth').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-zbluetooth/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-zbluetooth')
  	```


## Usage
```javascript
import RNZbluetooth from 'react-native-zbluetooth';

// TODO: What to do with the module?
RNZbluetooth;
```
  