import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int olcu=0;
        for (;a!=0;a/=10){
            olcu++;               //reqemin nece oldugunu yoxlamaq olar
        }
        System.out.println(olcu);
    }
}