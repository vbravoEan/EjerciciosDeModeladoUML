package em_01;

public class Ej_04 {
	
	private double velocidad;
    private double angulo;
    

	public Ej_04(double velocidad, double angulo) {
		this.velocidad = velocidad;
		this.angulo = angulo;
	}


	public double getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}


	public double getAngulo() {
		return angulo;
	}


	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	}
	
	// Método para calcular la distancia recorrida por el proyectil
    public double calcularDistancia() {
        double g = 9.81; // Aceleración de la gravedad en m/s^2
        double rad = Math.toRadians(this.angulo); // Conversión de grados a radianes
        double tiempoVuelo = (2 * this.velocidad * Math.sin(rad)) / g;
        double distanciaRecorrida = this.velocidad * Math.cos(rad) * tiempoVuelo;
        return distanciaRecorrida;
    }

}
