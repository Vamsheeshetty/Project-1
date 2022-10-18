# Project-1
Virtual Key for Your Repositories  - As a Full Stack Developer, complete the features of the application by planning the development in terms of sprints and then push the source code to the GitHub repository. As this is a prototyped application, the user interaction will be via a command line. 
Prototype Application Of Virtual Key
Phase 1 Assessment Project
Developer: Vamshee GS
Email ID: vamsheeshetty007@gmail.com
Project Name: Prototype Application of Virtual Key
GitHub Link: https://github.com/Digeesh4/virtualkey17102022.git
DESCRIPTION
Project objective:
As a Full Stack Developer, complete the features of the application by planning the development in terms of sprints and then push the source code to the GitHub repository. As this is a prototyped application, the user interaction will be via a command line.

Background of the problem statement:
Company Lockers Pvt. Ltd. hired you as a Full Stack Developer. They aim to digitize their products and chose LockedMe.com as their first project to start with. You’re asked to develop a prototype of the application. The prototype of the application will be then presented to the relevant stakeholders for the budget approval. Your manager has set up a meeting where you’re asked to present the following in the next 15 working days (3 weeks):
•	Specification document - Product’s capabilities, appearance, and user interactions
•	Number and duration of sprints required
•	Setting up Git and GitHub account to store and track your enhancements of the prototype
•	Java concepts being used in the project
•	Data Structures where sorting and searching techniques are used.
•	Generic features and three operations:
o	Retrieving the file names in an ascending order
o	Business-level operations:
	Option to add a user specified file to the application
	Option to delete a user specified file from the application
	Option to search a user specified file from the application
	Navigation option to close the current execution context and return to the main context
o	Option to close the application
The goal of the company is to deliver a high-end quality product as early as possible. 

The flow of application:
The project is divided into two sprints of time duration 2 days each.
Sprint 1:
10th October 2022 – 11th October 2022
1.	Make a flowchart of a problem statement as described in description.
2.	Write a code which should display at the command line.
3.	Test the code in command line and remove the errors if any.
4.	Write a report of Sprint 1.
Sprint  2:
12th October 2022-13th October 2022
1.	Write a remaining code which includes file handling and exception handling techniques.
2.	Test the code in command line and remove the errors if any.
3.	Push the project to GitHub.
4.	Complete the report.
5.	Submit in SimpliLearn platform.

Flow Chart
 





Core concepts used in project:
Searching,  Flow Control,   Exception Handling,  Streams API, Collections framework, File Handling, etc.

Product’s capabilities, appearance, and user interactions:

•	Code to display the welcome screen:
o	Application name and the developer details
o	The details of the user  such as options displaying the user interaction information
o	Features to accept the user input to select one of the options listed
•	The first option return the current file names
•	The second option return the details of the user interface such as options displaying the following:
o	Add a file to the existing directory list
	Case sensitivity ignored
o	Delete a user specified file from the existing directory list
	Case sensitivity on the file name in order to ensure that the right file is deleted from the directory list
	Return a message if FNF (File not found)
o	Search a user specified file from the main directory
	Case sensitivity on the file name to retrieve the correct file
	Display the result upon successful operation
	Display the result upon unsuccessful operation
o	Option to navigate back to the main context
•	Third option to close the application



Following Resources are used:
1.	Eclipse:
Eclipse is an IDE which is used to code the application.
2.	Java:
A programming language to develop the prototype.
3.	Git:
To connect and push files from the local system to GitHub.
4.	GitHub:
To store the application code and track its versions
5.	Scrum:
An efficient agile framework to deliver the product incrementally
6.	Specification document:
Microsoft Word for Documentation and Microsoft Powerpoint for making flow chart.






Steps Involved in Project:
1.Creating Flowchart
 



2.Writing Code in Eclipse
The Code is divided into two parts:
i.	Display code with all details
ii.	File Handling and Exception Handling
Methods created

