public class Diagnostico {
	public Diagnostico() {
	}
	public String aptoVacunaA(Perro perro1) {
		if (perro1.getTemp()>=37 || perro1.getTemp()>=40 && perro1.peso>=1 || perro1.peso<=5 && perro1.getEdad()<=1) {
			return "El perro esta SANO, esta apto para la vacuna";
		}
		else {
			return "El perro esta INSANO, NO esta apto para la vacuna";
		}
	}
	public String aptoVacunaB(double temp, double peso, int edad){
		if(temp<=37 || temp>=40 && peso>=1 || peso<=5 && edad<=1) {
			return "El perro esta SANO, esta apto para la vacuna";
		}
		else {
			return "El pero esta INSANO, NO esta apto para la vacuna";
		}
	}
}