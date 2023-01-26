package string;

import javax.print.DocFlavor.STRING;

import org.omg.Messaging.SyncScopeHelper;

public class Sample1 {
	public static void main(String[]args) {
		//Literal String
		System.out.println("Literal String");
		String s1 ="vikram";
		String s2 ="vikram";
		String s3="bijju";
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
	
		//Non Literal String
		System.out.println("\nNon literal String");
		
		String nl =new String("vikram");
		String nl1 =new String("vikram");
		String nl2=new String("bijju");
		
		System.out.println(System.identityHashCode(nl));
		System.out.println(System.identityHashCode(nl1));
		System.out.println(System.identityHashCode(nl2));
		
		//Immutable
		System.out.println("\nImmutable String");
		
		String Is= "vikram";
		String Is1="bijju";
		
		System.out.println(System.identityHashCode(Is));
		System.out.println(System.identityHashCode(Is1));
		
		Is = Is.concat(Is1);
		System.out.println(Is);
		System.out.println(System.identityHashCode(Is));
		
		System.out.println("\nMutable String");
		
		StringBuffer mS=new StringBuffer("vikram");
		StringBuffer ms1=new StringBuffer("bijju");
		
		System.out.println(System.identityHashCode(mS));
		System.out.println(System.identityHashCode(ms1));
		
		mS.append(ms1);
		System.out.println(mS);
		System.out.println(System.identityHashCode(mS));
		
		
		
	}

}
