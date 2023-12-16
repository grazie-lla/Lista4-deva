import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o nome do primeiro candidato:");
        String candidateA = input.nextLine().toLowerCase();

        System.out.println("Insira o nome do segundo candidato:");
        String candidateB = input.nextLine().toLowerCase();

        System.out.println("Insira o nome do terceiro candidato:");
        String candidateC = input.nextLine().toLowerCase();


        conductVote(candidateA, candidateB, candidateC);
    }

    public static void conductVote(String candidateA, String candidateB, String candidateC){
        Scanner input = new Scanner(System.in);

        Map<String, Integer> votes = new HashMap<>();
        votes.put(candidateA, 0);
        votes.put(candidateB, 0);
        votes.put(candidateC, 0);

        for (int i = 0; i < 10; i++){
            System.out.println("Insira o seu voto:");
            String vote = input.nextLine().toLowerCase();

            if (votes.containsKey(vote)){
                votes.put(vote, votes.get(vote) + 1);
                System.out.println("Voto contabilizado!");
            } else {
                System.out.println("Voto nulo!");
            }
        }
        showResult(votes);
    }

    public static void showResult(Map<String, Integer> votes){
        System.out.println("Apuração das eleições:");

        int maxVotes = 0;
        String electedCandidate = "";

        for (Map.Entry<String, Integer> entry : votes.entrySet()){
            String candidate = entry.getKey();
            int receivedVotes = entry.getValue();
            double votePercentage = (receivedVotes / 10.0) * 100;

            System.out.printf("%s: %d votos (%.2f%%)%n", candidate, receivedVotes, votePercentage);

            if (receivedVotes > maxVotes){
                maxVotes = receivedVotes;
                electedCandidate = candidate.toUpperCase();
            }
        }

        System.out.printf("%nCandidato eleito: %s%n", electedCandidate);
    }
}
