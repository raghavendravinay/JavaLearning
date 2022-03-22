package strings2;

final class ImmutableClass {

	private int i;

	ImmutableClass(int i) {
		this.i = i;
	}

	public ImmutableClass modify(int i) {
		if (this.i == i) {
			return this;
		} else {
			return new ImmutableClass(i);
		}
	}

	public static void main(String[] args) {
		ImmutableClass t1 = new ImmutableClass(10);
		ImmutableClass t2 = t1.modify(100);
		ImmutableClass t3 = t1.modify(10);
		System.out.println(t1 == t2);
		System.out.println(t1 == t3);
	}
}
