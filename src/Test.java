public class Test {

	public int intersection(int K, int L, int M, int N, int P, int Q, int R, int S) {
		int x1=Math.max(K,P);
		int x2=Math.min(R,M);
		int x=x2-x1;

		int y1=Math.max(L,Q);
		int y2=Math.min(N,S);
		int y=y2-y1;

		long area;
		if ((x>=0) && (y>=0)) {
		    area=x*y;
		    if (area>Integer.MAX_VALUE) {
		        area=-1;
		    }
		} else {
		    area=0;
		}
		return (int) area;
	}
}