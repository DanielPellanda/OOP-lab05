package it.unibo.oop.lab05.ex1;

import java.util.*;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    	
    	final Set<String> tree = new TreeSet<>();
    	
    	for(int i = 1; i <= 20; i++) {
    		tree.add(Integer.toString(i));
    	}
    	System.out.println(tree);
    	System.out.print("\n");
    	
    	
    	Collection<String> c = new ArrayList<>();
    	for(final String s : tree) {
    		if(Integer.parseInt(s) % 3 == 0) {
    			c.add(s);
    		}
    	}
    	tree.removeAll(c);
    	System.out.print("\n");
    	
    	for(final String s : tree) {
    		System.out.println(s);
    	}
    	
    	System.out.print("\n");
    	boolean even = true;
    	for(final String s : tree) {
    		if(Integer.parseInt(s) % 2 != 0) {
    			System.out.println(false);
    			even = false;
    			break;
    		}
    	}
    	if(even) {
    		System.out.println(true);
    	}
    	
    }
}
