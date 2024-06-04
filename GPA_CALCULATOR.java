import java.util.Scanner;

public class GPA_CALCULATOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of courses you took: ");
        int numberOfCourses = input.nextInt();

        //arrays to store grades and credit hours
        double[] grades = new double[(int) numberOfCourses];
        int[] creditHours = new int[(int) numberOfCourses];

        // storing the grade and credit hours for each course the user is taking, using a for loop
        // doing this allows each grade to be stored to each single index in the array, the size of the arrays are determined by the user(numberOfCourses and creditHours)
        for (int i = 0; i < numberOfCourses; i++){
            System.out.print("Enter the grade: ");
            grades[i] = input.nextDouble();
            System.out.print("Enter the credit hours: ");
            creditHours[i] = input.nextInt();
        }
        // initializing variables to store the total grade points and the total credit hours
        double totalGradepoints = 0;
        int totalCreditHours = 0;

        //for loop iterating through the grades stored in the grades array and the credit hours array
        //then multiplying the grades by the credit hours to get the total grade points
        for (int i = 0; i < numberOfCourses; i++){
            totalGradepoints += grades[i];
            totalCreditHours += creditHours[i];
        }
        System.out.println("Your total grade points are: " + totalGradepoints);
        System.out.println("Your total credit hours are: " + totalCreditHours);

        double GPA = totalGradepoints / totalCreditHours;

        System.out.println("Your GPA is: " + GPA);

        // if statements to assign classes to the GPA
        if ( GPA <= 4 && GPA >= 3.60 ){
            System.out.println("FIRST CLASS");
        }else if ( GPA >= 3 && GPA <= 3.59 ){
            System.out.println("SECOND CLASS");
        }else if (GPA >= 2 && GPA <= 2.99){
            System.out.println("THIRD CLASS");
        }else if (GPA >= 1 && GPA <= 1.49){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}
