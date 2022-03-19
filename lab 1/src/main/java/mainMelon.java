import java.util.Scanner;

public class mainMelon {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        if (size == 2){
            System.out.println("NO");
        }
        else if(size % 2 == 0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
