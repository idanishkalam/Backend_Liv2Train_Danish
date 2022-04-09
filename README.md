# Liv2Train

TO setup the Project:

1) Extract or git clone the Project on to the local system.
2) Open Mysql workbench and configure the user and password as given in the "application.properties" file.
3) Also create a database as per the configuration name given in your local host.
4) Run the Project by running command- "./mvnw spring-boot:run
5) It will be running on local host port 8080

To Check the Both apis running
1) Open Postman , in POST method use the API "/createCenter" and input the fields in JSON format , on clicking post the data will be saved on to mysql database.
2) USE the GET api , "/getAllCenters" , to get all the list of training center stored, in JSON format.
