------------------------------------------------------------------------
This is starter code for the Used Car Lot ArrayList group assignment.

Use the starter code to re-write a UsedCarLot class that has the following 
properties:

1) Adding and subtracting cars must be managed through the use of an ArrayList
2) All data must be validated prior to adding to the used car lot as follows:
  i) Price must be > 0
  ii) number of gears must be within the folloing limits (3<=numGears<=6)
 ii) vin number must be unique (yes you will need to add an instance var to Car)
iii) You need to be able to search for cars by the following fields:
	a) make="xxx"
        b) model="xxxx"
        c) price <= x
        d) color="xxx"
        e) year >= x
        f) trans="auto|manual"

NOTE: The above criteria requires the following new fields

Car:
 String make;
 String trans;
 string vinNumber;// required for ii
 int year;

iv) Use an overridden java "toString" method to be able to print any or all 
matches nicely formatted for all searches from iii.

v) For search results, be able to delete all cars that match a certain criteria.
UI for this should be "Here is the list of cars that match _____". Would you
like to remove them from the lot (Y/N)

vi) Be able to find a single car by vin number, and change it's price.



Each group will maintain it's own repository for this assignment (fork), and provide a link
as part of the submission process.

------------------------------------------------------------------------

MAKE SURE TO FILL IN ALL FIELDS BELOW!!!!


PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:
