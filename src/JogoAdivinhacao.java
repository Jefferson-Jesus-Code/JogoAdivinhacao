import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    static void main(String[] args) {
        //Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir
        // para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar
        // se o número digitado pelo usuário é maior ou menor do que o número gerado.

        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(101);
        int tentativas = 0;
        int numeroDigitado = 0;
        boolean acertou = false;

        System.out.println("Você tem 5 tentativas para acertar o número que eu estou pensando, ele está entre 0 e 100");

        while (tentativas < 5) {
            numeroDigitado = leitura.nextInt();
            tentativas ++;

            if (numeroDigitado == numeroGerado) {
                acertou = true;
                if (tentativas == 5) {
                    System.out.println("Parabéns, você acertou na última tentativa, meu número era: " + numeroGerado);
                } else {
                    System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas, meu número era: " + numeroGerado);
                }
                break;

            } else if (numeroDigitado > numeroGerado) {
                if (tentativas < 5) {
                    System.out.println("Esse não é meu número, tente um valor menor ⬇, você tem mais " + (5 - tentativas) + " tentativas");
                }
            } else {
                if (tentativas < 5) {
                    System.out.println("Esse não era meu número, tente um valor maior ⬆, você tem mais " + (5 - tentativas) + " tentativas");
                }
            }
        }

        if (!acertou) {
            System.out.println("Essa era sua ultima tentativa, meu numero era: " + numeroGerado);
        }
    }
}
