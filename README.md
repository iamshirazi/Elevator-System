# Elevator-System

README File for SYSC3303 Project Iteration 3. This project implements an elevator control system simulator using multi-threading. The different sub-system threads send information to each through data packets and sockets, the floor and elevator subsystems are clients, and the scheduler is a server.

In this iteration, we refactored our system to be able to handle multiple requests and multiple elevators. We also split our system into three processes. 

# Instructions For Setting Up Eclipse
-  Extract the zip file
    - UML and Sequence diagrams are within the file and can be seen
- Open Eclipse and click File->New->Project, then click General->Project, name the project whatever you like and click "Finish"
- Click File->Import, choose "File System"
- Browse for the extracted file, after that in the "Into Folder:" section browse for the new proect folder you made, then click "Finish"
- Click File->Open File and go to the project folder you made and go into the src subfolder, there you will see all of the classes
- Open all classes by double-clicking on each file inside the src subfolder
- Open the Controller classes for all 3 subsystems
- First run the FloorController and pin it, then the ElevatorController and pin it, then finally run the schedulerController and pin it
- There should be 3 console windows for each controller, in the floor window you can set how many floors you want, in the elevator window you can set how many windows you want
- The rest should take care of itself


# Class Names Explained
- Floor: This is our floor subsystem
- Elevator: This is our elevator subsystem
- Scheduler: This is our scheduler subsystem
- Controller: This is the controller of our system
- Input: This is the input file for the floor subsystem in the format: time, current floor number, up/down direction, car button
- FloorController: Controller for the floor, intializes the threads and starts them
- ElevatorController: Controller for the elevator, intializes the threads and starts them
- SchedulerController: Controller for the scheduler, intializes the threads and starts them 

# Distrubution of Work (First name is Main programmer, second is helping programmer)
- ElevatorController: Jamil and Matthew
- FloorController: Albara'a and Matthew
- SchedulerController: Chris
- Floor: Matthew and Albara'a
- Scheduler: Chris and Jamil/Matthew
- Elevator: Chris and Jamil
- Tests: Albara'a and Matthew
- UML Diagram: Albara'a and Ahmad
- Sequence Diagram: Jamil and Ahmad
 
# Authors
Jamil Dergham, Christopher Langlois, Matthew Shirazi, Ahmad Abuoudeh, Albara'a Salem 
