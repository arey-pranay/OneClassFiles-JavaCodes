import java.util.Scanner;

class CelebrityProblem {
    void solution(int[][] relation) {
        int celebrity = 0;
        for(int i = 0; i < relation.length; i++) {
            if(i != celebrity && relation[celebrity][i] == 1) {
                celebrity = i;
            }
        }
        for(int i = 0; i < relation.length; i++) {
            if(i != celebrity && (relation[celebrity][i] == 1 || relation[i][celebrity] == 0)) {
                System.out.println("none");
                return;
            }
        }
        System.out.println("Celebrity is " + celebrity);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] relation = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                relation[i][j] = sc.nextInt();
            }
        }
        new CelebrityProblem().solution(relation);
    }
}
