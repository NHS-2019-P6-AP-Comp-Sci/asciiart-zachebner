/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 


public class ASCIIArt {
	public static void fullstripe() {
		System.out.println("|########################################################################################");
	}
	public static void fullblank() {
		System.out.print("|\n");
	}
	public static void starsstripe() {
		System.out.println("|  * * * * * * * * * *   ################################################################");
	}
	public static void nostarsstripe() {
		System.out.println("|\t\t\t ################################################################");
	}
	public static void starsnostripe() {
		System.out.println("|   * * * * * * * * * *  \t\t\t\t\t\t\t\t");
	}
	public static void starsection() {
		nostarsstripe();
		starsstripe();
		fullblank();
		starsnostripe();
	}
	public static void main (String [] args) {
		System.out.println("O");
		System.out.println("|________________________________________________________________________________________");
		starsection();
		starsection();
		nostarsstripe();
		starsstripe();
		fullblank();
		fullblank();
		fullstripe();
		fullstripe();
		fullblank();
		fullblank();
		fullstripe();
		fullstripe();
		fullblank();
		fullblank();
		fullstripe();
		fullstripe();
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		
	}
	
}