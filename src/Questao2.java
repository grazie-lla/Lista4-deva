public class Questao2 {
    public static void main(String[] args) {
        double[][] studentsClass = {
                {9, 8, 7, 8},
                {10, 9, 8, 9},
                {9, 8, 7, 8}
        };

        double[] gradesAverage = averageStudents(studentsClass);

        for (int i = 0; i < gradesAverage.length; i++) {
            System.out.printf("Aluno %d - média: %.2f%n", i, gradesAverage[i]);
        }

        averageClass(gradesAverage);

    }

    public static double[] averageStudents(double[][] studentsClass){
        int numberOfStudents = studentsClass.length;
        int numberOfGrades = studentsClass[0].length;

        double[] gradesAverage = new double[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++){
            double sumGrades = 0;

            for (int j = 0; j < numberOfGrades; j++){
                sumGrades += studentsClass[i][j];
            }

            gradesAverage[i] = sumGrades / numberOfGrades;
        }
        return gradesAverage;
    }
    public static void averageClass(double[] gradesAverage){
        int numberOfAverages = gradesAverage.length;

        double sumAvarages = 0;

        for (int i = 0; i < numberOfAverages; i++){
            sumAvarages += gradesAverage[i];
        }
        double averageClass = sumAvarages / numberOfAverages;

        System.out.printf("Média da turma: %.2f",averageClass);

    }
}
