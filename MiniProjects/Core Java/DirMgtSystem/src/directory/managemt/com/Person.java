
package directory.managemt.com;

public class Person {
	private String last;
	private String first;
	private String middle;

	

	public String getLast() {
		return last;
	}


	public void setLast(String last) {
		this.last = last;
	}


	public String getFirst() {
		return first;
	}


	public void setFirst(String first) {
		this.first = first;
	}


	public String getMiddle() {
		return middle;
	}


	public void setMiddle(String middle) {
		this.middle = middle;
	}


	public Person(String last, String first, String middle) {
		this.last = last;
		this.first = first;
		this.middle = middle;

	}


	

}
