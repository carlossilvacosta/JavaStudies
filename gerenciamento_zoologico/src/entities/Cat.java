package entities;

public class Cat extends Animal{
	
	public Cat() {
		super();
	}
	
	public Cat(long id, String name, int age, double weight) {
		super(id, name, age, weight);
		abilities.add("agility");
	}
	
	@Override
	public String sound() {
		return "meow";
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
