import java.util.Scanner;

class hbb{
    public static void main(String args[]){
        Scanner ete = new Scanner(System.in);
        double jnum, dnum, unum, ans;
        System.out.println("enter first num: ");
        jnum = ete.nextDouble();
        System.out.println("enter second num: ");
        dnum = ete.nextDouble();
        System.out.println("enter third num: ");
        unum = ete.nextDouble();
        ans = jnum + dnum + unum;
        System.out.print("ans is: ");
        System.out.print(ans);
    }
}