package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

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
		viagens = new HashMap<>();
		taxi = new ArrayList<>();
	}

	public void addViagem(Point ponto ,Trip viagem ){
		viagens.put(ponto,viagem);
	}

	public void addTaxi(Vehicle v){
		taxi.add(v);
	}

}