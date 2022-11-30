package Main;

import java.util.ArrayList;

import java.util.List;

public class Banco implements Database {
	// List listTopic = new List(null, 0);
	static ArrayList<Topic> listTopic = new ArrayList<>();
	static ArrayList<User> listUser = new ArrayList<>();
	static ArrayList<Viagem> listViagem = new ArrayList<>();
	static ArrayList<Motorista> listMotorista = new ArrayList<>();

	@Override
	public List addTopic(Topic t) {
		listTopic.add(new Topic("abc0987", "Sprim", 1914));
		listTopic.add(new Topic("cbv4535", "D20", 1915));
		return null;
	}

	@Override
	public List addUser(User u) {
		listUser.add(u);
		return null;
	}

	@Override
	public List addViagem(Viagem v) {
		listViagem.add(v);
		return null;
	}

	@Override
	public List addMotorista(Motorista m) {
		listMotorista.add(m);
		return null;
	}

	public static ArrayList<Topic> getListTopic() {
		return listTopic;
	}

	public static void setListTopic(ArrayList<Topic> listTopic) {
		Banco.listTopic = listTopic;
	}

	public static ArrayList<User> getListUser() {
		return listUser;
	}

	public static void setListUser(ArrayList<User> listUser) {
		Banco.listUser = listUser;
	}

	public static ArrayList<Viagem> getListViagem() {
		return listViagem;
	}

	public static void setListViagem(ArrayList<Viagem> listViagem) {
		Banco.listViagem = listViagem;
	}

	public static ArrayList<Motorista> getListMotorista() {
		return listMotorista;
	}

	public static void setListMotorista(ArrayList<Motorista> listMotorista) {
		Banco.listMotorista = listMotorista;
	}

}
