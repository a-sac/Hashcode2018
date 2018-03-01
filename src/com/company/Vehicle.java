package com.company;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Vehicle{

	Point p;
	Set<Integer> list;

	public Vehicle(){
		this.p = new Point(0,0);
		list = new HashSet<>();
	}
}	