package juego;
import java.awt.Color;
import java.awt.Image;

import entorno.Entorno;
import entorno.Herramientas;

public class Mapa {
	
	public static int length;
	private int x;
	private int y;
	private int ancho;
	private int alto;
	private Image img;
	
	public Mapa(int x, int y, int ancho, int alto) {

		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;	
		this.setImg(Herramientas.cargarImagen("mapa.png"));
	}
	
	public void dibujar(Entorno entorno) {
		entorno.dibujarImagen(img, this.x, this.y, 0,0.25);	
	}
	
	void dibujarse(Entorno entorno) {
		entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, 0, Color.red);
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

}
