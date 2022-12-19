package com.practice;


class demo1{
	private String name;
	private String type;
	private int cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	 
}


public class Demo {
	public static void main(String[] args) {
		demo1 d=new demo1();
		d.setName(null);
		d.setType(null);
		d.setCost(0);
		
//		d.name = "Blacky" ;
//		d.type="dog";
//		d.cost = 199;
//		System.out.println(d.name +" "+d.type+" " +d.cost);
		System.out.println(d.getName()+""+d.getType()+""+d.getCost());
		
	}
}
