package com.baskin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table( name = "icecream" )
@Inheritance(strategy=InheritanceType.JOINED)
public class Icecream {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "id", nullable=false)
	private int id;
	
	@Column (name = "flavour", unique=true)
	private String flavour;
	
	@Column (name = "price")
	private int price;
	
	@Column (name = "image")
	private String image;
	
	private String description;
	
	private IcecreamType type;
	
	public IcecreamType getType() {
		return type;
	}
	public void setType(IcecreamType type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	
	public int getPrice() {
		return price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return flavour + " - RS." + price + "/-";
	}
	
	public Icecream() {}
	
	public Icecream(String flavour,int price) {
		this.flavour = flavour;
		this.price = price;
	}
	
	public Icecream(String flavour,int price,String image) {
		this.flavour = flavour;
		this.price = price;
		this.image=image;
		this.description = "";
	}
	
	public Icecream(String flavour,int price,String image,String desc) {
		this.flavour = flavour;
		this.price = price;
		this.image=image;
		this.description = desc;
		this.type = IcecreamType.SCOOP;
	}
	public Icecream(String flavour,int price,String image,String desc, IcecreamType type) {
		this.flavour = flavour;
		this.price = price;
		this.image=image;
		this.description = desc;
		this.type = type;
	}
}
