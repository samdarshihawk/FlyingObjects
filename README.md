# FlyingObjects Written by @samdarshihawk & @MeetVora
 A Programming question focused on inheritance and polymorphism


Various flying objects can be described as follows:
−An Airplane class, which has the following attriobutes: a brand (String type), price (double type)and horse power (int type).

A Helicopter is an Airplane that additionally has thefollowing: a number of cylinders (int type), a creationyear (int type), and a passenger capacity (int type).
−A Quadcopter, is a Helicopter that additionally has thefollowing: max flying speed (int type), which indicates itsmaximum moving speed.
−A Multirotor is a Helicopter that additionally has thefollowing: number of rotors (int type), which indicates itsnumber of rotors/blades that it has.
−A UAV (Unmanned aerial vehicle / Drone) class has thefollowing attributes: weight (double type), and price(double type).

An AgriculturalDrone (which is used for cropproduction) is UAV that additionally has the following:brand (Sting type), and carry capacity (int type).
−A MAV (Micro Air Vehicle), is a miniature UAV thathas a size restriction (and can be as small as fewcentimeters. It has the following: model (String type) andsize (double type).

UML representation for the hierarchy of the above-mentioned classes. Your representationmust also be accurate in terms of UML representation of the different entities and the relationbetween them.

5 different Java packages for the classes. The first package will include theAirplane class. The second package will include the Helicopter, and the Quadcopter classes.The third package will include the Multirotor class. The fourth package will include UAV class,and the last package will include the AgriculturalDrone and MAV classes.

Each of the classes, have three constructors, a default constructor, aparametrized constructor  and a copy constructor. For each of the classes include have the following methods: accessors, mutators,toString() and equals() methods.

Trace(search) that array to find the two objects that have the least expensive price (that isleast expensive and second least expensive). Display all information of these two objectsalong with their location (index) in the array.

In the driver program, We created to add another static method (add it above the main() method),called copyFlyingObjects. The method will take as input an array of these objects (the array canbe of any size) and returns a copy of that array.