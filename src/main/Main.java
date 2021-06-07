package main;
import bbdd.Conexion;
import vista.Ventana;

public class Main {

	public static void main(String[] args) {
		Conexion.Conectar();
		new Ventana();
	}

}