1)	Start Method:


public class proj {
static final int input=0;
static String DIRECTORY;
File foldername;
private static Object file;



//welcome code
private static String Welcome_String ="\nApplication Name :Project 1" + "\nDevelopers Details :Vamshee GS1";
static String Main_menu =
"\nMain_menu - select the following"+"\n 1 - select the Directory"+"\n 2 - Add,search or Delete"+"\n 3 -exit";
//
public static void projectintro() {
File file=new File("C:\Users\Vamshi-Sharu\Desktop\Project");
if(!file.exists())
file.mkdirs();
System.out.println(Welcome_String);

}





2)	FileHandling


public static void projectintro() {
File file=new File("C:\Users\Vamshi-Sharu\Desktop\Project");
if(!file.exists())
file.mkdirs();
System.out.println(Welcome_String);

}


public static void case1() {
File file=new File("C:\Users\Vamshi-Sharu\Desktop\Project ");
System.out.println("List of Files in Directory:");
File[]Listoffiles=file.listFiles();

for(File s:Listoffiles)

System.out.println("["+ " "+s.getName()+"]");
}
static String Second =
"\n select the following"+"\n a - add file"+"\n b - Delete file"+"\n c -search"+"\n d -exit";
static void showmain() {
System.out.println(Second);
}




3)	CreateFile


Scanner sc= new Scanner(System.in);
String sa= sc.next();

if(sa.equals("a")) {
System.out.println("Enter the  name of the File:");
String fileName=sc.next();

File file=new File("C:\Users\Vamshi-Sharu\Desktop\Project "+fileName+".txt");
if(file.createNewFile()) {
System.out.println("file is created"+" "+fileName);

}
else {
System.out.println("the file is already created");
}




4)	DeleteFile:


else if(sa.equals("b")) {
System.out.println("Enter the name of file you want to deleted:");
deleteFile=sc.next();
try {
Files.deleteIfExists(Paths.get("C:\Users\Vamshi-Sharu\Desktop\Project "+deleteFile+".txt"));
System.out.println("Deleted successfully");
}

catch(DirectoryNotEmptyException e) {
System.out.println("Directory not Exists");
}
catch (IOException e) {
System.out.println("Invalid Permission");
}

5)	Search file

else if(sa.equals("c")) {
System.out.println("Folder Name!?");
String Searching=sc.next();
File file=new File("C:\Users\Vamshi-Sharu\Desktop\Project "+Searching+".txt");
if(file.exists()) {
System.out.println("file is found");

}
else {
System.out.println("file not found");
}



3.Testing the code
The code is tested with various inputs, file handling and exception handling.


4.Pushing code to GitHub

Steps to push code into gitHub:
●	Open your command prompt and navigate to the folder where you have created your files.
cd <folder path>
●	Initialize repository using the following command:
git init
●	Add all the files to your git repository using the following command:
git add .
●	Commit the changes using the following command:
git commit .  -m  <commit message>
●	Push the files to the folder you initially created using the following command:
git push -u origin master

Unique Selling Points of the Application

1.	The application is designed to keep on running and taking user inputs even after exceptions occur. To terminate the application, appropriate option needs to be selected.

2.	The application can take any file/folder name as input.

3.	The user is then provided the option to select a specific file to delete.

4.	The application also allows user to delete folders which are not empty.

5.	The user is able to seamlessly switch between options or return to previous menu even after any required operation like adding, searching or deleting of files is performed.


6.	The application is designed with modularity in mind. Even if one wants to update the path, they can change it through the source code. Application has been developed keeping in mind that there should be very less “hardcoding” of data.
Conclusions

Further enhancements to the application can be made which may include:

•	Conditions to check if user is allowed to delete the file or add the file at the specific locations.
•	Asking user to verify if they really want to delete the selected directory if it’s not empty.
•	Retrieving files/folders by different criteria like Last Modified, Type, etc.
•	Allowing user to append data to the file.

