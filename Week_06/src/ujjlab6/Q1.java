package ujjlab6;

interface Company {
	void calSales(int sales);
}

class Hardware implements Company {
	String c, m;
	static int tsales = 0;
	Hardware(String c, String m, int sales) {
		this.c = c;
		this.m = m;
		calSales(sales);
	}
	public void calSales(int sales) {
		tsales+= sales;
	}
}

class Software implements Company {
	String t, os;
	static int tsales = 0;
	Software(String t, String os, int sales) {
		this.t = t;
		this.os = os;
		calSales(sales);
	}
	public void calSales(int sales) {
		tsales+= sales;
	}
}


public class Q1 {
	public static void main(String[] args) {
		Hardware h1 = new Hardware("Laptop", "Dell", 500);
		Hardware h2 = new Hardware("Laptop", "HP", 600);
		Software s1 = new Software("Freeware", "MS", 100);
		Software s2 = new Software("Commercial", "Google", 200);
		System.out.println("HW: " + Hardware.tsales);
		System.out.println("SW: " + Software.tsales);
	}
}
