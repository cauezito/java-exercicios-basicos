package pastas;

import java.io.File;
import java.util.Scanner;

public class Manipulando {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o caminho para uma pasta: ");
		String cam = sc.nextLine();
		
		File caminho = new File(cam);
		//lista somente as pastas
		File[] pastas = caminho.listFiles(File::isDirectory);
		System.out.println("PASTAS: ");
		for(File pasta : pastas) {
			System.out.println(pasta);
		}
		
		//lista somente os arquivos
		File[] arquivos = caminho.listFiles(File::isFile);
		System.out.println("Arquivos: ");
		for(File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		
		//cria uma subpasta
		boolean sucesso = new File(cam + "\\diretorioCriado").mkdir();
		System.out.println("Diretório criado? " + sucesso);
		
		
		sc.close();

	}

}
