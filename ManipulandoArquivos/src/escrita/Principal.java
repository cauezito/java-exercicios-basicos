package escrita;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		String[] linhas = new String[] {"Testando", "Testando2", "Testando3", "Testando4"};
		String caminho = "C:\\Users\\Cauê\\Documents\\Outros\\testeEscrita.txt";
		//o parâmetro "true" ao lado do caminho acrescenta o texto ao arquivo, sem substituir.
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))){
			for(String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
