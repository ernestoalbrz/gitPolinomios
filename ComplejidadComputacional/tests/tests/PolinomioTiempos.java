package tests;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

import polinomios.Polinomio;

public class PolinomioTiempos {
	@Test
	public void medirTiempo() {
		double resActual = 0;
		
		for (int i = 50; i < 24000; i+=1500) {
			Polinomio pol1 = new Polinomio("./Preparacion de Prueba/Lote de Prueba/Entrada/pruebaTiempo"+i+"Elementos.in");
			
			System.out.println("Prueba para "+i+" elementos:\n");
			//
			Calendar tIni = new GregorianCalendar();
			resActual = pol1.evaluarHorner(0.8);
			Calendar tFin = new GregorianCalendar();
			System.out.println("T.Ejecucion evaluarHorner: " + (tFin.getTimeInMillis() - tIni.getTimeInMillis()));
			//
			tIni = new GregorianCalendar();
			resActual = pol1.evaluarRecursiva(0.8);
			tFin = new GregorianCalendar();
			System.out.println("T.Ejecucion evaluarRecursiva: " + (tFin.getTimeInMillis() - tIni.getTimeInMillis()));
			//
			tIni = new GregorianCalendar();
			resActual = pol1.evaluarRecursivaPar(0.8);
			tFin = new GregorianCalendar();
			System.out.println("T.Ejecucion evaluarRecursivaPar: " + (tFin.getTimeInMillis() - tIni.getTimeInMillis()));
			//
			tIni = new GregorianCalendar();
			resActual = pol1.evaluarProgDinamica(0.8);
			tFin = new GregorianCalendar();
			System.out.println("T.Ejecucion evaluarProgDinamica: " + (tFin.getTimeInMillis() - tIni.getTimeInMillis()));
			//
			tIni = new GregorianCalendar();
			resActual = pol1.evaluarMSucesivas(0.8);
			tFin = new GregorianCalendar();
			System.out.println("T.Ejecucion evaluarMSucesivas: " + (tFin.getTimeInMillis() - tIni.getTimeInMillis()));
			//
			tIni = new GregorianCalendar();
			resActual = pol1.evaluarMejorada(0.8);
			tFin = new GregorianCalendar();
			System.out.println("T.Ejecucion evaluarMejorada: " + (tFin.getTimeInMillis() - tIni.getTimeInMillis()));
			//
			tIni = new GregorianCalendar();
			resActual = pol1.evaluarPow(0.8);
			tFin = new GregorianCalendar();
			System.out.println("T.Ejecucion evaluarPow: " + (tFin.getTimeInMillis() - tIni.getTimeInMillis()) + "\n\n");
		}
		System.out.println(resActual);
	}
}
