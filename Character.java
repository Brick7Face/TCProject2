
public class Character {
	String eye, hair, race, gender;
	double height;
	int age;

	public Character() {			//makes character with random generated traits
		age = age();
		height = height();
		eye = trait("eye");
		hair = trait("hair");
		race = trait("race");
		gender = trait("gender");
	}

	public int age() {		//random number between 5 and 95 for age
		int a = (int) (5 + (Math.random() * 91));
		//System.out.println(a);
		return a;
	}
	public double height() {		//random height between 3.5 and 7.5 feet
		double h = (3.5 + (Math.random() * 4));	//min + (int)(Math.random() * ((Max - min) + 1))
		//System.out.format("%.2f\n", h);
		return h;
	}
	public String trait(String thing) {
		switch (thing) {
		case "eye": break;
		case "hair": break;
		case "race": break;
		case "gender": break;
		default: break;
		}
		return "null";
	}
}
