Installer is too big to push to github. 

Here are the instructions to create an installer on a windows machine:

1. open a command line and navigate to the directory
	a. otherwise right click in directory and select "open in terminal"
2. type or copy/pasta "jpackage --app-version 1.3 --win-shortcut --win-console --input . --main-jar FourProblemPicker.jar"
	a. this requires jpackage which is included in later
		versions of jdk 
	b. using jpackage requires wixTools

This will create the installer from the included jar file. Running the installer 
will create the application in "Program Files" and create a desktop shortcut. 
Remove the --win-shortcut part of the command if a desktop shortcut is not desired.

Alternatively, you can simply run the application from the command line with 
either 'java FourProblemPicker' or 'java -jar FourProblemPicker.jar'


