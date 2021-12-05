package it.unibo.oop.lab05.ex2;

import java.util.Comparator;

public class StringComparator implements Comparator<String>{
	
	public int compare(String num1, String num2) {
		return Integer.compare(Integer.parseInt(num1), Integer.parseInt(num2));
	}
	
	
//	public Set<String> orderedAdd(Set<String> tree, String num){
//		Collection<String> tmp = new ArrayList<String>();
//		for(String s : tree) {
//			if(compare(s, num) == 1) {
//				tmp.add(s);
//			}
//		}
//		tree.removeAll(tmp);
//		tree.add(num);
//		tree.addAll(tmp);
//		return tree;
//	}
}
