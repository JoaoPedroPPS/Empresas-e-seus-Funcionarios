package view;
import modelo.Empresa;
import modelo.Funcionario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empresa ti = new Empresa("Tecnologia","15644984651");
		//add funcionario emerson
		Funcionario emerson = new Funcionario("Emerson Assis",1500.01,"199.205.15-05");
		ti.adicionaFuncionario(emerson);
		
		//add funcionaria carla
		Funcionario carla = new Funcionario("Carla Silva",1500.01,"109.274.25-16");
		ti.adicionaFuncionario(carla);
		
		//add funcionario josue
		Funcionario josue = new Funcionario("Josue Kothe",1500.01,"255.659.210-89");
		ti.adicionaFuncionario(josue);
		
		//add funcionario joao
		Funcionario joao = new Funcionario("João Paulo Carvalho",1500.01,"149.162.25-45");
		ti.adicionaFuncionario(joao);
		
		//mostra lista de funcionarios
		ti.getFuncionarios().forEach(System.out::println);
	}
	}
