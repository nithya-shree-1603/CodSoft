import java.util.Scanner;
class StudentGradCal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int sub=scanner.nextInt();
        int total=0;
        for(int i=1;i<=sub;i++){
            System.out.println("Enter the marks" + i +":");
            int marks=scanner.nextInt();
            total=total+marks;
        }
        int avg=total/sub;
       
        char grade=avg>85?'0':
                   avg>75?'A':
                   avg>65?'B':
                   avg>55?'C':
                   avg>45?'D':'F';
                   
        System.out.println("Total Marks: "+total);
        System.out.println("Average: "+avg);
        System.out.println("Grade: "+grade);
    }
}