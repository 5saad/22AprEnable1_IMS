Coverage: 70.5%
# Inventory Management System (IMS)

This is an application, used via a command line, that allows the user to store and manage customer information, items and customer orders. It allows the user to create, read, update and delete the information stored on the database.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

###

What things you need to install the software and how to install them

```
You will need: Java version 1.8 or higher, the latest mySQL version 8.0.19 or higher. It is also recommended you have git bash terminal to run the application.
```

### Installing and Deployment

A step by step to get a application running running

Steps:

```
1) Fork this repository 
2) pull it to your local machine.
3) In your local file enter the folder named "target"
4) Right click to Git Bash here.
5) To run the application type "java -jar ims-0.1.0-jar-with-dependencies.jar"
```

To use the application:

```
Simply write what menu you want to go into and press enter. Then you can writ what you wnat to do with this item e.g create, read, update or delete (CRUD).

You can write "return" to go back to the main menu

In the main menu write "stop" to stop the aplication.
```

Exampel 1: CUSTOMER > CREATE > John > Doe
Example 2: CUSTOMER > READ, This will then show "id: 1, First name: John, Surname: Doe

## Running the tests

Explain how to run the automated tests for this system. Break down into which tests and what they do

### Tests 
Tests that this application went through

```
JUNIT tests were taken with a coverage of 70.5% to ensure that the CRUD methods were working correctly. 
Mockito was also used to mock the DAO and utils classe, so that they could be tested in isolation.
Manual tests were also made in the eclipse console as well as the fat .jar application
```


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

Version 0.1.0.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* QA courseware
* Richard Mansworth
* Cameron Guthrie
* Chris Perrins
* Stackoverflow
* W3schools