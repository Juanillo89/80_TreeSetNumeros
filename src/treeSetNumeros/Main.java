package treeSetNumeros;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> tSNumeros = new TreeSet<Integer>();
		System.out.println("Introduce números:");
		for(String numero: sc.nextLine().split(" "))
		{
			try
			{
				if(!tSNumeros.add(Integer.parseInt(numero)))
					System.out.println("El número " + numero +" está repetido.");
			}
			catch(NumberFormatException e)
			{
				
			}
		}
		sc.close();
		System.out.println("Los números ordenados ascendentemente y sin repetidos son:");
		Iterator<Integer> iterator = tSNumeros.iterator();
		while(iterator.hasNext())
		{
			System.out.print(iterator.next() + " ");
		}
		
	}

}
