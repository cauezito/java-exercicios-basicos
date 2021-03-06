package leitura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Manual {

	public static void main(String[] args) {
		String caminho = "C:\\Users\\Cau�\\Documents\\Outros\\teste.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(caminho);
			// esquema de buffer, possibilita uma leitura mais r�pida e flex�vel
			br = new BufferedReader(fr);
			String linha = br.readLine(); // l� uma linha, se estiver no final retorna nulo.

			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
