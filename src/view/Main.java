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
		System.out.println(emerson.getNome());
		System.out.println(emerson.getSalario());
		System.out.println(emerson.getCpf());

		//add funcionaria carla
		Funcionario carla = new Funcionario("Carla Silva",1500.01,"109.274.25-16");
		ti.adicionaFuncionario(carla);
		System.out.println(carla.getNome());
		System.out.println(carla.getSalario());
		System.out.println(carla.getCpf());

		
		//add funcionario josue
		Funcionario josue = new Funcionario("Josue Kothe",1500.01,"255.659.210-89");
		ti.adicionaFuncionario(josue);
		System.out.println(josue.getNome());
		System.out.println(josue.getSalario());
		System.out.println(josue.getCpf());

		
		//add funcionario joao
		Funcionario joao = new Funcionario("João Paulo Carvalho",1500.01,"149.162.25-45");
		ti.adicionaFuncionario(joao);
		System.out.println(joao.getNome());
		System.out.println(joao.getSalario());
		System.out.println(joao.getCpf());
		//mostra lista de funcionarios
		
		
		
		
		
		
		
	}
	}
