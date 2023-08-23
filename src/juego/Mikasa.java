package juego;

import java.awt.Image;

import entorno.Entorno;
import entorno.Herramientas;

public class Mikasa {

	private int x;
	private int y;
	private int ancho;
	private int alto;
	private int velocidad;
	private Image mikasa;
	private Image img;
	

	Mikasa(int x, int y, int velocidad){
		this.x=x;
		this.y=y;
		this.alto=50; 
		this.ancho=25;
		this.velocidad=velocidad;
		this.setImg(Herramientas.cargarImagen("Mikasa.png"));


	}

	public void moverDerecha() {
		this.x=this.x+this.velocidad;
	}

	public void moverIzquierda() {
		this.x=this.x-this.velocidad;
		
	}

	public void moverArriba() {
		this.y=this.y-this.velocidad;
		
	}

	public void moverAbajo() {
		this.y=this.y+this.velocidad;
		
	}

	public void dibujar(Entorno entorno) {
		entorno.dibujarImagen(this.mikasa, this.x, this.y, 0,0.15);
	}
	
	public int posicionX()
	{
		return this.x;
	}
	
	public int posicionY()
	{
		return this.y;
	}
	
	public int ancho()
	{
		return this.ancho;
	}
	
	public int alto()
	{
		return this.alto;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}
	
	
	
	
	
	
	
	
	
	
}
