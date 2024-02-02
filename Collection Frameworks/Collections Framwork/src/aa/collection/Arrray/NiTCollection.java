package aa.collection.Arrray;

import java.util.Arrays;

public class NiTCollection {
      
	private Object[]  elementData;
	private int elementCount;
	
	NiTCollection () {
		elementData = new Object[10];
	}
	
	public void add(Object obj) {
		if(capacity()==size()) {
			grow();
		}
		elementData[elementCount] = obj;
		elementCount++;
	}
	
	private void grow() {
		Object[] nextArray = new Object[capacity()*2];
		
		for(int i=0; i <elementData.length; i++) {
			nextArray[i] = elementData[i];
		}
		elementData = nextArray;
	}
	
	public boolean contains(Object obj ) {
		     Object o = elementCount;
		    if(o == null) {
		    	return false;
		    }
		    else {
		    	for(int i=0; i<size(); i++) {
		    		if(obj.equals(elementData[i]))
		    		return true;
		    	}
		    	return false;
		    }
	}

	 @Override
	public boolean equals(Object obj) {
		System.out.println("this: "+this+"obj: "+obj);
		if (obj instanceof NiTCollection e) {
			return this.elementData.equals(e.elementData)&&
					this.elementCount==e.elementCount;
		}
		return false;
	}
	public int capacity() {
		return elementData.length;
	}

	public int size() {
		return elementCount;
	}
	
	public String toString() {
		return Arrays.toString(elementData);
	}	
}
