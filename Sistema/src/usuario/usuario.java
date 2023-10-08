package usuario;

import aparelhoTelefonico.discador;
import navegadorInternet.safari;
import reprodutorMusical.ipod;

public class usuario {

	public static void main(String[] args) {
		discador disc = new discador();
		
		System.out.println("Discador Iphone");
		disc.Atender();
		disc.Ligar();
		disc.iniciarCorreiodeVoz();
		
		System.out.println();
		
		
		System.out.println("Acionando Navegador");
		safari saf = new safari();
		
		saf.adicionarPagina();
		saf.atualizarPagina();
		saf.exibirPagina();
		
		System.out.println();
		
		System.out.println("Acionando Ipad");
		ipod ip = new ipod();
		ip.Pausar();
		ip.selecionarMusica();
		ip.Tocar();
		
		
		
		
	
		

	}

}
