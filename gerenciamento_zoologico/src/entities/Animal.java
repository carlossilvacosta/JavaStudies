package entities;

import java.util.ArrayList;

public class Animal {
	
	protected long id;
	protected String name;
	protected int age;
	protected double weight;
	protected ArrayList<String> abilities;
	
	public Animal() {
	}

	public Animal(long id, String name, int age, double weight) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.abilities = new ArrayList<>();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public ArrayList<String> getAbilities() {
		return abilities;
	}
	
	public String sound() {
		return "sound";
	}
	
	public String performAbility(String ability) {
		if(abilities.contains(ability)) {
			return name + "can" + ability;
		} else {
			return name + "can´t" + ability;
		}
	}

}
