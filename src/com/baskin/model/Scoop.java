package com.baskin.model;

import javax.persistence.Entity;

@Entity
public class Scoop extends Icecream{

	public Scoop(String flavour, int price, String image, String desc) {
		super(flavour, price, image, desc);
	}
}
