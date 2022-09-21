Here are the instructions to create an installer on a windows machine:

1. open a command line and navigate to the directory
	a. otherwise right click in directory and select "open in terminal"
2. type or copy/pasta: jpackage --app-version 1.3 --win-shortcut --win-console --input . --main-jar FourProblemPicker.jar
	a. this requires jpackage which is included in later
		versions of jdk 
	b. using jpackage requires wixTools

This will create the installer from the included jar file. Running the installer 
will create the application in "Program Files" and create a desktop shortcut. 
Increment the --app-version if updating the program as the installer will not 
function correctly if it finds the current version already installed.

Remove the --win-shortcut part of the command if a desktop shortcut is not desired.

Alternatively, you can simply run the application from the command line with 
either 'java FourProblemPicker' or 'java -jar FourProblemPicker.jar'

Add jpackage option to choose the installation directory when installer runs:
	--win-dir-chooser 

A list of other available jpackage options can be found here: https://docs.oracle.com/en/java/javase/14/docs/specs/man/jpackage.html
