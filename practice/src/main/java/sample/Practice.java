package sample;

public class Practice {


    public static void main(String[] args) {
        boolean one = true;
        boolean two = true;
        boolean three = false;
        boolean four = false;
        boolean five = false;
        boolean six = false;
        boolean seven = false;
        boolean eight = false;
        boolean nine = false;
        boolean ten = false;


        if((one && two) || (three && four && five)){
            System.out.println("Inside IF");
        }else{
            System.out.println("Inside Else");
        }

        if(one && two || three && four && five){
            System.out.println("Inside Second IF");
        }else{
            System.out.println("Inside Second Else");
        }

    }
}
