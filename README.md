# Simple-Calculator
This game is built with Java GUI.

![ScreenShot](https://raw.github.com/JunhoAn0702/Simple-Calculator/master/SimpleCalculator.png)

## I. Introduction
This app is designed with MVC design pattern to conduct simple math calculation by clicking the buttons, and the result should be displayed in the Output Display Panel. Whenever a math calculation is successfully conducted, that is, the "=" button is clicked, the client will send a message to the server, which will record the successful math equation, such as "3+5+8=16".

## II. Startup
1. Open eclipse.
2. Import both projects(CalculationServer, and SimpleCalculator) into eclipse.
3. Run the CalculationServer first.
4. Run the SimpleCalculator while the CalculationServer is running.
5. In the SimpleCalculator console - For every input, different states are printed to follow what the programming is calculating.
6. After run a few equations in the SimpleCalculator GUI, go to the CalculationServer, and type "yes".
7. As a result, all successful calculations will be displayed in a format.

## III. State
The state transition diagram of the calculator:

![ScreenShot](https://raw.github.com/JunhoAn0702/Simple-Calculator/master/StateTransition.png)

