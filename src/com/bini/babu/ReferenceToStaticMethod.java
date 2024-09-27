package com.bini.babu;

public class ReferenceToStaticMethod {
    static ReferenceToStaticMethod rsm = new ReferenceToStaticMethod();
    
    static {
    	System.out.println(rsm);
    	//ReferenceToStaticMethod.init(); //oneway to call static method
    	ReferenceToStaticMethod.rsm = ReferenceToStaticMethod.secoundWayReferenceToStaticMethod(); //secondway to call static method
    }
    
	public static void main(String[] args) {
		System.out.println(ReferenceToStaticMethod.rsm);

	}
	
	static void init() {  //oneway to call static method
		ReferenceToStaticMethod.rsm = new ReferenceToStaticMethod(); //object reference in static method
	}
    
	static ReferenceToStaticMethod secoundWayReferenceToStaticMethod() { //secondway to call static method
		return ReferenceToStaticMethod.rsm;
	}
}
