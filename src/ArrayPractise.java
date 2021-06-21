public class ArrayPractise {
    public static void main(String[] args) {

        int[]  age = {12, 4, 5, 2};
//        System.out.println("First Elemet " + age[0]);
//        System.out.println("First Elemet " + age[1]);
//        System.out.println("First Elemet " + age[3]);

//        for (int i=0; i< age.length; i++){
//            System.out.println(age[i]);
//        }

//         for(int i:age){
//             System.out.println(i);
//         }

//         int [][] arrayName = {{1,2,3},{4,5,6,7},{8}};
//
//        for(int i=0; i< arrayName.length; i++){   //arrayName.length == number of rows
//            for(int j=0; j<arrayName[i].length; j++){   //arrayName[i].length == number of columns in each row
//                System.out.print(arrayName[i][j] + " ");
//            }
//            System.out.println();

//
//        int [] source = {1,2,3,4,5,6};
//        int[] destination = new int[6];
//
//        for(int i=0; i< source.length; i++){
//            destination[i] = source[i];
//        }
//
//        for(int i : destination){
//            System.out.println(i);
//        }


        //coping array
        int[] n1 = {12,4,5,6};

        int[] n2 = new int[n1.length];

        System.arraycopy(n1,1,n2,0,n1.length);
        for(int i: n2){
            System.out.println(i);
        }
     }
}

