Java Reference to static methods


package com.bini.babu;

public class ReferenceToStaticMethod {
    static ReferenceToStaticMethod rsm = new ReferenceToStaticMethod();
    
    static {
    	System.out.println(rsm);
    	//ReferenceToStaticMethod.init();//oneway to call static method
        ReferenceToStaticMethod.rsm = ReferenceToStaticMethod.secoundWayReferenceToStaticMethod(); //secondway to call static method
    }
    
	public static void main(String[] args) {
		System.out.println(ReferenceToStaticMethod.rsm);

	}
	
	static void init() { //oneway to call static method
		ReferenceToStaticMethod.rsm = new ReferenceToStaticMethod();  //object reference in static method
	}
       static ReferenceToStaticMethod secoundWayReferenceToStaticMethod() { //secondway to call static method
		return ReferenceToStaticMethod.rsm;
	}

}



Output

com.bini.babu.ReferenceToStaticMethod@378fd1ac
com.bini.babu.ReferenceToStaticMethod@49097b5d



the first object instance (i.e   static ReferenceToStaticMethod rsm = new ReferenceToStaticMethod(); ) is creating a new location, hence the print command in the static block will display the first memory location (i.e in output com.bini.babu.ReferenceToStaticMethod@378fd1ac) . After that another object instance is created in static method 'init' , hence in the static block we call init method (i.e  
ReferenceToStaticMethod.init(); ) thus new memory location is allocated in the output (com.bini.babu.ReferenceToStaticMethod@49097b5d).

'secoundWayReferenceToStaticMethod' static method return the second address location as 'init', with static block calling secoundWayReferenceToStaticMethod method and assigning to a value (i.e ReferenceToStaticMethod.rsm = ReferenceToStaticMethod.secoundWayReferenceToStaticMethod();).
