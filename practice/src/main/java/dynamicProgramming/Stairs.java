package dynamicProgramming;

public class Stairs {
    public static void main(String[] args) {
        Stairs stairs = new Stairs();

        System.out.println(stairs.numberOfStair(100));
    }


    public int numberOfStair(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return numberOfStair(n - 1) + numberOfStair(n - 2);

    }
}
