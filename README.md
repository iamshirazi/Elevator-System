# Elevator-System

ReadMe File for SYSC3303 Winter 2021 Project. This project implements an elevator control system simulator using multi-threading. The different sub-system threads send information to each through data packets and sockets, the floor and elevator subsystems are clients, and the scheduler is a server.

# Instructions For Setting Up
-  Extract the zip file
    - UML and Sequence diagrams are within the file and can be seen
- Open Eclipse and click File->New->Project, then click General->Project, name the project whatever you like and click "Finish"
- Click File->Import, choose "File System"
- Browse for the extracted file, after that in the "Into Folder:" section browse for the new proect folder you made, then click "Finish"
- Click File->Open File and go to the project folder you made and go into the src subfolder, there you will see all of the classes
- Open all classes by double-clicking on each file inside the src subfolder
- Open the Controller class and run it

# Class Names Explained
- Floor: This is our floor subsystem, hence we called it floor
- Elevator: This is our elevator subsystem, hence we called it elevator
- Scheduler: This is our scheduler subsystem, hence we called it scheduler
- Controller: This is the controller of our system, run it to run the program
- Input: This is the input file for the floor subsystem in the format: time, current floor number, up/down direction, car button

# Distrubution of Work (First name is Main programmer, second is helping programmer)
- Controller Class: Ahmad and Matthew
- Input Class: Albara'a and Chris
- Floor Class: Chris and Jamil
- Elevator Class: Matthew and Ahmad
- Scheduler: Jamil and Chris
- Test Class: Albara'a and Ahmad 

# Authors
Jamil Dergham, Christopher Langlois, Matthew Shirazi, Ahmad Abuoudeh, Albara'a Salem 
