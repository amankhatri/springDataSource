package threadP;

public class Diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Jai 10:15 11:20";
		String s1arr[] = s1.split(" ");

		String hrmin1[] = s1arr[1].split(":");
		
		int hr1 = Integer.parseInt(hrmin1[0]);
		int min1 = Integer.parseInt(hrmin1[1]);
		
		String hrmin2[] = s1arr[2].split(":");
		
		int hr2 = Integer.parseInt(hrmin2[0]);
		int min2 = Integer.parseInt(hrmin2[1]);

		int diff_in_mins = (hr2 - hr1)*60 + (min2-min1);
		System.out.println(diff_in_mins);

	}

}
