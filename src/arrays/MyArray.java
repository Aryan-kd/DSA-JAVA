package arrays;

public class MyArray {
	
	private int[] items;
	private int currentIndex;
	
	public MyArray(int initialSize) {
		this.items = new int[initialSize];
		this.currentIndex = 0;
	}
	
	public void insert(int value) {
		if(this.currentIndex == this.items.length) {
			int[] temp = new int[2 * this.currentIndex];
			for(int i=0;i<this.currentIndex;i++) {
				temp[i] = this.items[i];
			}
			this.items = temp;
		}
		this.items[currentIndex] = value;
		currentIndex++;
	}
	
	public int find(int value) {
		for(int i=0;i<this.currentIndex;i++) {
			if(this.items[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	public void remove(int index) {
		for(int i=index;i<this.currentIndex - 1;i++) {
			this.items[i] = this.items[i+1];
		}
		this.currentIndex--;
		this.items[currentIndex] = 0;
	}
	
	public int maxElement() {
		int result = this.items[0];
		for(int i=1;i<this.currentIndex;i++) {
			if(this.items[i] > result) {
				result = this.items[i];
			}
		}
		
		return result;
	}
	
	public int minElement() {
		int result = this.items[0];
		for(int i=1;i<this.currentIndex;i++) {
			if(this.items[i] < result) {
				result = this.items[i];
			}
		}
		
		return result;
	}
	
	public void reverse() {
		int i=0, j = this.currentIndex -1;
		while(i<j) {
			this.items[i] = this.items[i]^this.items[j];
			this.items[j] = this.items[i]^this.items[j];
			this.items[i] = this.items[i]^this.items[j];
			i++;
			j--;
		}
		return;
	}
	
	// Overriding Function
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("[");
		for(int i=0;i<this.currentIndex;i++) {
			str.append(this.items[i]).append(" ");
		}
		str.append("]");
		
		return str.toString();
	}

}
