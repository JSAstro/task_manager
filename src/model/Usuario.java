package model;

public class Usuario {
	private String username;
	private String first_name;
	private String middle_name;
	private String surname;
	private int age;
	private boolean active;
	
	public Usuario(String username, String first_name, String middle_name,String surname, int age) {
		this.username = username;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.surname = surname;
		this.age = age;
		this.active = true;
	}
	public void modificarUsuario(String username){
		this.username = username;
	}
	
	public boolean inactivo() {
		this.active=false;
		return active;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	public String getUsername() {
		return username;
	}
	
}

