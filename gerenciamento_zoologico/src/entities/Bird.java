package entities;

public class Bird extends Animal{
	
	public Bird() {
		super();
	}
	
	public Bird(long id, String name, int age, double weight) {
		super(id, name, age, weight);
		abilities.add("fly");
	}
	
	@Override
	public String sound() {
		return "piu";
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
