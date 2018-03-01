package com.company;

import java.awt.*;
import java.util.HashMap;
import java.util.HashSet;

public class Mapa{

	int rows;
	int columns;
	int vehicles;
	int rides;
	int bonus;
	int steps;
	HashMap<Point,Trip>  viagens;
	ArrayList<Vehicle> taxi;

	public Mapa(int r, int c, int v, int ri, int b, int s){
		this.rows = r;
		this.columns = c;
		this.vehicles = v;
		this.rides = ri;
		this.bonus = b;
		this.steps = s;
	}

	

}