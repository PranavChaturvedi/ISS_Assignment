import java.awt.*;
import java.util.*;
public class DecisionMaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        if(x>=80)System.out.println("A Grade");
        else if(x>=70)System.out.println("B Grade");
        else if(x>=60)System.out.println("C Grade");
        else if(x>=50)System.out.println("D Grade");
        else System.out.println("Fail");
    }
}
