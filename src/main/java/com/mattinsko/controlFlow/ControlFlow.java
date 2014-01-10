package com.mattinsko.controlFlow;

import java.util.List;
import java.util.Iterator;

public class ControlFlow {
	public static void main (String args[]) {
		System.out.println("Control Flow...");
		caseMethod(4);
		new ControlFlow().ifMethod(2);
	}
	
	private static int caseMethod(int i) {
		int ret=0;
		switch (i) {
		case 1:
			return 1;
		case 2:
			return 2;
		case 3:
			ret = 3;
			break;
		case 4:
			ret=4;
			break;
		default:
			ret=5;
		}
		return ret;
	}
	
	public int ifMethod(int i) {
		int ret=0;
		if (i==1) return 1;
		if (i==2) return 2;
		if (i==3) {
		 ret = 3;
		} else if (i==4) {
			ret=4;
		} else {
			ret=5;
		}
		return ret;
	}
	
	public String trinaryMethod(int i) {
		return (i%2==0)?"Even":"Odd";
	}
	
	public String evenOrOdd(int i) {
		if (i%2==0) {
			return "Even";
		}
		return "Odd";
	}
	
	public void loop(List<String> vals) {
		for (int i=0; i < vals.size(); i++) {
			System.out.println(vals.get(i));
		}
	}

	public void iterator(List<String> vals) {
		Iterator it = vals.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public void forEach(List<String> vals) {
		for (String s : vals) {
			System.out.println(s);
		}
	}
}
