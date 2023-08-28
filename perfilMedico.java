import java.time.LocalDate;
import java.time.Period;

public class perfilMedico {
	private String primerNombre;
    private String apellido;
    private char sexo;
    private LocalDate fechaNacimiento;
    private double altura;
    private double peso;
    
    

	public perfilMedico(String primerNombre, String apellido, char sexo, LocalDate fechaNacimiento, double altura, double peso) {
		super();
		this.primerNombre = primerNombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.altura = altura;
		this.peso = peso;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public String getApellido() {
		return apellido;
	}

	public char getSexo() {
		return sexo;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public double getAltura() {
		return altura;
	}

	public double getPeso() {
		return peso;
	}

	public int calcularEdad() {
		LocalDate fechaActual=LocalDate.now();
		Period periodo=Period.between(fechaNacimiento,fechaActual);
		return periodo.getYears();
	}
	
	public int calcularFrecuenciaCardiacaMaxima() {
		return 208 - (int) (0.7 * calcularEdad());
	}
	
	public double calcularIMC() {
		return peso / Math.pow(altura / 100, 2);
	}
}