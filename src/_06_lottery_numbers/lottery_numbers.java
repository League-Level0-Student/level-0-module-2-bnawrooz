package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery_numbers {
public static void main(String[] args) {
	

	
	Random randomMaker = new Random();
	int be = randomMaker.nextInt(5);
	int eh = randomMaker.nextInt(5);
	int hz = randomMaker.nextInt(5);
	int za = randomMaker.nextInt(5);
	int ad = randomMaker.nextInt(5);
	String be2 = "" + be + eh + hz + za + ad;
	JOptionPane.showMessageDialog(null, be2);
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
}
