package desafio;

public class JogoCraps {
    int ponto = 0;

    public boolean verificaJogada(int resultadoDados, int rodada){
        if(rodada == 1){
            if(resultadoDados == 7 || resultadoDados == 11){
                System.out.println("Você é Natural e ganhou!");
                return false;
            }
            else if(resultadoDados == 2 || resultadoDados == 3 || resultadoDados == 12){
                System.out.println("Deu 'Craps' e você perdeu!");
                return false;
            }else{
                this.ponto = resultadoDados;
            }
        }
        if(rodada > 1){
            if(resultadoDados == 7){
                System.out.println("Você perdeu!");
                return false;
            }else if(resultadoDados == ponto){
                System.out.println("Você ganhou!");
                return false;
            }
        }
        return true;
    }

}
