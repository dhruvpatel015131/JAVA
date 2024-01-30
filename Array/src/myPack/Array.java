package myPack;

import java.util.Arrays;

public class Array {
	String nm[];

	public String[] getNm() {
		return nm;
	}

	public void setNm(String[] nm) {
		this.nm = nm;
	}

	@Override
	public String toString() {
		return "Array [nm=" + Arrays.toString(nm) + "]";
	}
	


}
