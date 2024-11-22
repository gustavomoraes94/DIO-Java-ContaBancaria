/**
 * <h1>Projeto do Bootcamp de Java pela DIO</h1>
 * 
 * <p>Criação de um projeto simples, que permite a entrada e saída de dados através do terminal usando a classe Scanner.</P>
 * 
 * <p>O projeto também conta com a atenção aos tipos de dados que o Input receberá e a maneira correta que ele irá imprimir na tela do terminal.</p>
 * 
 * @author: Gustavo Moraes
 * @version:1.0
 */

import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
    //Criação de um Scanner:
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    

    //Criação das variáveis que vão receber os dados do scanner;

    long numero;
    String agencia;
    String nome_cliente;
    double saldo;

    //Captura dos dados através do terminal usando System.out para imprimir o que está sendo requisitado e Scanner para receber os dados.

    System.out.println("Por favor, digite o número da Agência !");
    
    agencia = scanner.next();
    
    System.out.println("Por favor, digite o número da conta !");

    numero = scanner.nextInt();

    System.out.println("Por favor digite o seu nome !");

    nome_cliente = scanner.next();

    System.out.println("Por favor, digite o seu saldo !");

    saldo = scanner.nextFloat();

    //Contatenação dos dados recebidos via terminal

    System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");
    }

    //fim da execução
}
