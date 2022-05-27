import desafio.Jogador;
import desafio.JogoCraps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JogoCraps jogoCraps = new JogoCraps();
        Jogador jogador = new Jogador();
        Scanner scan = new Scanner(System.in);

        int rodada = 1;
        boolean resultadoRodada = true;

        do{
            System.out.println("Deseja jogar os dados? Se 'Sim', digite 1. Se 'Não', digite 2.)");
            int escolhaJogador = scan.nextInt();

            if(escolhaJogador == 1){
                int resultadoDados = jogador.jogada();
                System.out.println(resultadoDados);
                resultadoRodada = jogoCraps.verificaJogada(resultadoDados, rodada);
                rodada++;
            }
            else if(escolhaJogador == 2){
                resultadoRodada = false;
            }
            else{
                System.out.println("Escolha um dos números válidos!");
            }
        } while(resultadoRodada);
    }
}
