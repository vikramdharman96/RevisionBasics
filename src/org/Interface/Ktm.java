package org.Interface;


//multiple inheritance
public class Ktm implements Bike,Car{
	
	private void sample() {
		System.out.println("Sample");
	}
	
	@Override
	public void cost() {
		System.out.println("Ktm Cost: 1,00,000");
	}
	@Override
	public void speed() {
		System.out.println("Ktm Speed: 120kmph ");
	}
	@Override
	public void Alto() {
		System.out.println("Alto Cost:2,00,000");
	}
	@Override
	public void Swift() {
		System.out.println("Swift Cost:6,00,000");		
	}
	public static void main(String[] args) {
		Ktm k=new Ktm();
		k.sample();
		k.cost();
		k.speed();
		
		k.Alto();
		k.Swift();
	}
	
}
