import controller.Arquivo;
import model.Endereco;
import model.Paciente;

public class App {

	public static void main(String[] args) {
		Paciente olival = new Paciente();
		olival.setNome("Olival Paulino");
		olival.setNumeroCartaoSus("700123456789987");
		olival.setCpf("00011122233");
		olival.setDataDeNascimento("27/05/1993");
		olival.setIdade(29);
		olival.setSexo('m');
		olival.setTelefone1("82 99999-8888");
		olival.setTelefone2("82 99999-7777");
		olival.setEhWhatsApp(true);
		
		Endereco endereco = new Endereco();
		endereco.setEstado("Alagoas");
		endereco.setCidade("Palmeira dos Índios");
		endereco.setBairro("Juca Sampaio");
		endereco.setRua("Radialista Antônio Martins Filho");
		endereco.setNumeroCasa(71);
		endereco.setCep("57603130");
		endereco.setNumeroCasa(71);
		endereco.setDescricao("Próximo a Escola do Back ao Front-end");
		
		olival.setEndereco(endereco);
		
		olival.apresentarPaciente();
		
		Arquivo arquivo = new Arquivo();
		arquivo.cadastrarPaciente(olival);
		
		arquivo.apresentarPacientesCadastrados();
	}
}
