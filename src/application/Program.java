package application;

import java.text.ParseException;

import javax.swing.JOptionPane;

import model.entities.Relogio;

public class Program {

	public static void 	main(String[] args) throws ParseException {

		String relogioFinal = null;

		// INSTANCIA UNICA
		relogioFinal = Relogio.getDataEHora();

		// TENTATIVA DE REPETIR E NÃO REPETE
		relogioFinal = Relogio.getDataEHora();
		relogioFinal = Relogio.getDataEHora();
		relogioFinal = Relogio.getDataEHora();
		relogioFinal = Relogio.getDataEHora();

		JOptionPane.showMessageDialog(null, relogioFinal);
		System.out.println(relogioFinal);

	}

}
