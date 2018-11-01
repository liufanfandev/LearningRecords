package thinking;

class Glyph {
	private int i = 6;
	void draw() {
		System.out.println("Glyph.draw()");
	}

	public Glyph() {
		System.out.println("Glyph() before draw()"+i);
		draw();
		System.out.println("Glayph() after draw()"+i);
	}
}
class GroundGlyph extends Glyph{
	private int radius = 1;
	public GroundGlyph(int r){
		this.radius = r;
		System.out.println("GroundGlyph.GroundPlygh(),radius="+radius);
	}
	void draw(){
		System.out.println("GroundGlyph.draw(),radius="+radius);
	}
}

public class PolyConstructors {

	public static void main(String[] args) {
		new GroundGlyph(5);
	}
}
