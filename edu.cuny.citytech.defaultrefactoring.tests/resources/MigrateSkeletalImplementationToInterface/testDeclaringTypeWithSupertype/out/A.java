package p;

interface I {
	default void m() {
	}
}

class B {
	int f;
}

abstract class A extends B implements I {
}