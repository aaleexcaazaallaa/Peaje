package es.iesjandula.peajes.launcher;
import es.iesjandula.peajes.classes.Ticket;
import es.iesjandula.peajes.classes.TicketGeneral;
import es.iesjandula.peajes.classes.TicketEspecial;

import java.util.Scanner;

public class Launcher 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int vehicle;
		double kmDistance;
		double kmPrice;
		
		System.out.println("Introduce 1 si el vehiculo es normal, 2 si es un autobus");
		vehicle = sc.nextInt();
		
		System.out.println("Introduce los km recorridos");
		kmDistance = sc.nextInt();
		
		System.out.println("Introduce el precio por km");
		kmPrice = sc.nextInt();
		
		if(vehicle == 1) 
		{
			
		}
		else if(vehicle == 2)
		{
			
		}
		else
		{
			System.out.println("Error al introducir el tipo de vehiculo.");
		}
		
		
		

	}

}
