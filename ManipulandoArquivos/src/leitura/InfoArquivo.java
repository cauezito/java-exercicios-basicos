package leitura;

import java.io.File;
import java.util.Scanner;

public class InfoArquivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o caminho do arquivo: ");
		String cam = sc.nextLine();
		
		File caminho = new File(cam);
		System.out.println("Nome: " + caminho.getName());
		System.out.println("Caminho: " + caminho.getParent());
		System.out.println("Nome: " + caminho.getPath());
	}

}
