package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph{
	Random rand = new Random();
	int x;
	int y;
	public MovingMorph(int x, int y) {
		super(x, y);
		this.x = x;
		this.y = y;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		x += rand.nextInt(50);

		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.green);
		g.fillRect(x, y, 25, 25);
	}

}
