package com.baskin.model;

import javax.persistence.Entity;

@Entity
public class Candy extends Icecream {

	public Candy(String flavour, int price, String image, String desc) {
		super(flavour, price, image, desc);
	}
}
