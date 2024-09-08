import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total number of subjects:");
        int no_sub=scanner.nextInt();
        int[] marks = new int[no_sub];
        int total= 0;
        String grade;
        for(int i=0;i<no_sub;i++){
            System.out.print("Enter mark "+(i+1)+":");
            marks[i]=scanner.nextInt();
            total+=marks[i];
        }
        double percentage=total/no_sub;
        if(percentage>=90)
            grade="A+";
        else if (percentage>=80)
            grade="A";
        else if (percentage>=70)
            grade="B+";  
        else if (percentage>=80)
            grade="B";      
        else if (percentage>=80)
            grade="C+";     
        else if (percentage>=80)
            grade="C";   
        else
            grade="F";        
        System.out.println("Total marks:"+total);
        System.out.println("Average percentage:"+percentage);
        System.out.println("Grade:"+grade);  
        scanner.close();
    }
}
