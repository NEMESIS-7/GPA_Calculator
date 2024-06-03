import java.util.Scanner;

public class GPA_CALCULATOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of courses you took: ");
        int numberofcourses = input.nextInt();

        //arrays to store grades and credit hours
        double[] grades = new double[(int) numberofcourses];
        int[] credhrs = new int[(int) numberofcourses];

        // storing the grade and credit hours for each course the user is taking, using a for loop
        // doing this allows each grade to be stored to each single index in the array, the size of the arrays are determined by the user(numberofcourse and credhrs)
        for (int i = 0; i < numberofcourses; i++){
            System.out.print("enter the grade: ");
            grades[i] = input.nextDouble();
            System.out.print("enter the credit hours: ");
            credhrs[i] = input.nextInt();
        }
        // initializing variables to store the total grade points and the total credit hours
        double totalgradepnt = 0;
        int totalcredhrs = 0;

        //for loop iterating through the grades stored in the grades array and the credit hours array
        //then multiplying the grades by the credit hours to get the total grade points
        for (int i = 0; i < numberofcourses; i++){
            totalgradepnt += grades[i];
            totalcredhrs += credhrs[i];
        }
        System.out.println("your total grade points are: " + totalgradepnt);
        System.out.println("your total credit hours are: " + totalcredhrs);

        double GPA = totalgradepnt / totalcredhrs;

        System.out.println("your GPA is: " + GPA);

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
