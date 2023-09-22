//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

import java.util.Locale;
import java.util.Scanner;

public class exercise_19 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, inResult, outResult;
		
		inResult = 0;
		outResult = 0;
		n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				inResult++;
			} else {
				outResult++;
			}
		}
		System.out.println(inResult + " in");
		System.out.println(outResult + " out");
		sc.close();
	}

}
