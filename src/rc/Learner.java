/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rc;

/**
 *
 * @author RC_Student_lab
 */
public class Learner {
    //Declarations
    private String fullName, subject;
    private double assignMark,testMark, examMark;
    
    //Default contructor for class Learner
    public Learner(){
        this.fullName = "";
        this.subject = "";
        this.testMark = 0.00;
        this.assignMark = 0.00;
        this.examMark = 0.00;
    }
    
    //Overloaded Contructor
     public Learner(String fullName, String subject,double assignMark,double testMark, double examMark){
         setFullName(fullName);
         setSubject(subject);
         setAssignment(assignMark);
         setTest(testMark);
         setExam(examMark);
     }
     //Mutators
    //settter method to set learner name
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    //setter method for subject name 
    public void setSubject(String subject){
        this.subject = subject;
    }
    //setter method for assignment mark
    public void setAssignment(double assignMark){
        this.assignMark = assignMark;
    }
    //setter method for test mark
    public void setTest(double testMark){
        this.testMark = testMark;
    }
    //setter method for exam mark
    public void setExam(double examMark){
        this.examMark = examMark;
    }
    //getter method for calculation of average mark
    public double calcFinalMark(){
        return (this.assignMark + this.examMark + this.testMark)/3;
    }
}
