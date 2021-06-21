public class Activity2 {

    public static void main(String[] args) {
        int[][] multiarray = new int[10][5];

        for(int i=0; i< multiarray.length; i++){
            for(int j=0; j<multiarray[i].length; j++){
                multiarray[i][j] = i;
            }
        }

        for(int i=0; i< multiarray.length; i++){
            for(int j=0; j<multiarray[i].length; j++){
                System.out.print(multiarray[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
