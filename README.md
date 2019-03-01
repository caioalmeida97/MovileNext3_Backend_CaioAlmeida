# MovileNext3_Backend_CaioAlmeida

This project consists on a REST API implemented with Spring Boot and MongoDB.

To run this project, you need to have in your machine:
  - Java
  - MongoDB
  - Maven
  
Essentialy, build the maven project, run class *OrderApplication* as JavaApplication.

Java Spring Boot Application will run on port:8080, if you need to change, just configure the file *application.properties*. And MongoDB is running in its default's port, that is port:27017

To run this project, download it or clone it, open a terminal window and follow these command to run MongoDB:

    $ mongod
    
Open another terminal window and run the project by running the following commands:

    $ cd /path/of/the/project/orders2
    $ mvn install
  
If you face the issue

    $ mvn: command not found
  
I recommend following this tutorial: [https://www.youtube.com/watch?v=j0OnSAP-KtU](https://www.youtube.com/watch?v=j0OnSAP-KtU)
