public class Questao5 {
    public static void main(String[] args) {
        int[] numbersA = {2, 3, 9, 6, 5, 5, 7, 8};
        int [] numbersB = {9, 7, 6};
        int [] numbersC = {1, 2, 1, 2}; //erro: casos que não há elemento no meio do array?
        int[] numbersD = {1, 2, 3, 1, 2};

        System.out.println(pivorIndex(numbersA));
        System.out.println(pivorIndex(numbersB));
        System.out.println(pivorIndex(numbersC));
        System.out.println(pivorIndex(numbersD));
    }

    public static int pivorIndex(int[] numbers){
        if(numbers == null || numbers.length == 0){
            return -1;
        }

        int totalSum = 0;
        for (int number : numbers){
            totalSum +=number;
        }

        int leftSum = 0;
        for (int i = 0; i < numbers.length; i++){
            if (leftSum == totalSum - leftSum - numbers[i]){
                return i;
            }
            leftSum +=numbers[i];
        }

        return -1;
    }
}
