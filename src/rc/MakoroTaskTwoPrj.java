/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rc;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class MakoroTaskTwoPrj {

    /**
     * @param args the command line arguments
     */
    static Learner objLearner = new Learner();
    static String fullName, subject;
    static double assignMark, testMark, examMark;

    public static void main(String[] args) {
        getLearnerInput();
        displayFinalMark();

    }

    //Method for getting learner input
    public static void getLearnerInput() {
        fullName = JOptionPane.showInputDialog("Enter Leaner Name");
        subject = JOptionPane.showInputDialog("Enter Subject");
        assignMark = Double.parseDouble(JOptionPane.showInputDialog("Please Enter Assignment Mark"));
        testMark = Double.parseDouble(JOptionPane.showInputDialog("Please Enter Test Mark"));
        examMark = Double.parseDouble(JOptionPane.showInputDialog("Please Enter Exam Mark"));

        objLearner = new Learner(fullName, subject, assignMark, testMark, examMark);
    }

    //method to display final mark after calculation
    public static void displayFinalMark() {
        double average = objLearner.calcFinalMark();
        JOptionPane.showMessageDialog(null, "Avergae Mark of Learner :" + average);
    }

}
