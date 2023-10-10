package entities;

public class Dog extends Animal{
	
	public Dog() {
		super();
	}
	
	public Dog(long id, String name, int age, double weight) {
		super(id, name, age, weight);
		abilities.add("sniff");
	}
	
	@Override
	public String sound() {
		return "au";
	}
	
	@Override
	public String performAbility(String ability) {
		if(abilities.contains(ability)) {
			return name + "can" + ability;
		} else {
			return name + "can´t" + ability;
		}
	}

}
