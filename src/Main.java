import java.util.Scanner;
import java.util.Random;


class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random aleatorio = new Random();

    String maiuscula = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String minuscula = "abcdefghijklmnopqrstuvwxyz";
    String caracteres = "~!@#$%^&*_-+=|(){}[]<>?";
    String numeros = "0123456789";
    String juncao = maiuscula + minuscula + caracteres + numeros;
    String escolha;

    System.out.println("\n\n                 GERADOR DE SENHAS             \n");

    while(true) {
      System.out.print("\nDigite o comprimento que deseja sua senha (Entre 8 até 26 caracteres): ");
      int comprimento = scanner.nextInt();

      if(comprimento < 8 || comprimento > 26) {
        System.out.println("\nComprimento inválido! Por favor, escolha um comprimento válido.");
        continue;
      }

      String senha = "";
      for (int i = 0; i < comprimento; i++) {
        senha += juncao.charAt(aleatorio.nextInt(juncao.length()));
      }

      System.out.println("\nSenha Gerada: " + senha);

      System.out.print("\nDeseja gerar outra senha? [S/N]: ");
      escolha = scanner.next();

      if (!escolha.equals("S") && !escolha.equals("s")) {
        break;
      }
    }

    System.out.println("\nGerador de senhas finalizado!\n");
    scanner.close();
  }
}