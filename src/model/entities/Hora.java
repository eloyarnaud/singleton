package model.entities;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Hora {

	public static String horas;

	public Hora() {

	}

	public String getHora() {

		Calendar calendar = new GregorianCalendar();

		int hora = calendar.get(Calendar.HOUR_OF_DAY);
		int minuto = calendar.get(Calendar.MINUTE);
		int segundos = calendar.get(Calendar.SECOND);

		if (hora > 24) {

			System.out.println("Error: Um dia não tem mais de 24 horas");

		} else if (minuto > 60) {

			System.out.println("Error: Minutos não pode ser superior a 60");

			/*
			 * int sobra = minuto - 60;
			 * 
			 * minuto = sobra;
			 * 
			 * hora = hora + 1;
			 */

		} else if (segundos > 60) {
			System.out.println("Error: Segundos não podem ser superior a 60");
			/*
			 * int sobra = segundos - 60;
			 * 
			 * segundos = sobra; minuto = minuto + 1;
			 */

		} else {

			horas = hora + ":" + minuto + ":" + segundos;

		}

		return horas;

	}

}
