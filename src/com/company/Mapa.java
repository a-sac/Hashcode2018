package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;



public class Mapa{
        
        Point aux;
	int rows;
	int columns;
	int vehicles;
	int rides;
	int bonus;
	int steps;
	HashMap<Point,ArrayList<Trip>> viagens;
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
		Map.Entry<Point,ArrayList<Trip>> entry = viagens.entrySet().iterator().next();
		Point key = entry.getKey();
		Trip t = viagens.get(key).get(0);
		dist = key.distance(p);
		for(Point t2: viagens.keySet()){
			//Point p3 = t2.initial;
			double dist2 = t2.distance(p);
			if(dist2 < dist){
				dist = dist2;
                                t = viagens.get(dist).get(0);
                                aux = t2;
			}
		}
		return t;
	}

	public void makeTrip(Trip t, Vehicle v){
		v.p = t.end;
                ArrayList x = viagens.get(aux);
		x.remove(t);
	}

	public void solver(){
		Trip t;
		for(int i =0; i<rides; i++){
			t = bestTrip(taxi.get(i % vehicles));
			makeTrip(t, taxi.get(i % vehicles));
		}
	}

}