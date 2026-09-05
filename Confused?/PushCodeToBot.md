# Pushing Code to Bot
* #### Need a USB Wifi adapter to connect to an external wifi and the driver hub.
* #### Need Rev Hardware Client
* #### Need Android Studio
* #### Need a bot and driver hub

### Connecting to bot
1. connect to the wifi with bulit in Wifi adapter
2. connect to driver hub wifi with the USB Wifi adapter
3. in Android studio, should see Rev Control Hub appear in devices list

### Pushing code to bot
1. make sure teamcode is selected in toolbar in android studio
2. run the code
3. bottom bar will evenutally say lanuch succeeded

### Hardware side
#### 1. The text name you type in your Java code must **exactly match** (Case Senstive) the hardware configuration name set up on the physical **Driver Hub**. If they do not match perfectly, the robot will crash with a `NullPointerException` the moment you hit initialize.
2. 
