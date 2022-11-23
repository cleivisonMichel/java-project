package ProjetoJokenPo;

import java.util.Random;
import java.util.Scanner;

public record JokenPo(
        Player user,
        Player IA,
        int rounds
) {
    public void toPlay() {
        System.out.println("\n****** Seja Bem- vindo(A), " + user.getNome() + " ******");
        for (int i = 1; i <= rounds; i++) {
            int choiceUser = choiceUser();
            if (choiceUser < 1 || choiceUser > 3) {
                System.out.println(" Jogada invalida! (1 ,2 ou 3) ");
                System.out.println("\n Ponto Para " + IA.getNome() + "\n");
                IA.incrementeScore();
                continue;
            }
            int choiceIA = choiceIA();
            System.out.println("\n" + choiceUser + " x " + choiceIA);
            int result = choiceUser - choiceIA;
            winnerRound(result);
        }
    }

    public void showFinalResult() {
        System.out.println("\n************************\n");
        Integer finalScoreUser = user.getScore();
        Integer finalScoreIA = IA.getScore();

        System.out.println("\n Placar Final: " + user.getNome() + " " + user.getScore() + " X " + IA.getScore() + " " + IA.getNome());
        if (finalScoreIA == finalScoreUser) {
            System.out.println(" Empate! ");
        } else {
            String finalWinner = (finalScoreUser > finalScoreIA) ? user.getNome() : IA.getNome();
            System.out.println("\t Vencedor = " + finalWinner.toUpperCase());
        }
    }

    private void winnerRound(int result) {
        String winnerRound;
        if (result == 0) {
            winnerRound = " Empate!";
        } else {
            if (result == -1 || result == 2) {
                IA().incrementeScore();
                winnerRound = IA.getNome();

            } else {
                user.incrementeScore();
                winnerRound = user.getNome();
            }

        }

    }

    private int choiceIA() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }

    private int choiceUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - PEDRA ");
        System.out.println("2 - PAPEL ");
        System.out.println("3 - TESOURA ");
        System.out.println(" informe sua jogada: ");
        return scan.nextInt();
    }
}

