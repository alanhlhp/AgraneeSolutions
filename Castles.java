import java.util.*;

class Castles{
	public static void main(String[] args){
		Integer[] map = new Integer[]{2,6,6,6,3};

		Castles c = new Castles();

		System.out.println(c.countCastles(map));
	}

	public Integer countCastles(Integer[] a){
		ArrayList<ArrayList<Integer>> peaks = new ArrayList<>();
		ArrayList<ArrayList<Integer>> valleys = new ArrayList<>();
		ArrayList<Integer> sub = new ArrayList<>();
		Boolean same = false;

		for(Integer i=1; i<a.length-1; i++){
			//Handle same height points
			if(same){ 
				sub.add(a[i]);
				if(a[i]!=a[i+1]){
					same = false;
					if(a[i]>a[i+1]){
						peaks.add(sub);
					} else{
						valleys.add(sub);
					}
				}
			} 
			//Identify Peak or Valley
			else{
				sub = new ArrayList<>();

				if( (a[i] >= a[i-1]) && (a[i] >= a[i+1]) ){
					sub.add(a[i]);
					if(a[i]==a[i+1]){
						same = true;
					} else{
						peaks.add(sub);
					}

				} else if ( (a[i] <= a[i-1]) && (a[i] <= a[i+1]) ){
					sub.add(a[i]);
					if(a[i]==a[i+1]){
						same = true;
					} else{
						valleys.add(sub);
					}
				}
			}
		}

		//System.out.println("Peaks: " + peaks);
		//System.out.println("Valleys" + valleys);

		return peaks.size()+valleys.size();
	}
} 
