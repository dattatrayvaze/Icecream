package com.baskin.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;

@Entity
public class Sunday extends Icecream {

	@OneToMany
	@JoinColumns(value =@JoinColumn (name="scoopId"))
	private List<Scoop> scoops;
	
	@OneToMany
	@JoinColumns(value =@JoinColumn (name="candyId"))
	private List<Candy> candies;
	
	@OneToMany
	@JoinColumns(value =@JoinColumn (name="toppingId"))
	private List<Topping> toppings;
	
	public List<Scoop> getScoops() {
		return scoops;
	}
	public void setScoops(List<Scoop> scoops) {
		this.scoops = scoops;
	}
	public List<Candy> getCandies() {
		return candies;
	}
	public void setCandies(List<Candy> candies) {
		this.candies = candies;
	}
	public List<Topping> getToppings() {
		return toppings;
	}
	public void setToppings(List<Topping> toppings) {
		this.toppings = toppings;
	}
	
	public void addScoop(Scoop scoop) {
		this.scoops.add(scoop);
	}
	
	public void addCandy(Candy candy) {
		this.candies.add(candy);
	}
	
	public void addTopping(Topping topping) {
		this.toppings.add(topping);
	}
	
	public void deleteScoop(Scoop scoop) {
		this.scoops.remove(scoop);
	}
	
	public void deleteCandy(Candy candy) {
		this.candies.remove(candy);
	}
	
	public void deleteTopping(Topping topping) {
		this.toppings.remove(topping);
	}
	
}
