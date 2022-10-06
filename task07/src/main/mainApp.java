package main;

import java.util.Hashtable;

import javax.swing.JOptionPane;

public class mainApp {
	public static void main(String[] args) {
		NotaMedia notaMedia = new NotaMedia();
		Supermercado superMercado = new Supermercado();
		Articulos articulo = new Articulos();
		tarea4 t = new tarea4();
		boolean flag;
		do {
			int n1 = Integer
					.parseInt(JOptionPane.showInputDialog("Ingrese el número para realizar la función que desee \n"
							+ "(1) ejecutar todos los ej \n" + "(2) notaMedia \n" + "(3) superMercado \n"
							+ "(4) Control Stock \n" + "(5) ultimo ej \n"));
			switch (n1) {
			case 1:
				notaMedia.app();
				superMercado.app();
				articulo.app();
				t.app();
				break;
			case 2:
				notaMedia.app();
				break;
			case 3:
				superMercado.app();
				break;
			case 4:
				articulo.app();
				break;
			case 5:
				t.app();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Error al ingresar una función");
				break;
			}
			int auxFlag = Integer
					.parseInt(JOptionPane.showInputDialog("Ingrese 1 para selecionar otra opcion, 2 para salir"));
			flag = (auxFlag == 1) ? true : false;
		} while (flag);

	}
}
