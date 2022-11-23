package ProjetoJokenPo;

import ProjetoJokenPo.JokenPo;

import java.util.Scanner;

public class Main {
    public  static JokenPo starGame(){
        System.out.println("****** Jo-Ken-Po ********\n");
        Scanner scan = new Scanner(System.in);

        System.out.println("\n Informe seu nome: ");
      String playerName =  scan.next().toUpperCase();

       Player user = new Player(playerName);
       Player IA = new Player("IA");

        System.out.println(playerName + "\n Informe quantos round você quer jogar?  ");
        int rounds = scan.nextInt();

       return new JokenPo(user, IA, rounds);
    }

    public static void main(String[] args) {
        JokenPo jokePo = starGame();
        jokePo.toPlay();
        jokePo.showFinalResult();

    }
}
