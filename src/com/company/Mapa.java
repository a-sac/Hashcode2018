package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapa{

	int rows;
	int columns;
	int vehicles;
	int rides;
	int bonus;
	int steps;
	HashMap<Point,Trip> viagens;
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

	public Trip bestTrip(Vehicle v){
		double dist;
		Point p = v.p;
		Map.Entry<Point,Trip> entry = viagens.entrySet().iterator().next();
		Point key = entry.getKey();
		Trip t = viagens.get(key);
		dist = key.distance(p);
		for(Trip t2: viagens.values()){
			Point p3 = t2.initial;
			double dist2 = p3.distance(p);
			if(dist2 < dist){
				dist = dist2;
				t = t2;
			}
		}
		return t;
	}

	public void makeTrip(Trip t, Vehicle v){
		v.p = t.end;
		for(Trip t2: viagens.values()){
			if(t2.equals() ) viagens.remove(t2.initial);
		}
	}

	public void solver(){
		Trip t;
		for(int i =0; i<rides; i++){
			t = bestTrip(taxi.get(i % vehicles));
			makeTrip(t, taxi.get(i % vehicles));
		}
	}

}