package main;

import java.awt.AWTException;

import modelo.Acoes;
import utils.Utils;

public class Main {

	public static void main(String[] args) throws AWTException {
		Utils.wait(1000);
		Acoes acoes = new Acoes();
		acoes.iniciarPrograma();
	}

}
