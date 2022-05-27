package UsandoPilha;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
public class UsandoPilha {

	public static void main(String[] args) {	
		/*/ Faça um programa em java que receba um número inteiro // OK
		 * e verifique se é par ou impar. Caso o número seja par, // OK
		 * o programa deve inserir na PilhaPar e se for impar, o programa deve inserir na PilhaImpar //OK
	    Outras operações:
		Verifique se a pilhaPar e PilhaImpar estão vazias //OK
		Verifique o tamanho da PilhaPar e PilhaImpar     // OK
		Imprima os numeros da PilhaPar e da PilhaImpar  // OK
		Observação o programa deve parar até o usuário digitar -1 ou 0;.//OK
		/*/
		
		//Vamos empilhar os numero Impares
		Stack<Integer> pilhaPar = new Stack<Integer>(); //Stack é uma pilha para armazenar
		Stack<Integer> pilhaImpar = new Stack<Integer>();

		Scanner scanner = new Scanner(System.in); // Entrada de dados
		boolean exit = true;
		while(exit == true) { // Estrutura de condição

			System.out.println("Digite um número ou 0 para sair"); // 
			int num = scanner.nextInt();        //Recebe o dado colocado
			if(num == 0) { // Validando o Lop, para sair
				exit = false;
			} else {

				if(num % 2 == 0) { // Se o núemro for par
					System.out.println("Esse número é Par");
					pilhaPar.push(num); // Inserção/Inserindo elemento
				} else { // Senao
					System.out.println("Esse número é Impar");
					pilhaImpar.push(num); // Inserção/Inserindo elemento
				}
			}
		}
		//Vamos verificar se a pilhaPar esta vazia
		System.out.println("Verificando se a pilha esta vazia: " + pilhaPar.empty()); //Verificar se está vazia
		if( pilhaPar.empty()) { //
			System.out.println("A pilha Par esta vazia!!!");
		} else {
			System.out.println("A pilha Par tem dados!!!");
		}

		//Vamos verificar se a pilhaPar esta vazia
		System.out.println("Verificando se a pilha esta vazia: " + pilhaImpar.empty()); //Verificar se está vazia
		if( pilhaImpar.empty()) { //
			System.out.println("A pilha esta vazia!!!");
		} else {
			System.out.println("A pilha tem dados!!!");
		}
		//Verifique o tamanho da PilhaPar
		System.out.println("O tamanho da PilhaPar são:"+ pilhaPar.size());
		 for (int i = 0; i < pilhaPar.size(); i++) {
				System.out.println(pilhaPar.get(i));
			}
		//Verifique o tamanho daPilhaImpar 

		System.out.println("O tamanho da PilhaImpar são:"+ pilhaImpar.size());
		 for (int i = 0; i < pilhaImpar.size(); i++) {
				System.out.println(pilhaImpar.get(i));
			}
	}
}



