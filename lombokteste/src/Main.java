
public class Main {

	public static void main(String[] args) {

		ClienteModel clienteModel = new ClienteModel();
		clienteModel.setId(1L);
		clienteModel.setNome("Diego");

		System.out.println(clienteModel);

		ClienteModel clienteModel2 = new ClienteModel();
		clienteModel2.setId(1L);
		clienteModel2.setNome("Carlos Eduardo");

		System.out.println("Comparando objetos com ids iguais: ");
		System.out.println(clienteModel.equals(clienteModel2));

		ClienteModel clienteModel3 = new ClienteModel();
		clienteModel3.setId(3L);
		clienteModel3.setNome("José Maria");

		System.out.println("Comparando objetos com ids diferentes");
		System.out.println(clienteModel.equals(clienteModel3));

		CarroModel carroModel = new CarroModel("Amarelo");
		System.out.println(carroModel);

	}

}
