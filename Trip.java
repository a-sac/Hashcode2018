public class Trip{

	private Point initial;
	private Point end;
	private int earlStart;
	private int latFinish;

	public Trip(Point i, Point e, int earlier, int end){
		this.initial = i;
		this.end = e;
		this.earlStart = earlier;
		this.latFinish = end;
	}

	public Point getInitial(){
		return this.initial;
	}

	public Point getEnd(){
		return this.end;
	}

	public int getEarlier(){
		return this.earlStart;
	}

	public int getFinish(){
		return this.latFinish;
	}

	public void setInit(Point i){
		this.initial = i;
	}

	public void setEnd(Point e){
		this.end = e;
	}

	public void setEarlier(int e){
		this.earlStart = e;
	}

	public void setFin(int f){
		this.latFinish = f;
	}

}