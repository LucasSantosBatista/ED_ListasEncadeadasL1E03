/**
 * 
 */
package view;

import model.Lista;

/**
 * @author Lucas Batista 28 de abr. de 2024
 */
public class Main {
	public static void main(String[] args) {

		Lista<Integer> lista = new Lista<>();

		try {
			lista.addFirst(3);
			lista.addLast(5);
			lista.addLast(18);
			lista.addLast(12);
			lista.addLast(9);
			lista.addLast(7);
			lista.addLast(6);
			lista.addLast(2);
			lista.addLast(13);
			lista.addLast(4);
			lista.addLast(16);

			System.out.println("Lista original:");
			for (int i = 0; i < lista.size(); i++) {
				System.out.print(lista.get(i) + " ");
			}
			System.out.println();

			Lista<Integer> listaInvertida = new Lista<>();

			while (!lista.isEmpty()) {
				int elemento = lista.get(0);
				lista.removeFirst();
				listaInvertida.addFirst(elemento);

			}

			System.out.println("Lista invertida:");
			for (int i = 0; i < listaInvertida.size(); i++) {
				System.out.print(listaInvertida.get(i) + " ");
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
