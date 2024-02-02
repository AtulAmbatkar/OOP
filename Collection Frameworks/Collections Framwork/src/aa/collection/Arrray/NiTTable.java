package aa.collection.Arrray;

import java.util.Arrays;

public class NiTTable {
    
	private Object[] keys;
	private Object[] values;
	private int      elementCount;
	
	NiTTable(){
		keys   = new Object[5];
		values = new Object[5];
	}
	
	public void put(Object keys , Object values) {
		
		if(capacity()==size()){
			grow();
		}
		this.keys[elementCount] = keys;
		this.values[elementCount] = values;
		elementCount++;
	}
	
	private void grow() {
		
		Object[] keysArray = new Object[capacity()*2];
		Object[] valuesArray1 = new Object[capacity()*2];
		
		for(int i=0; i<keys.length; i++) {
			keysArray[i] = keys[i];
			valuesArray1[i] = values[i];
		}
		keys = keysArray;
		values = valuesArray1;	
	}
	public int capacity() {
		return keys.length;
	}
	public int size() {
		return elementCount;
	}
	public String toString() {
		return Arrays.toString(keys)+"\n"+Arrays.toString(values);
	}
	
}
