package modelo;

import java.awt.AWTException;

import utils.Utils;

public class Acoes {
	public final Integer REPETICOES = 300;
	public static final Integer SPEED_MULTIPLIER = 2;

	public void iniciarPrograma() throws AWTException {
		for (int i = 0; i < REPETICOES; i++) {
			System.out.println("######################## ITERAÇÃO " + (i + 1) + " ########################");
			deletarDecoracoes();
			colocarDecoracoes();
			Utils.wait(2000);
			menuQuests();
			Utils.wait(500);
			coletarRecompensa();
			Utils.wait(1100);
			// pularQuests();
			verificaSeQuestEhDecoracoes();
			menuQuests();
		}
	}

	public void coletarRecompensa() {
		System.err.println(new Object() {
		}.getClass().getEnclosingMethod().getName());
		basicKeys.um();
	}

	public void pularQuests() {
		System.err.println(new Object() {
		}.getClass().getEnclosingMethod().getName());
		basicKeys.um();
		Utils.wait(1000);
		basicKeys.quatro();
		for (int i = 0; i < 10; i++) {
			Utils.wait(4000 / (SPEED_MULTIPLIER));
			basicKeys.dois();
			basicKeys.tres();
			System.out.println("pulou " + (i + 1));
		}
		Utils.wait(2000);
	}

	public void menuQuests() {
		System.err.println(new Object() {
		}.getClass().getEnclosingMethod().getName());
		basicKeys.q();
	}

	public void colocarDecoracoes() {
		System.err.println(new Object() {
		}.getClass().getEnclosingMethod().getName());
		basicKeys.umNumerico();
		basicKeys.doisNumerico();
		basicKeys.umNumerico();
		basicKeys.tresNumerico();
		basicKeys.umNumerico();
		basicKeys.quatroNumerico();
		basicKeys.umNumerico();
		basicKeys.cincoNumerico();
		basicKeys.umNumerico();
		basicKeys.seisNumerico();
		basicKeys.umNumerico();
		basicKeys.seteNumerico();
		basicKeys.umNumerico();
		basicKeys.oitoNumerico();
		basicKeys.umNumerico();
		basicKeys.noveNumerico();
	}

	public void deletarDecoracoes() {
		System.err.println(new Object() {
		}.getClass().getEnclosingMethod().getName());
		basicKeys.maisNumerico();
		basicKeys.doisNumerico();
		basicKeys.zeroNumerico();
		basicKeys.tresNumerico();
		basicKeys.zeroNumerico();
		basicKeys.quatroNumerico();
		basicKeys.zeroNumerico();
		basicKeys.cincoNumerico();
		basicKeys.zeroNumerico();
		basicKeys.seisNumerico();
		basicKeys.zeroNumerico();
		basicKeys.seteNumerico();
		basicKeys.zeroNumerico();
		basicKeys.oitoNumerico();
		basicKeys.zeroNumerico();
		basicKeys.noveNumerico();
		basicKeys.zeroNumerico();
	}

	public void verificaSeQuestEhDecoracoes() {
		ImageManager im = new ImageManager();
		boolean questCerta = im.isOnScreen("C:\\Users\\Vitor\\Downloads\\foe\\quest.png");
		int jumps = 0;
		while (!questCerta) {
			Utils.wait(4000 / (SPEED_MULTIPLIER));
			questCerta = im.isOnScreen("C:\\Users\\Vitor\\Downloads\\foe\\quest.png");
			if (!questCerta) {
				basicKeys.dois();
				basicKeys.tres();
				jumps++;
				System.out.println("Pulou " + jumps);
			}
		}
		Utils.wait(2000);
	}

}
