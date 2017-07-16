# Simple-Calculator
This game is built with Java GUI.

![ScreenShot](https://raw.github.com/JunhoAn0702/Simple-Calculator/master/SimpleCalculator.png)

## I. Introduction
This app is designed with MVC design pattern to conduct simple math calculation by clicking the buttons, and the result should be displayed in the Output Display Panel. Whenever a math calculation is successfully conducted, that is, the "=" button is clicked, the client will send a message to the server, which will record the successful math equation, such as "3+5+8=16".

## II. Startup


## III. Controls
Hold the accelerometer in your hand with the Y-axis pointing to the left or right. In order to go left or right, rotate your wrist. In order to fire at the enemy spaceship, snap your wrist. We set the threshold value in X-direction in order to detect the snap.

## IV. Core Functionality
The core functionality includes setting up the serial port, calibrating, starting and stopping of reading the sensor values, filtering, closing the serial port, and a game as visualization of the read values. Threshold crossing detection is used to fire the laser. If you snap your wrist, the change of accelerometer values in X-direction will be detected with the threshold value. In order to minimize the noise from reading the accelerometer values, we used many conditions with if statement with setting the threshold values. 

## V. Advanced Functionality
All of the colors of the GUI have been changed, as well as a background picture within the game itself. The spacecraft in the game look like 3D figures in a 2D animation, just like
"StarFox" from Super Nintendo. The main figure is controlled with the accelerometer, while the enemy spaceship oscillates back and forth. The laser and explosion animation run on "for loops." There is also music, with a button to give the option to turn it on or off.

## VI. Difficulty and limitation
We tried to create different levels of game, however, with the simultaneously workable start and stop button, the level system wasn’t stable. Our goal was to create that every time the user restarts the game, the level goes up, which means that the enemy spaceship moves faster, but if the user press the stop button, the level goes back to 1. Currently, our main functions are all in the while loop when the stop button is not pressed. For the future, we are trying to create a slider that controls the value of velocity of enemy’s spaceship. 
