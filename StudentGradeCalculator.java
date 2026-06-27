import java.util.*;

public class StudentGradeCalculator {
    
   public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int [] marks = new int[5];

    String[] Subjects = {
        "math",
        "Java",
        "Cpp",
        "Python",
        "Html"
    };

    int total = 0;

    for(int i = 0 ;i<marks.length ;i++){

        System.out.println("Enter "+ Subjects[i] + " marks:");
        marks[i] = sc.nextInt();

        while(marks[i] < 0 || marks[i] > 100){
            System.out.println("Invalid marks!  Enter again");
            marks[i] = sc.nextInt();
        }
        total += marks[i];
    }

    System.out.println("total marks is: " + total);

    double percentage  = (total / (marks.length * 100.0)) * 100;  
    System.out.println("percentage: " + percentage);

    if(percentage >= 90){
        System.out.println("Grade A");
    }
    else if(percentage >= 80){
        System.out.println("Grade B");
    }
    else if(percentage >= 70){
        System.out.println("Grade C");
    }
    else if(percentage >= 60){
        System.out.println("Grade D");
    }
    else{
        System.out.println("Grade F");
    }
    sc.close();
   }
   

}