import java.util.Locale;

public class exercise_00 {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.0;
		double measure = 53.234567;
		
		System.out.printf("Products:%n%s, which price is $ %.2f %n%s, which price is $ %.2f", product1, price1, product2, price2);
		System.out.println();
		System.out.printf("%nRecord: %d years old, code: %d and gender: %s", age, code, gender);
		System.out.println();
		System.out.printf("%nMeasure with eight decimal places: %.8f", measure);
		System.out.printf("%nRouded (three decimal places): %.3f", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("%nUS deciamal point: %.3f", measure);

	}

}
