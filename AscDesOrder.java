package com.redington.java.arrayEx;

public class AscDesOrder {
	int store;

	public int[] doAscOrder(int[] asc) {
		for (int i = 0; i < 5; i++) {
			for (int j = i+1; j < 5; j++) {
				if (asc[i] > asc[j]) {
					store = asc[i];
					asc[i] = asc[j];
					asc[j] = store;
				}
			}
		}
		return asc;
	}



	public int[] doDesOrder(int[] des) {
		for (int i = 0; i < 5; i++) {
			for (int j = i+1; j < 5; j++) {
				if (des[i] < des[j]) {
					store = des[i];
					des[i] = des[j];
					des[j] = store;
				}
			}
		}
		return des;
	}
}