package com.baskin.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table (name = "familypack")
@PrimaryKeyJoinColumn (name = "id")
public class FamilyPack extends Icecream {

	@OneToMany
	@JoinColumns(value =@JoinColumn (name="flavourid"))
	private List<Flavour> flavours;
	
	@Column(name="size")
	private int size;
	
	public List<Flavour> getFlavours() {
		return flavours;
	}
	public void setFlavours(List<Flavour> flavours) {
		this.flavours = flavours;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public FamilyPack () {}
	
	public FamilyPack(String flavour, int price, String image, String desc, List<Flavour> flavours, int size) {
		super(flavour, price, image, desc);
		this.setFlavours(flavours);
		this.setSize(size);
	}
	
}
