
public class Job {
	private int servedTimeNeeded;
	private int id;
	static private int first = 1;
	private int r = 0;
	private int diff = 0;
	
	public Job (int servedTimeNeeded) {
		this.servedTimeNeeded = servedTimeNeeded;
		id = first++;
	}
	
	public int served(int servedTime) {
		r++;
		diff = servedTimeNeeded - r * servedTime;
		return diff;
	}
	
	public String toString() {
		if (r == 0 && diff == 0) {
			return id + ":(" + (servedTimeNeeded) + "," + 0 + ")";
		}
		int time = servedTimeNeeded - diff;
		return id + ":(" + (servedTimeNeeded) + "," + (time) + ")";
	}
}
