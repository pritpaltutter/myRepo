package DataStructure;

public class TowerOfHanoi {

    public static void main(String[] args) {
        toh(4,"A","C","B");
    }


    public static void toh(int n, String source, String dest, String aux){


        if(n == 1){
            System.out.println("Move from"+source+" to "+dest);
            return;
        }
        toh(n-1,source,aux,dest);
        System.out.println("Move from "+source+" to "+dest);
        toh(n-1,aux,dest,source);
    }
}
