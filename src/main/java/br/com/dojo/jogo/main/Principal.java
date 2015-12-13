package br.com.dojo.jogo.main;

import br.com.dojo.jogo.log.LogPartida;
import br.com.dojo.jogo.util.DojoUltil;

/**
 * 
 * @author Maycon
 *
 */
public class Principal {
	
	
	public static void main(String [] args){	
		DojoUltil.imprimirDadosPartida(LogPartida.lerLog("logpartida.log"));
	}
	
}
