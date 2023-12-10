import java.util.Arrays;

public class Questao1 {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4};
        int[] arrayB = {5, 6, 7, 8};

        int[] arrayD = {1, 3, 5, 7};
        int[] arrayE = {2, 4, 6, 8};

        System.out.println(Arrays.toString(concatenateArray(arrayA, arrayB)));
        System.out.println(Arrays.toString(concatenateArray(arrayD, arrayE)));
    }

    public static int[] concatenateArray(int[] arrayA, int[] arrayB){
        int lengthArray = arrayA.length;
        int[] arrayC = new int [lengthArray * 2];

        for (int i =  0; i < lengthArray; i++){
            arrayC[i * 2] = arrayA[i];
            arrayC[i * 2 + 1] = arrayB[i];
        }
        return arrayC;
    }
}
