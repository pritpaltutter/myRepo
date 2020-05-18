package sample;

public class Practice {


    public static void main(String[] args) {
        boolean one = false;
        boolean two = true;
        boolean three = true;
        boolean four = true;
        boolean five = false;
        boolean six = false;
        boolean seven = false;
        boolean eight = false;
        boolean nine = false;
        boolean ten = false;


        if((one ) || (three && four && five)){
            System.out.println("Inside IF");
        }else{
            System.out.println("Inside Else");
        }

        if(one || three && four && five){
            System.out.println("Inside Second IF");
        }else{
            System.out.println("Inside Second Else");
        }

    }
}
