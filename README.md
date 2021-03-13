# Elevator-System

README File for SYSC3303 Project Iteration 2. This project implements an elevator control system simulator using multi-threading. The different sub-system threads send information to each through data packets and sockets, the floor and elevator subsystems are clients, and the scheduler is a server.

# Instructions For Setting Up Eclipse
-  Extract the zip file
    - UML and Sequence diagrams are within the file and can be seen
- Open Eclipse and click File->New->Project, then click General->Project, name the project whatever you like and click "Finish"
- Click File->Import, choose "File System"
- Browse for the extracted file, after that in the "Into Folder:" section browse for the new proect folder you made, then click "Finish"
- Click File->Open File and go to the project folder you made and go into the src subfolder, there you will see all of the classes
- Open all classes by double-clicking on each file inside the src subfolder
- Open the Controller class and run it

# Instructions For Setting Up Carleton VPN
NOTE: If you already have the Carleton VPN installed (Cisco AnyConnect) then ignore steps 1 - 
- First go to https://carleton.ca/its/help-centre/remote-access/vpn-for-mac-osx/ (There are other options on the left-hand side if your OS isn't MacOS)
- 

# Instruction For Testing
- To test for functioniality, run the ControllerTest.java class, run it as a Junit
- To test the full functionality, run Controller.java

# Class Names Explained
- Floor: This is our floor subsystem
- Elevator: This is our elevator subsystem
- Scheduler: This is our scheduler subsystem
- Controller: This is the controller of our system
- Input: This is the input file for the floor subsystem in the format: time, current floor number, up/down direction, car button

# Distrubution of Work (First name is Main programmer, second is helping programmer)
- Controller Class: Ahmad and Matthew
- Input Class: Albara'a and Chris
- Floor Class: Chris and Jamil
- Elevator Class: Matthew and Ahmad
- Scheduler: Jamil and Chris
- Test Class: Jamil and Albara'a
 
# Authors
Jamil Dergham, Christopher Langlois, Matthew Shirazi, Ahmad Abuoudeh, Albara'a Salem 
