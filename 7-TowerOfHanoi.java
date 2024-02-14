import java.util.Scanner;

public class TOH {
    public static void solution(int n, char src, char dest, char aux)
    {
        if(n==1)
        {
            System.out.println("Move "+n+" from "+src+" to "+dest);
        }
        else
        {
            solution(n-1, src, aux, dest);
            System.out.println("Move "+n+" from "+src+" to "+dest);
            solution(n-1, aux, dest, src);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n, 'A', 'C', 'B');
    }
}
