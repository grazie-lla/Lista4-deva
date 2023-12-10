public class Questao3 {
    public static void main(String[] args) {
        int[] numbersA = {1, 2, 3, 4};
        int [] numbersB = {1,1,1,1,1};

        cumulativeSum(numbersA);
        cumulativeSum(numbersB);
    }

    public static void cumulativeSum(int[] numbers){
        int[] resultSum = new int[numbers.length];
        resultSum[0] = numbers[0];

        System.out.printf("[%d", resultSum[0]);
        for (int i = 1; i < numbers.length; i++){
            resultSum[i] = resultSum[i - 1] + numbers[i];
            System.out.print(", " + resultSum[i]);
        }

        System.out.print("]\n");
    }
}
