package lab;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Circuit {
	public static void main(String[] args) {
		File file = new File("src\\lab\\input.txt");
		File outFile = new File("rc.txt");
		BufferedWriter out = null;
		Scanner sc = null;
		try {
			out = new BufferedWriter(new FileWriter(outFile));
			sc = new Scanner(file);
			
			if (sc.hasNextDouble()) {
				double t0 = sc.nextInt();
				double tn = sc.nextInt();
				double B = sc.nextDouble();
				double R = sc.nextDouble();
				double C = sc.nextDouble();
				double e = 2.7183;
				double rc = 1 / (R * C);
				double T = tn / 100;

				for (double i = t0; i <= tn; i = i + T) {
					double ep = 1 / (Math.pow(e, (rc * i)));
					double v = B * (1 - ep);
					out.write(new String(i + " " + v + "\n"));
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			try {
				out.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}