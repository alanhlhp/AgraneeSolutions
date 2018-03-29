import java.util.*;

class Castles{
	public static void main(String[] args){
		int[] map = new int[]{2,6,6,6,3};

		Castles c = new Castles();

		System.out.println(c.countCastles(map));
	}

	public int countCastles(int[] a){
		HashSet<Integer> peaks = new HashSet<>();
		HashSet<Integer> valleys = new HashSet<>();
		int ref = 0;

		for(int i=1; i<a.length-1; i++){
			
			if( (a[i] >= a[i-1]) && (a[i] >= a[i+1]) && a[i]>=ref ){
				peaks.add(a[i]);
				ref = a[i-1];
			} else if ( (a[i] <= a[i-1]) && (a[i] <= a[i+1]) ){
				valleys.add(a[i]);
				ref = a[i-1];
			}

		}

		return peaks.size()+valleys.size();
	}
} 