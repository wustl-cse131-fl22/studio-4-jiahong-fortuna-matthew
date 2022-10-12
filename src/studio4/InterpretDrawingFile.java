package studio4;

import java.io.File;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File

		String shape = in.next();
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double p1 = in.nextDouble();
		double p2 = in.nextDouble();
		double p3 = in.nextDouble();
		double p4 = in.nextDouble();
		


		System.out.println(shape);
		System.out.println(r);
		System.out.println(g);
		System.out.println(b);
		System.out.println(isFilled);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);

		StdDraw.setPenColor(r,g,b);

		if (shape.equals("rectangle")) {
			if (isFilled == true) {
				StdDraw.filledRectangle(p1, p2, p3, p4);
			}
			else {
				StdDraw.rectangle(p1, p2, p3, p4);
			}
		}



		if (shape.equals("ellipse")) {
			if(isFilled == true) {
				StdDraw.filledEllipse(p1, p2, p3, p4);
			}
			else {
				StdDraw.ellipse(p1, p2, p3, p4);
			}

		if (shape.equals("triangle")) {
			double p5 = in.nextDouble();
			double p6 = in.nextDouble();
				StdDraw.line(p1, p2, p3, p4);
				StdDraw.line(p3, p4, p5, p6);
				StdDraw.line(p5, p6, p1, p2);
			}
			
		}









		}

	}

