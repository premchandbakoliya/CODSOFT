
    import java.util.Scanner;

public class codsoft_taskno1 {
    public static void main(String[] args) {
        int numberOfSubjects = 5; 
        
        Scanner scanner = new Scanner(System.in);
        
        double totalMarks = 0; 
        
        System.out.println("Enter marks obtained (out of 100) for each subject:");
        
        for (int subjectNumber = 1; subjectNumber <= numberOfSubjects; subjectNumber++) {
            System.out.print("Subject " + subjectNumber + ": ");
            double subjectMarks = scanner.nextDouble();
            
            if (subjectMarks < 0 || subjectMarks > 100) {
                System.out.println("Invalid marks entered. Marks should be between 0 and 100.");
                subjectNumber--; 
                continue;
            }
            
            totalMarks += subjectMarks;
        }
        
        double averagePercentage = (totalMarks / (numberOfSubjects * 100)) * 100;
        
        System.out.println("Total marks obtained: " + totalMarks);
        System.out.println("Average percentage: " + averagePercentage + "%");
        
        String grade;
        
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        System.out.println("Grade: " + grade);
    }
}

