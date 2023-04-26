package chapter10;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public String[] getStudents(){
        //return an array of students that is the size of the number of students 
        //in the course
        String[] newStudents = new String[numberOfStudents];
        for(int i = 0; i < numberOfStudents; i++){
            newStudents[i] = students[i];
        }
        return newStudents;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    public void addStudent(String student){
        if(students.length + 1 < numberOfStudents){
            //if the array isn't big enough, create a new bigger array
            String[] newStudents = new String[(int)(numberOfStudents * 1.1)];
            for(int i = 0; i < students.length; i++){
                newStudents[i] = students[i];
            }
            students = newStudents; //students is now the bigger array, the old 
            //array is garbage. 
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
        
    }

    public void dropStudent(String student){
        //remove a student from the course
        int index = 0;
        String[] newStudents = new String[students.length - 1];

        for(int i = 0; i < students.length; i++){
            if(students[i] == student){
                students[i] = " ";
                index = i;
            }
        }
        //shift remaining students
        for(int i = index; i < students.length - 1; i++){
            newStudents[i] = students[i+1];
            students[i+1] = " "; //prevent the last student from being a duplicate
        }
        numberOfStudents--;
    }
    
    public void clear(){
        //remove all students from the course and reset to defaults
        numberOfStudents = 100;
        students = new String[numberOfStudents];
    }

}