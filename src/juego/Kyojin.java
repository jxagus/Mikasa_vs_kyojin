package juego;

import java.awt.Image;

import entorno.Entorno;
import entorno.Herramientas;

public class Kyojin {
	private double x;
	private double y;
	private int ancho;
	private int alto;
	private double velocidad;
	private Image img;
	
	
	Kyojin(double x, double y, double velocidad) {
		this.x = x;
		this.y = y;
		this.velocidad = velocidad;
		this.img = Herramientas.cargarImagen("ball.png");
	}
	
	
	public void dibujar(Entorno entorno) {
		entorno.dibujarImagen(img, x, y, 0,0.06);
	}
	
}
