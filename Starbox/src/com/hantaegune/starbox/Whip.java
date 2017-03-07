package com.hantaegune.starbox;

public class Whip extends CondimentDecorator{
	Beverage beverage;
	
	public Whip(Beverage beverage){
		this.beverage = beverage;
	}
	
	public String getDescription(){
		return beverage.getDescription() + ",휘핑 크림";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .10 + beverage.cost();	}


}
