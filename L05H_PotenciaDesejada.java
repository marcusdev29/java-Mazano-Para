package manzanoPara;

import java.util.Scanner;

public class L05H_PotenciaDesejada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor que deseje ser a base: ");
		byte base = sc.nextByte();
		System.out.println("Informe o valor que deseje ser o expoente: ");
		byte expoente = sc.nextByte();
		int potencia = 1;
		System.out.println(base+" ^ 0 = 1");
		for (byte contadora = 1; contadora <= expoente; contadora++) {
			potencia = potencia * base;
			System.out.println(base+" ^ "+contadora+" = "+potencia);
		}
		sc.close();
	}

}
