package controller;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import model.Paciente;

public class Arquivo {
	public Arquivo() {
		
	}
	
	public void cadastrarPaciente(Paciente paciente) {
		
		try {
			OutputStream os = new FileOutputStream("cadastro_de_pacientes.txt", true);
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write(paciente.getNome());
			bw.newLine();
			
			bw.close();
			osw.close();
			os.close();
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao cadastrar o paciente");
		} catch (IOException e) {
			System.out.println("Erro ao escrever o paciente no arquivo");
		}
	}
	
	public void apresentarPacientesCadastrados() {
		try {
			InputStream is = new FileInputStream("cadastro_de_pacientes.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String linha;
			try {
				linha = br.readLine();
				
				while (linha != null) {
					System.out.println(linha);
					linha = br.readLine();
				}
				
				br.close();
				isr.close();
				is.close();
			} catch (IOException e) {
				System.out.println("Erro ao ler os dados dentro do arquivo!");
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao ler o arquivo! Arquivo não encontrado!");
		}
		
	}
}
