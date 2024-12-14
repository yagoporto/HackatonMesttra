import java.util.Scanner;
import com.funcoes.*;

public class Main {
    public static void main(String[] args) {
        int escolha;
        boolean erro = true;
        Scanner sc = new Scanner(System.in);
        


        do{
            JogoDaVelhaMenu.nome();
            JogoDaVelhaMenu.menu();
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    JogoVelha.jogo();
                    Processar.limparTela();
                    break;
                case 2:
                    Intruções.comoJogar();
                    Processar.limparTela();
                    break;
                case 3:
                    erro = false;
                    break;    
                default:
                    erro = true;
                    System.out.println("ERRO: DIGITE UMA OPÇÃO VALIDA");
                    Processar.limparTela();
                    break;
            }
        }while(erro == true);
        sc.close();
    }
}
