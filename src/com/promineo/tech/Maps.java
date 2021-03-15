/**
 * 
 */
package com.promineo.tech;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Dave Rossi
 *
 */
public class Maps {

	/**
	 * @param args
	 */
	//Starting out is fairly straight forward, we'll be creating two different list types in order to populate a third; a HashSet of Integer
	//and an ArrayList of String in order to fulfill a HashMap that requires a key (Hashset Integer) and Value (ArrayList of String); The 
	//difficulty here involves importing the right utilities into the class.  
	public static void main(String[] args) {
	List<String> employeeNames = new ArrayList<String>();
	Set<Integer> ids = new HashSet<Integer>();
	//While I had thought the below option for entry of multiple employeeNames would work, it creates a situation of duplicate variable necessitating long form
	//ArrayList<String> employeeNames = (ArrayList<String>) List.of("Tom Hardy", "Elizabeth Rossi", "Nikki Prudden", "Anja Akstin", "Veronika Zemaya");
employeeNames.add("Tom Hardy");
employeeNames.add("Elizabeth Rossi");
employeeNames.add("Nikki Prudden");
employeeNames.add("Anja Akstin");
employeeNames.add("Veronika Zemaya");
//Set<Integer> ids = List.of(060444, 26856, 060485, 070986, 12345); Again, same problem here
ids.add(060444);
ids.add(26856);
ids.add(6485);
ids.add(7986);
ids.add(12345);
HashMap<Integer, String> employeesMap = new HashMap<Integer, String>();
employeesMap.put(060444, "Tom Hardy");
employeesMap.put(26856, "Eizabeth Rossi");
employeesMap.put(6485, "Nikki Prudden");
employeesMap.put(7986, "Anja Akstin");
employeesMap.put(12345, "Veronika Zemaya");
//next is iteration which I had some trouble with.  I could 'talk' my way through it, but not parse it down.  80% doesn't score a successful
//interview.  I had to ask for help.  The question gave a couple definite pieces such as 

int i=0; 
for (int id : ids) {
	employeesMap.put( i, employeeNames.get(i));i++; //the syntax of this is where I struggled.  i is used to set the array position to 0 for
	}
{
	
}
//iteration purposes to go along the employeesNames to enter each value.  Maps rely on .put (Java docs helps me make sense of this)
//I was unable to match Keys with Values via iteration since , therefore I relied upon directly using .put above to link established IDs as Keys
//associated names.  This is not correct, however I am unable to find a solution that combines the two and allows for enhanced for loop with i=0.  


	for(HashMap.Entry<Integer,String> map : employeesMap.entrySet())
	{
	System.out.println("Key is: " + map.getKey() + " Value is: " + map.getValue());
	//StringBuilder only was partially successful.  StringBuilder indicates that it cannot make a static reference to a non-static type.  
	//looking at the details of StringBuilder Append should allow for insertion of String values in at least the employeeNames if not the Integer
		StringBuilder idsbuilder = new StringBuilder();
		for (Integer Id : ids)
		{
		StringBuilder.append(ids + "-");
		}
		StringBuilder namesBuilder = new StringBuilder();
		for (String employeeName: employeeNames)
		{
		StringBuilder.append(employeeNames + " ");
		}
		System.out.println(idsbuilder.toString());
		System.out.println(namesBuilder.toString());
		}


		}
}
