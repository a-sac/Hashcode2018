package com.company;

import java.awt.*;

public class Trip{

	Point initial;
	Point end;
	int earlStart;
	int latFinish;
	int id;

	public Trip(Point i, Point e, int earlier, int end, int id){
		this.initial = i;
		this.end = e;
		this.earlStart = earlier;
		this.latFinish = end;
		this.id = id;
	}
}