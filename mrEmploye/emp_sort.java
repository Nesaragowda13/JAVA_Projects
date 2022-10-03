package mrEmploye;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class emp_sort
{

public static void main(String[] args) 
{
	Employe e1  = new Employe(101,"sham",4000);
	Employe e2  = new Employe(103,"sam",3000);
	Employe e3 = new Employe(102, "ram", 7000);
	List <Employe>a1 = new ArrayList<Employe>();
	a1.add(e1);
	a1.add(e2);
	a1.add(e3);
	Collections.sort(a1);
//	
//	for(Employe s:a1);
//	{
//		System.out.println(s);
//	}
	for (Employe employe : a1) {
		System.out.println(employe);
	}
}
}
