class box {
	public static void main(String[] args) {
		box a = new box();
		box b = new box(4);
		box c = new box(3, 8, 5);
		System.out.println(box.volume(a));
		System.out.println(box.volume(b));
		System.out.println(box.volume(c));

	}

	int length;
	int breadth;
	int height;

	box() {
		this.length = 0;
		this.breadth = 0;
		this.height = 0;

	}

	box(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;

	}

	box(int size) {
		this.length = size;
		this.breadth = size;
		this.height = size;

	}

	static int volume(box a) {
		int vol = a.length * a.breadth * a.height;
		return vol;

	}

}
