package com.Basic;

public class ArrayLists {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String s = "Jack";
		String t = "Jack";
		String o = new String("man");
		String p = new String("man");
		System.out.println("===========referance===========");
		System.out.println(s==t);
		System.out.println(s.equals(t));
		System.out.println("===========obj and ref=========");
		System.out.println(s==o);
		System.out.println(s.equals(o));
		System.out.println("===========objects==========");
		System.out.println(o==p);
		System.out.println(o.equals(p));
		System.out.println("===========calling intern==========");
	    String q = new String("spyder");
	    String r = q.intern();
	    System.out.println(q.charAt(4));
	    System.out.println(q.compareTo(r));
	    char[] c = {'4','5','1','2','3','4','5','1','2','3','4','5','1','2','3','4','5'};
	    byte[] b = {'1','2','3','4','5'};
	    String v = new String(c);
	    System.out.println(v);
	    String w = new String(b);
	    System.out.println(w);
	    System.out.println(v.equals(w));
	    System.out.println("===============tostring============");
	    System.out.println(v.toString());
	    System.out.println(w.toString());
	    System.out.println("===============String methods============");
	    System.out.println(v.charAt(2));
	    System.out.println(w.concat(q));
	    System.out.println(v.lastIndexOf(3));
	    System.out.println(v.lastIndexOf(0, 3));
	    System.out.println(v.length());
	    char a = 't';
	    String b1 = String.valueOf(a);
	    System.out.println(b1);
	    String x = "Mymommadememuttoncurry.";
	    String[] y = x.split("@");
	    for (String r1:y) {
	    	System.out.print(r1);
	    }
	     StringBuffer n1 = new StringBuffer();
	    System.out.println(n1.append(c));
	
	   n1.setLength(17);
	   System.out.println( n1.length());
	   System.out.println(n1.capacity());
	   n1.trimToSize();
	   System.out.println(v.compareTo(r));
	    
	    
}
}
