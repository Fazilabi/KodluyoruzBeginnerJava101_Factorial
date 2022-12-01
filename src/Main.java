import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.print("Enter factorial number : ");
        int num = input.nextInt(), total=1;
        for (int i=1; i<=num; i++){
            total *=i;
        }
        System.out.println(num+ "- factorial = " + total);*/

        int n, nFac = 1, r, rFac = 1,  nMinusR_Fac =1, total = 1;
        System.out.println("Enter C(n, r) values :");
        System.out.print("n : ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            nFac *= i;
        }
        System.out.print("r : ");
        r = input.nextInt();
        for (int i = 1; i <= r; i++) {
            rFac *= i;
        }

        System.out.println(nFac +"--"+rFac );
        if(n>=r){

            for (int i=1;i<=(n-r); i++){
                nMinusR_Fac*=i;
            }

            total = nFac / (rFac * nMinusR_Fac);
            System.out.println("C(n,r) = " + total);

        }else {
            System.out.println(" please enter n ≥ r ≥ 0");
        }

    }
}