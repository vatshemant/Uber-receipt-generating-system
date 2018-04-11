# Uber-receipt-generating-system
This project basically generates a fare slip according to the trip you have chosen out of the given options. 

There are total of three domians 
1. Driver: In this domain driver can register itself and check his daily trips and payments.

2. Passenger: In this domain a passenger can select a ride out of given options and after the trip is completed a virtual fare slip will be generated having all the details. 

3. Corporate: This domain have all the details of driver and passenger. This domain is basically for official use.

All the corresponding data is stored into database using database connection class.
DriverDetails are stored in Driver TABLE and PassengerDetails are stored in Passenger TABLE.

TABLES can be created by running DBConnection Class seperately, this class connects Database with workspace and creates 2 tables namely DriverDetails and PassengerDetails.