import java.util.Scanner;
import java.time.LocalDate;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Ingrese el primer nombre: ");
		String primerNombre=scanner.nextLine();
		
		System.out.print("Ingrese el apelldo: ");
		String apellido=scanner.nextLine();
		
		System.out.print("Ingrese el sexo(M/F)");
		char sexo=scanner.nextLine().charAt(0);
		
		System.out.print("Ingrese el dia de nacimiento: ");
		int diaNacimiento=scanner.nextInt();
		
		System.out.print("Ingrese el mes de nacimiento: ");
		int mesNacimiento=scanner.nextInt();
		
		System.out.print("Ingrese el año de nacimiento: ");
		int anioNacimiento=scanner.nextInt();
		
		System.out.print("Ingrese la altura: ");
		double altura=scanner.nextDouble();
		
		LocalDate fecha = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
		
		System.out.print("Ingrese el peso: ");
		double peso=scanner.nextDouble();
		perfilMedico perfil = new perfilMedico(primerNombre, apellido, sexo,fecha , altura, peso);
		System.out.println("\nInformación del perfil médico:");
		System.out.println("Nombre completo: " + perfil.getPrimerNombre() + " " + perfil.getApellido());
		System.out.println("Sexo: " + perfil.getSexo());
		System.out.println("Fecha de nacimiento: " + perfil.getFechaNacimiento());
		System.out.println("Altura: " + perfil.getAltura() + " cm");
		System.out.println("Peso: " + perfil.getPeso() + " kg");
		
		System.out.println("\nEdad: " + perfil.calcularEdad() + " años");
		System.out.println("Frecuencia cardíaca máxima: " + perfil.calcularFrecuenciaCardiacaMaxima());
		System.out.println("Índice de masa corporal (IMC): " + perfil.calcularIMC());
		
		scanner.close();
	}
}