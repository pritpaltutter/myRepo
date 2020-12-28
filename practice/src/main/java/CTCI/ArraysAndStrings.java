package collection.examples.array;

import java.util.HashMap;

public class ArraysAndStrings {

    public static void main(String[] args) {

        int arr[] = {2,2,3,4,5,6,7,8,9};
        ArraysAndStrings arraysAndStringsObj = new ArraysAndStrings();
        arraysAndStringsObj.printAlternate(arr);
        arraysAndStringsObj.printInReverseOrder(arr);
        arraysAndStringsObj.printMultiples(arr);
        int rot[] = {1,2,3,4,5,6,7,8,9,10};
        arraysAndStringsObj.rotateArray(rot,3);
        System.out.println();
        arraysAndStringsObj.identifyIfStringHasUniqueElements("Bangalore");
        arraysAndStringsObj.identifyIfStringHasUniqueElements("India");
        System.out.println();
        arraysAndStringsObj.checkPermutation("abcdef","cde");
        System.out.println();
        arraysAndStringsObj.checkPermutation("abcdef","zcde");
        char charArr[] = {'M','Y',' ','N','A','M','E',' ','I','S',' ','P','R','I','T','P','A','L',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
        arraysAndStringsObj.replaceSpaceWithWildChar(charArr,18);

        System.out.println();
        Boolean oneEditAway = arraysAndStringsObj.compareString("paleeee","baleeee");
        System.out.println("Result "+oneEditAway);
        System.out.println();
        arraysAndStringsObj.compressString("aaabbbcccdddddd");

        System.out.println();

        int[][] matrix = {{1,2,0},{4,5,6},{7,0,9},{10,11,12}};
        arraysAndStringsObj.rotateMatrixBy90(matrix);
        System.out.println();

        arraysAndStringsObj.setToZero(matrix);
        System.out.println();

        arraysAndStringsObj.isSubString("HappyHoliday","HolidayHappy");
        System.out.println();
        arraysAndStringsObj.isSubString("HappyHoliday","olidayHappyH");
    }

    /**
     * Print alternate elements of an Array
     */
    private void printAlternate(int arr[]){
        System.out.println("Print alternate elements of an Array");
        for(int i=0;i<arr.length;i+=2){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    /**
     * Print Array in reverse Order
     * @param arr
     */
    private void printInReverseOrder(int arr[]){
        System.out.println("Print Array in reverse Order");
        for(int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    /**
     * Find Multiple of first element of an Array
     */
    private  void printMultiples(int arr[]){
        System.out.println("Print multiples of first element");
        int firstElement = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%firstElement == 0){
                System.out.print(arr[i]+",");
            }
        }
        System.out.println();
    }

    /**
     * Rotate the array passed in the parameter by d elements
     *
     * @param arr
     * @param d
     */
    private void rotateArray(int arr[], int d){
        int temp[] = new int[d];
        int k=0;
        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }

        for (int i=0;i<arr.length;i++){
            if((i+d+1)<=arr.length) {
                arr[i] = arr[d + i];
            }else{
                arr[i] = temp[k];
                k++;
            }

        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }


    private void identifyIfStringHasUniqueElements(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    System.out.println("String contain duplicate");
                    return;
                }
            }
        }
        System.out.println("String contain all unique elements");

    }


    private void checkPermutation(String str1, String str2){

        HashMap<Character,Integer> str1Map = new HashMap();
        for(int i=0;i<str1.length();i++){
            if(str1Map.containsKey(str1.charAt(i))) {
                str1Map.put(str1.charAt(i),  str1Map.get(str1.charAt(i))+1);
            }else{
                str1Map.put(str1.charAt(i),  1);
            }

        }
        for(int i=0;i<str2.length();i++){
            if(!str1Map.containsKey(str2.charAt(i))){
                System.out.println(str2+" is not a permutation of "+str1);
                return;
            }
        }
        System.out.println(str2+" is a permutation of "+str1);
    }


