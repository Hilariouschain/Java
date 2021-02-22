public class Main {


        public static void main(String[] args) {
            String[][] array = new String[4][4];
            array[0][0] = "1";

            for (int i = 0; i < array.length ; i++) {
                for (int j = 0; j <array[i].length ; j++) {
                    array[i][j] = String.valueOf((i + j));
                    System.out.println(array[i][j]);
                }
                System.out.println();
            }

            try {
                try {
                    int sum = Arr.getArray(array);
                } catch (MyArraySizeException e) {
                    e.printStackTrace();
                }
            } catch (MyArrayDataException e) {
                System.out.println(e.getMessage());
            }
        }


    }













