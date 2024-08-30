//Create class student and sports .create another class result inherited from student and sports .
//display the academic and sports of the student

import java.util.Scanner;

class student{
    private String name;
    private int academicScore,rollNumber;

    public student(String name,int academicScore,int rollnumber){
        this.name =name;
        this.academicScore = academicScore;
        this.rollNumber = rollnumber;
    }
    public void displayAcademicDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Academic Score: " + academicScore);
    }
}

class Sports{
    private String sportsName;
    private int sportsScore;
    
    public Sports(String sportsName, int sportsScore) {
        this.sportsName = sportsName;
        this.sportsScore = sportsScore;
    }

    public void displaySportsDetails() {
        System.out.println("Sport: " + sportsName);
        System.out.println("Sports Score: " + sportsScore);
    }
}

class result extends student {
    private Sports sports;
    result(String name,int academicScore,int rollnumber,String sportsName, int sportsScore){
        super(name,academicScore,rollnumber);
        this.sports = new Sports(sportsName,sportsScore);

    }
    void display(){
        displayAcademicDetails();
        sports.displaySportsDetails();
    }

    public static void main(String[] args){
        result r= new result("John Doe", 101, 85, "Basketball", 90);
        r.display();
    }
}