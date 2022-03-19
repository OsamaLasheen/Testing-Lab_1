import java.util.Scanner;

public class VectorsMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int forceArray[]={0,0,0};
        int forcesNo = scan.nextInt();
        for(int i=0;i<forcesNo;i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            forceArray[0] += x;
            forceArray[1] += y;
            forceArray[2] += z;
        }
        if(forceArray[0] == 0 && forceArray[1] == 0 && forceArray[2] == 0) {
            System.out.println("the sum of the vectors is " + forceArray[0]+" "+forceArray[1]+" " + forceArray[2] + " the result is YES");
        }
        else System.out.println("the sum of the vectors is " + forceArray[0]+" "+forceArray[1]+" " + forceArray[2] + " the result is NO");

    }
}
