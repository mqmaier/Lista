package br.com.maier;

import java.util.*;

public class LSENaoOrdenada {
	private static class Lista {
		public int num;
		public Lista prox;
	}

	static Scanner entrada;

	public static void main (String[] args) {
		entrada = new Scanner (System.in);
		Lista inicio = null;
		Lista fim = null;
		Lista aux;
		Lista anterior;
		int op, numero = 0, achou;
		do {
			System.out.println("\nMENU DE OPÇÕES");
			System.out.println("1 - INSERIR NO INICIO DA LISTA");
			System.out.println("2 - INSERIR NO FINAL DA LISTA");
			System.out.println("3 - CONSULTAR TODA A LISTA");
			System.out.println("4 - REMOVER DA LISTA");
			System.out.println("5 - ESVAZIAR LISTA");
			System.out.println("6 - TAMANHO DA LISTA");
			System.out.println("7 - SAIR");
			System.out.println("DIGITE A SUA OPÇÃO: ");
			op = entrada.nextInt();
			
			if (op == 1) {
				System.out.println("Digite o numero a ser inserido no inicio da Lista: ");
				Lista novo = new Lista();
				novo.num = entrada.nextInt();
				if (inicio == null) {
					inicio = novo;
					fim = novo;
					novo.prox=null;
				}else {
					novo.prox = inicio;
					inicio = novo;
				}
				System.out.println(novo.num+" Foi inserido na lista");	
				
			}
			if (op == 2) {
				System.out.println("Digite o número a ser inserido no final da lista: ");
				Lista novo = new Lista();
				novo.num = entrada.nextInt();
				if (inicio == null) {
					inicio = null;
					fim = null;
					novo.prox=null;
		}else {
			fim.prox = novo;
			fim = novo;
			fim.prox = null;
			}
				System.out.println(novo.num+" Foi inserido no final da lista");		
		}
			if (op == 3) {
				if (inicio == null) {
					System.out.println("A lista está vazia.");
			}
			else 
			{
				aux = inicio;
				System.out.println("O inicio é: "+inicio.num+" o final da lista é: "+fim.num);
				while (aux != null) {
					System.out.println("O valor impresso é: "+aux.num);
					aux = aux.prox;
				}
			}
		}		
			if (op == 4) {
				if (inicio == null) {
					System.out.println("A lista está vazia não há elementos para remover.");
				}
				else {
					System.out.println("\nInforme o dado a remover: ");
					numero = entrada.nextInt();
					}
				aux = inicio;
				anterior = null;
				achou = 0;
				while (aux != null) {
					if (aux.num == numero) 
					{
						achou ++;
						if(aux == inicio) 
						{
							inicio = aux.prox; 
							aux = inicio;
						}
						else if (aux == fim) 
						{
							anterior.prox = null; 
							fim = anterior; 
							aux = null;
						}
						else 
						{
							anterior.prox = aux.prox; 
							aux = aux.prox;
						}
					}
					else {
						anterior = aux;
						aux = aux.prox;
					}
				}
				if (achou == 0) {System.out.println("Dado não encontrado!");}
				else if (achou == 1 ){System.out.println("\nNumero removido uma vez");}
				else {System.out.println("Dado removido"+achou+"vez(es)");}	
			}
			if (op == 5) {
				if(inicio == null)
				{
					System.out.println("A lista está vazia");
				}else {
						inicio=null;
						System.out.println("<<A lista foi esvaziada>>");
						}
					}
			if (op == 6) {
				if(inicio == null)
				{
					System.out.println("A lista está vazia");
				}else {
					aux = inicio;
					int n = 0;
					while(aux != null) {
						aux = aux.prox;
						n++;
					}
					System.out.println("A lista contem: " +n+" elementos.");
				}
			}
		}while (op!=7);
		System.out.println("* * PROGRAMA ENCERRADO * *");
		}
}
