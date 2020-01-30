package leitura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		String caminho = "C:\\Users\\Cau�\\Documents\\Outros\\teste.txt";
		//N�o � necess�rio o finally, pois o try-with-resources fecha sozinho.
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			String linha = br.readLine(); // l� uma linha, se estiver no final retorna nulo.

			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} 
	}
}
