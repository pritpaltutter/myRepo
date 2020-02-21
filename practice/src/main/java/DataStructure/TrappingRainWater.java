package DataStructure;

public class TrappingRainWater {

    public static void main(String[] args) {
        int[] buildings = {5,0,0,0,7,0,0,10};
        System.out.println(calculateVolume(buildings));

    }


     public static int calculateVolume(int[] buildings){
        int leftBuilding = 0;
        int rightBuilding = 0;
        int blockVolume = 0;


        for(int i=0;i<buildings.length;i++){
            rightBuilding = i;
            if(buildings[leftBuilding]<buildings[i] || (i == buildings.length -1)){
                if(leftBuilding != rightBuilding -1) {
                    blockVolume = blockVolume + computeVolume(buildings, leftBuilding, rightBuilding);
                    leftBuilding =i;
                }


            }
        }
        return blockVolume;
    }

    private static int computeVolume(int[] buildings, int leftBuilding, int rightBuilding) {
        int leftBuildingHeight = buildings[leftBuilding];
        int rightBuildingHeight = buildings[rightBuilding];
       int capacity =  Math.min(leftBuildingHeight,rightBuildingHeight);
       int volume = 0;
       for(int i= leftBuilding+1; i< rightBuilding;i++){
           volume  = volume + (capacity - buildings[i]);
       }
       return volume;
    }
}