    /**
     * Replacing all the spaces in an char array with '%20'
     * @param arr
     * @param len
     */
    private void replaceSpaceWithWildChar(char[] arr,int len){
        System.out.println();
        System.out.println();
        for (int i=0;i<len;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        char []temp = new char[100];
        int j=0;
        for(int i=0;i<len;i++){
            if(arr[i] != ' '){
                temp[j++] = arr[i];
            }else{

                temp[j++] = '%';
                temp[j++] = '2';
                temp[j++] = '0';
            }
        }
        for (int i=0;i<j;i++){
            System.out.print(temp[i]);
        }

        System.out.println();


        System.out.println("Using the same array");
        int spaceCount = 0;
        for(int i=0;i<len;i++){
            if(arr[i]==' '){
                spaceCount++;
            }
        }

        System.out.println("Num of spaces in a Array: "+spaceCount);
        System.out.println("Extra space required:"+spaceCount*3);

        int finalLen = len+(spaceCount*2);
        int tempLen = finalLen-1;
        for(int i = len-1;i>0;i--){
            if(arr[i] != ' ') {
                arr[tempLen--] = arr[i];

            }else{
                arr[tempLen--] = '0';
                arr[tempLen--] = '2';
                arr[tempLen--] = '%';
            }
        }

        System.out.println("Original Array: "+tempLen);
        for (int i=0;i<finalLen;i++){
            System.out.print(arr[i]);
        }
    }


    /**
     * Given two string check if they are one edit away
     * Edit operations can be
     * 1) Insert
     * 2) Delete
     * 3) Update
     */

    private Boolean compareString(String str1, String str2){
        int diff = 0;
        if(str1.length()== str2.length()){
            for(int i=0;i<str1.length();i++){
                if(str1.charAt(i)  != str2.charAt(i)){
                    diff ++;
                }
            }

        }else if(Math.abs(str1.length()-str2.length())==1){
            HashMap tempMap = new HashMap();
            for (int i=0;i<str1.length();i++){
                tempMap.put(str1.charAt(i),1);
            }
            for(int i=0;i<str2.length();i++){
                if(!tempMap.containsKey(str2.charAt(i)) ||
                        (Integer) tempMap.get(str2.charAt(i)) <=0){
                    diff++;
                }else{
                    Integer count = (Integer) tempMap.get(str2.charAt(i));
                    count--;
                    tempMap.put(str2.charAt(i),count);
                }
            }
        }else{
            return Boolean.FALSE;
        }
        if(diff <= 1)
            return Boolean.TRUE;
        return Boolean.FALSE;
    }


    /**
     * Compress a String
     * e.g.
     * Input aaabbbccdddddd
     * Output a3b3c2d6
     * @param str
     */
    private void compressString(String str){
        System.out.println("Original String "+str);
        char ptr1 = str.charAt(0);
        StringBuffer temp = new StringBuffer();
        int index = 0;
        int counter = 0;
        for(int i=0;i<str.length();i++){
            if(ptr1 == str.charAt(i)){
                counter++;
            }else{
                if(counter>=2){
                    temp.append(ptr1);
                    temp.append(counter);
                }else{
                    temp.append(ptr1);
                }
                counter = 1;
                ptr1 = str.charAt(i);
            }
        }
        if(counter>=2){
            temp.append(ptr1);
            temp.append(counter);
        }else{
            temp.append(ptr1);
        }
        System.out.println();

        System.out.println("Compressed String "+temp.toString());
    }


    /**
     * Rotate a matrix by 90 degrees
     * e.g.
     * Input
     *    1 2 3
     *    4 5 6
     *    7 8 9
     *
     * Output
     *    7 4 1
     *    8 5 2
     *    9 6 3
     * @param matrix
     */
    private void rotateMatrixBy90(int[][] matrix){

        for(int i=0;i<3;i++){
            System.out.println();
            for(int j=2;j>=0;j--){
                System.out.print(matrix[j][i]+" ");
            }
        }
        System.out.println();
    }


    /**
     * Set every element of the row and column to zero of element in array which is 0
     * @param arr
     */
    private void setToZero(int [][]arr){
        String coordiante = "";
        System.out.println("array length"+arr.length);
        System.out.println("array length"+arr[0].length);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == 0) {
                    coordiante = coordiante + i + "," + j + ":";
                }
            }
        }
        String coor[] = coordiante.split(":");
        for (int i=0;i<coor.length;i++){

            System.out.println(coor[i]);
            flipToZero(arr,coor[i]);
        }
        System.out.println("Coordinates: "+coordiante);
        System.out.println("Print Array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    private void flipToZero(int [][]arr, String coordinate){
        int x = Integer.parseInt(coordinate.split(",")[0]);
        int y = Integer.parseInt(coordinate.split(",")[1]);
        for(int i=0;i<arr.length;i++){
            arr[i][y] = 0;
        }
        for(int i=0;i<arr[x].length;i++){
            arr[x][i] = 0;
        }

    }

    /**
     * Function to check if s2 is a substring of s1
     * e.g  if s1 is HappyHolidays and s2 is HolidayHappy
     * then it should pring "s2 is a substring of s1"
     *
     * @param s1
     * @param s2
     */
    private void isSubString(String s1,String s2){
        if(s1.length() != s2.length()){
            System.out.println(s2+" is not substring of "+s1);
            return;
        }
        Boolean isFirstWordFound = Boolean.FALSE;
        int k=0,j = 0;
        for (int i=0;i< s2.length();i++){
            if(!isFirstWordFound) {
                if (s1.charAt(k) == s2.charAt(i)) {
                    isFirstWordFound = true;
                }
            }else{
                k++;
                if(s1.charAt(k)!=s2.charAt(i)){
                    isFirstWordFound = Boolean.FALSE;
                    k=0;
                }
            }
        }
        if(isFirstWordFound){
            for(int i=k+1;i<s1.length();i++){
                if(s2.charAt(j) == s1.charAt(i)){
                    j++;
                }else{
                    isFirstWordFound = Boolean.FALSE;
                }
            }
        }
        if( isFirstWordFound ){
            System.out.println(s2+" is a substring of "+s1);
        }else{
            System.out.println(s2+" is not substring of "+s1);
        }
    }


}
