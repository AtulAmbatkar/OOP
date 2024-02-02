package aa.collection.sun.collection;

import java.util.Comparator;

public class Sa { //implements  Comparable<Sa>, Comparator<Sa> {
	
	private int x;
	private int y;
	
	public Sa() {
		
	}
	
	public Sa(int x ,int y) {
		this.x=x;
		this.y=y;
	}	
		public void setX(int x) {
			this.x=x;
		}
		
		public int getX() {
	        return x;
		}
		
		public void setY(int y) {
			this.y=y;
		}
		
		public int getY() {
			return y;
		}
		public boolean equals(Object obj) {
			
			System.out.println("this: "+this + " "+"obj: "+obj);
			
			if(obj instanceof Sa s) {
				return this.x==s.x && this.y==s.y;	
			}
			return false;
		}
		
		@Override
		public String toString() {
			return " "+x +","+y;
		}
		
		
//		@Override
//		public int compareTo(Sa o) {
//			Sa s = (Sa)o;
////			return this.x-s.x;
//			int ed = this.x - s.x;
//			if(ed ==0) {
//				return this.x-this.x;
//			}else if(ed<0) {
//				return -5;
//			}
//			return 5;
//		}
//		
//       @Override
//       public int compare(Sa o1, Sa o2) {  
//    	   
//    		int ed = o2.x - o1.x;
//			if(ed ==0) {
//				return this.x-this.x;
//			}else if(ed<0) {
//				return -5;
//			}
//			return 5;
//		}
//    	  return o2.compareTo(o1);
//  }
}
