# Course Registration System (CS102)
A Course Registration System created for CS102 Data Structures in the Spring of 2023 at NYU Courant.

The initial username and password for the admin account is admin and admin001.

![image](https://github.com/valeriesdev/CourseRegistrationSystem_CS102/assets/136139599/a447f44e-7c14-4169-8df2-09d6df0ae60c)
In the diagram above, a dotted pointed arrow representing an Interface is implemented in the class which is being pointed to. A solid pointed arrow represents that a class is inherited by the class that it is being pointed to. A solid line with no arrow represents a relationship or connection between classes. For example: In the class Main, the variable activeUser of type User exists, therefore a solid line with no arrow connects Main to User.

The workflow of the program can be understood through the above diagram. As you can see the Admin and Student class inherit from the User class and implements from each respective interface. The Admin course allows the Admin user to modify the course registry, add new students, and see multiple different reports. Any Admin method that modifies the course registry or the user registry operates directly on the relevant ArrayList through Main.data. The report functions work by returning a String[] or String[][] to the AdminWindow class to be output to the GUI. 

Any Student method that modifies the course registry, namely registering or withdrawing from a course, works similarly to the Admin methods, while simultaneously adding/removing the relevant course to/from the Students rCourses. The Student report methods work differently from the Admin’s report methods. The Student report methods work by passing in a list of the GUI elements that need to be outputted to, via reference, and then modifying those elements directly.

The Course class contains all of the variables for the course information, and several methods to get relevant information about the course, such as the number of free students, the course information, and a comparator method.

The Course and User class are both stored in ArrayLists in the Data class. The Data class holds that information, as well as methods to interact with that data, such as getting and adding users, students, admins, and courses. The Data class and the classes referenced by it are all Serializable, and it contains a method, save(), to save the .ser files.
The Main method has an activeUser, and data variable, as well as a function to load the .ser or .csv file. When the LoginWindow eventListener is called, the Main method onSignIn is called, which attempts to sign in the user. When this method is called, on success, it closes the login window and opens either the AdminWindow or StudentWindow.

Most of the code within the AdminWindow and StudentWindow is simply code dictating the placing and formatting of elements on the screen. However, in both classes, there is a relevant set of methods called the eventListeners. The eventListeners are called whenever their respective button, tab, or list element is selected. Then, the eventListener calls the relevant Student or Admin function through Main.activeUser.

The program utilzies the following OOP concepts:
▪ Method overloading
Method overloading can be seen throughout my program in the constructors of the various classes, for example Admin, Student, Course. This allows a user to be created that has no information, by calling new User() or instantiating that user with given information, such as a name and password.
▪ Method overriding (at least two examples)
Method overriding can be seen in the LoginWindow, AdminWindow, and StudentWindow classes. All of these classes contain EventListeners for the buttons and lists in the classes, which require overriding. See AdminWindow line 823, StudentWindow line 429, and LoginWindow line 78. All of these functions require overriding the default EventListener functions. 
▪ Abstract Class
My program does not utilize abstract classes. However, in the Student and Admin classes both implement the StudentInterface and AdminInterface, respectively. This aids in readability of the code and makes it easier to understand the functioning of the program.
▪ Inheritance 
The Admin and Student class both implement their respective interfaces and inherit from the User class. The User class contains methods for setting and accessing the User’s name, username, and password, among others. This is used primarily in logging in to the program, where the username and password must be accessed, and any time a user (usually student) needs to have its name displayed, where the getName() function can return a name in the form Lastname,Firstname.
▪ Polymorphism
The Admin, Student, and User demonstrate polymorphism. For example, the activeUser variable is of the declared type User, but depending on which account the user selects, the actual type will either be Admin or Student.
▪ Encapsulation
Many classes, notably User, Student, Admin, Course, utilize encapsulation. In those classes, you can see that most, if not all, class variables are marked private, and can only be accessed through getters and setters. You can see how in the User class, encapsulation is utilized to allow other classes to read the username, password, firstName, and lastName variables, but not to write them.
▪ The concept of ADT (Abstract Data Types) 
An abstract data type is a type which has a set of defined values and operations that act on those values. For example, the User class is an abstract data type. This is because it has more than just the values firstName, lastName, username, password, it has operations that act on these values. See the getName() method. The getName() method allows the user to run exampleUser.getName() to get the exampleUser’s name in lastname, firstname format. In contrast, if User was implemented as a concrete data type, other parts of the program would need to run exampleUser.lastName + exampleUser.firstName. The benefit of an ADT is that if the program writer wanted to change the name format to be firstname, lastname, all they have to do is change the getName() function, rather than every individual instance of exampleUser.lastName + exampleUser.firstName.
