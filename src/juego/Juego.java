package juego;
import java.awt.Color;
import java.util.Random;
import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego {

	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;

	
	// variables
	private Mikasa mikasa;
	private Mapa manzanas;
	private boolean derecha;
	private boolean izquierda;
	private boolean arriba;
	private boolean abajo;
	private boolean permite;


	private Object[] mapa;

	
	public Juego() {
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Attack on Titan, Final Season", 800, 600);
		this.setAbajo(false);
		this.setArriba(false);
		this.setDerecha(false);
		this.setIzquierda(false);
		this.permite = true;
		
		// Inicializar lo que haga falta para el juego
		

		//POSICION Y VELOCIDAD DE MIKASA
		int velocidad=3;
		this.mikasa= new Mikasa(this.entorno.ancho()/2,310,velocidad);
		

		// Inicia el juego!
		this.entorno.iniciar();
	}

	/**
	 * Durante el juego, el método tick() será ejecutado en cada instante y 
	 * por lo tanto es el método más importante de esta clase. Aquí se debe 
	 * actualizar el estado interno del juego para simular el paso del tiempo 
	 * (ver el enunciado del TP para mayor detalle).
	 */
	public void tick() {
		// Procesamiento de un instante de tiempo
		this.mikasa.dibujar(entorno);
		entorno.dibujarRectangulo(400 , 300, 800, 600, 0, Color.GRAY);
		dibujarManzanas();
	
	
	//MOVIMIENTO DE Mikasa
		if (this.entorno.estaPresionada(this.entorno.TECLA_DERECHA) && this.mikasa.posicionX()+this.mikasa.ancho()/2<this.entorno.ancho()){
		this.mikasa.moverDerecha();
		if(this.permite==true) {
			this.setAbajo(false);
			this.setArriba(false);
			this.setDerecha(true);
			this.setIzquierda(false);
		}
	}
	if (this.entorno.estaPresionada(this.entorno.TECLA_IZQUIERDA) && this.mikasa.posicionX()-this.mikasa.ancho()/2>0){
		this.mikasa.moverIzquierda();
		if(this.permite==true) {
			this.setAbajo(false);
			this.setArriba(false);
			this.setDerecha(false);
			this.setIzquierda(true);	
		}
	}

	if (this.entorno.estaPresionada(this.entorno.TECLA_ARRIBA) && this.mikasa.posicionY()-this.mikasa.alto()/2>0){
		this.mikasa.moverArriba();
		if(this.permite==true) {
			this.setAbajo(false);
			this.setArriba(true);
			this.setDerecha(false);
			this.setIzquierda(false);	
		}
	}
	if (this.entorno.estaPresionada(this.entorno.TECLA_ABAJO)&& this.mikasa.posicionY()+this.mikasa.alto()/2<this.entorno.alto()){
		this.mikasa.moverAbajo();
		if(this.permite==true) {
			this.setAbajo(true);
			this.setArriba(false);
			this.setDerecha(false);
			this.setIzquierda(false);
			}	
	}
	}
	
	
	
	private void setIzquierda(boolean b) {
		// TODO Auto-generated method stub
		
	}

	private void setDerecha(boolean b) {
		// TODO Auto-generated method stub
		
	}

	private void setArriba(boolean b) {
		// TODO Auto-generated method stub
		
	}

	private void setAbajo(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Juego juego = new Juego();
	}
	
	public void dibujarManzanas() { 
		for (int i=0; i < mapa.length; i++)
			this.mapa.length;	
	}

}

