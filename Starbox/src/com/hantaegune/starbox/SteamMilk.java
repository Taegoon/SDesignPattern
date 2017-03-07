package com.hantaegune.starbox;

public class SteamMilk extends CondimentDecorator{
	Beverage beverage;
	
	public SteamMilk(Beverage beverage){
		this.beverage = beverage;
	}
	
	public String getDescription(){
		return beverage.getDescription() + ",스팀 밀크";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .10 + beverage.cost();	}

}
