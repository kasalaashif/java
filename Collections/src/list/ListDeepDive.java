package list;

import java.util.LinkedList;
import java.util.List;

public class ListDeepDive {

	public static void main(String[] args) {
		//Crud Create operations
		// .add(Element e)
		// .add(index, Element)
		// .addAll(Collection)
		// .addAll(index, Collection)
		List<Character> list = new LinkedList<>();
		list.add('a');
		list.add('s');
		list.add('h');
		list.add('i');
		list.add('f');
		
		list.add(0, 'a');
		list.addAll(list);
		list.addAll(2, list);
		System.out.println(list);
		String str = list.toString();
		System.out.println(str);
		
		// cRud Read Operations
		// .get(index)
		// .contains(Element)
		// .indexOf(Element)
		
		System.out.println(list.get(0));
		System.out.println(list.contains('a'));
		System.out.println(list.indexOf('a'));
		System.out.println(list.lastIndexOf('f'));
		
		// crUd update Operation
		// .set(index, Element e)
		list.set(0, 'k');
		System.out.println(list);
		
		// cruD delete operation
		// .remove(index)
		// .remove(Element e)
		// .clear()
		// .removeAll(Collection)
		list.remove(0);
		System.out.println(list);
		list.remove(list.get(0));
		System.out.println(list);
		list.removeAll(list);
		System.out.println(list);
		list.clear();
		System.out.println(list);
		
		// Contains
		// .contains(Element)
		// .isEmpty()
		System.out.println(list.isEmpty());
		System.out.println(list.contains('a'));	

	}

}
