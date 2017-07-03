# _Event_

#### _Party planner app, July 3, 2017_

#### By _**Esvethlynna Pangelinan**_

## Description

_This is a command line application for a party planning service.  It prompts the user to answer several questions, and based on their information calculates the total cost of the party._

## Specifications

|Behavior |Input|Output|
|---|---|---|
|The user can enter a single guest.|1|1 is accepted, user is prompted to enter a food item or Exit|
|The user can enter a food item.|pizza|pizza is accepted, user is prompted to enter another food or Exit|
|The user can exit from entering food items.|Exit|user is prompted to enter a beverage item or Exit|
|The user can enter a beverage item.|soda|soda is accepted, user is prompted to enter another beverage or Exit|
|The user can exit from entering beverages.|Exit|user is asked if they would like to add entertainment|
|The user can choose to add entertainment.|Yes|user is prompted to enter an entertainment item|
|The user can enter an entertainment item.|live band|live band is accepted, user is prompted to enter another entertainment item or Exit|
|The user can exit from entering entertainment.|Exit|a list of the food, beverages, and entertainment entered by the user is shown, along with the total cost.  Coupon information is provided.  User is asked if they want to use a coupon.|
|The user can choose to use a coupon.|Yes|user is prompted to enter the coupon code|
|The user can enter the coupon code.|0909HalfOff|the discount is applied and the final cost is displayed|
|The user can choose not to use a coupon.|No|no discounts are applied and the final cost is displayed|

## Setup/Installation Requirements

* _Navigate to event/src/main/java._
* _At the console, enter: "javac App.java && java App"_


## Known Bugs

_No bugs that I am aware of_

## Support and contact details

_If you have any questions or suggestions, please email Lynn at esveth@aol.com._

## Technologies Used

_Java SDK, Java JRE, Gradle_

### License

*This software is licensed under the MIT license.*

Copyright (c) 2017 **_Esvethlynna Pangelinan_**
