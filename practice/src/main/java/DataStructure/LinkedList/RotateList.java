package DataStructure.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class RotateList {

    public static void main(String[] args) {
        RotateList rotate = new RotateList();
        List<String> linkedList = new LinkedList<>();
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");
        linkedList.add("Four");
        linkedList.add("Five");
        linkedList.add("Six");
        linkedList.add("Seven");

        linkedList.stream().forEach(x-> System.out.print(x+"-->"));
        System.out.print("null");
        System.out.println();
        System.out.println("Calling RotateList method");
        rotate.rotateList(linkedList,0);


    }

    private  void rotateList( List<String> linkedList, int index){

        if(index == linkedList.size()-1){
            System.out.print(linkedList.get(index)+"-->");
            return ;
        }
        int temp = index;
        rotateList(linkedList,++index);
        System.out.print(linkedList.get(temp)+"-->");

    }
}
