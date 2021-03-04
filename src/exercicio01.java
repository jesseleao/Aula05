import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int v1, i, tabuada;
		
		System.out.println("Insira um numero de 0 a 10 para calcular a tabuada");
		v1 = leitor.nextInt();
		
		for (i = 0; i <= 10; i++) {
			tabuada = v1 * i;
			System.out.println(v1 +" * "+ i + " = " +tabuada);
		}
		
		leitor.close();
	}

}
