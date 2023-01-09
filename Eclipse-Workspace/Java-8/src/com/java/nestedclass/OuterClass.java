package com.java.nestedclass;

public class OuterClass {

	static int outerStaticMember = 10;

	int instanceMember = 20;

	private static int outerPrivateStaticMember = 30;

	static class StaticInnerClass {
		void display() {
			System.out.println("Static Inner Class Display");
			System.out.println(outerStaticMember);
			System.out.println(outerPrivateStaticMember);
			System.out.println();
		}
	}

	class NonStaticInnerClass {
		void display() {
			System.out.println("Non Static Inner Class Display");
			System.out.println(outerStaticMember);
			System.out.println(outerPrivateStaticMember);
			System.out.println(instanceMember);
			System.out.println();
		}
	}

	public void methodLocalInnerClass() {
		class MethodLocalClass {
			void display() {
				System.out.println("Method Local Inner Class Display");
				System.out.println(outerPrivateStaticMember);
				System.out.println(outerStaticMember);
				System.out.println(instanceMember);
				System.out.println();
			}
		}
		MethodLocalClass methodLocalClass = new MethodLocalClass();
		methodLocalClass.display();
	}

	public static void main(String[] args) {
		OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
		OuterClass outerClass = new OuterClass();
		System.out.println(outerClass.instanceMember);
		System.out.println();
		staticInnerClass.display();

		OuterClass.NonStaticInnerClass nonStaticInnerClass = new OuterClass().new NonStaticInnerClass();
		nonStaticInnerClass.display();
		
		outerClass.methodLocalInnerClass();

	}

}
