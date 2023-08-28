import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int a=0;
		Perro[] perrosVet = new Perro[2];
		perrosVet[0]=new Perro("Fido","Chihuahua", "marron");
		perrosVet[1]=new Perro("Pelusa","Pequines", "blanco");
		Diagnostico Diagnostico1=new Diagnostico();
		Scanner sc=new Scanner(System.in);
		for(Perro perro1 : perrosVet) {
			a=a+1;
			System.out.println("Prueba " + a + ":");
			System.out.println("Ingrese la temperatura de " + perro1.nombre);
			double nTemp = sc.nextDouble();
			perro1.setTemp(nTemp);
			System.out.println("Ingrese el peso de " + perro1.nombre);
			double nPeso = sc.nextDouble();
			perro1.peso=nPeso;
			System.out.println("Ingrese la edad de " + perro1.nombre);
			int nEdad = sc.nextInt();
			perro1.setEdad(nEdad);
			System.out.println(Diagnostico1.aptoVacunaA(perro1));
		}
	}
}