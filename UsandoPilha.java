package UsandoPilha;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
public class UsandoPilha {

public static void main(String[] args) {


/*/ Fa�a um programa em java que receba um n�mero inteiro // OK
* e verifique se � par ou impar. Caso o n�mero seja par, // OK

* o programa deve inserir na PilhaPar e se for impar, o programa deve inserir na PilhaImpar //OK

   Outras opera��es:
Verifique se a pilhaPar e PilhaImpar est�o vazias //OK
Verifique o tamanho da PilhaPar e PilhaImpar     //
Imprima os numeros da PilhaPar e da PilhaImpar  //

Observa��o o programa deve parar at� o usu�rio digitar -1 ou 0;.
/*/

//Vamos empilhar os numero Impares

Stack<Integer> pilhaPar = new Stack<Integer>(); //Stack � uma pilha para armazenar
Stack<Integer> pilhaImpar = new Stack<Integer>();

Scanner scanner = new Scanner(System.in); // Entrada de dados

System.out.println("Digite um n�mero"); //
int num = scanner.nextInt();        //Recebe o dado colocado

if(num % 2 == 0) { // Se o n�emro for par
System.out.println("Esse n�mero � Par");

pilhaPar.push(num); // Inser��o/Inserindo elemento

}
else { // Senao
System.out.println("Esse n�mero � Impar");

pilhaImpar.push(num); // Inser��o/Inserindo elemento
}


//Vamos verificar se a pilhaPar esta vazia
System.out.println("Verificando se a pilha esta vazia: " + pilhaPar.empty()); //Verificar se est� vazia

if( pilhaPar.empty()) { //
System.out.println("A pilha Par esta vazia!!!");
           }
else {
System.out.println("A pilha Par tem dados!!!");
}





//Vamos verificar se a pilhaPar esta vazia
System.out.println("Verificando se a pilha esta vazia: " + pilhaImpar.empty()); //Verificar se est� vazia

if( pilhaImpar.empty()) { //
System.out.println("A pilha esta vazia!!!");
           }
else {
System.out.println("A pilha tem dados!!!");

}
}
}


