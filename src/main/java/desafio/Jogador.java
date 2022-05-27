package desafio;

import java.util.Random;

public class Jogador {

    public int jogada(){
        Random random = new Random();

        int dadoUm = random.nextInt(6) + 1;
        int dadoDois = random.nextInt(6) + 1;

        return dadoUm + dadoDois;
    }
}
