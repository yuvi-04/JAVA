package com.uv.main;

public class PointUse {
	public static void main(String[] args) {
		Point p1,p2,p3;
		p1=new Point(5,6);
		p2=new Point(4,7);
		p3=new Point();
		
		System.out.println("oringin " + p1.orgx + "," + p1.orgy);
		p1.orgx=10; p1.orgy=10;
		p2.orgx=20; p2.orgy=20;
		
		Point.orgx=30; Point.orgy=30;
		
		System.out.println("p1 = " + p1.x + "," + p1.y + "   " + p1.orgx + "," + p1.orgy);
		System.out.println("p2 = " + p2.x + "," + p2.y + "   " + p2.orgx + "," + p2.orgy);
		
		
		p1.printX();
		p1.printY();
		System.out.println("count = " + Point.getcount());
//		double dist=p1.ditancefromorigin();
//		System.out.println("distance from origin is "+ dist);
//		//Point farPt = p1.farPoint(p2);
//		Person pr1 = new Person("Dinesh");
//		Person pr2 = new Person("amit");
//		Person pr3 = new Person("yuvraj");
//		Person pr4 = new Person("abhishek");
//		Person pr5 = new Person("sumit");
//		Person pr6 = new Person("karan");
//		
//		pr3.father=pr2; pr2.son=pr3;
//		pr2.father=pr1; pr1.son=pr2;
//		pr6.father=pr5; pr5.son=pr6;
//		
//		pr1.show();           pr1.father=pr4;
//		pr2.show();           pr4.son=pr1;
//		pr3.show();
//		pr4.show();
//		pr5.show();
//		pr6.show();
//		Person ff=pr3.firstFather();
//		System.out.println("First father name is " + ff.name);
	}

}
