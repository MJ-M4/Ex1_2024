package Ex1_2024_28_11.Ex1_2024_28_11;

/* Mohmad Jayusi - 322458431
 * Mohamed Mhajne - 207705096  */

public class question4 {

	public static String compare(double A, double B, String mod) {
		switch (mod) {
		case "regular":
			if (A < B)
				return "B";
			else
				return "A";

		case "negative":
			if (-A < -B)
				return "B";
			else
				return "A";

		case "inverse":
			if (1 / A > 1 / B)
				return "A";
			else
				return "B";

		default:
			return "Error";
		}
	}

	public static String compare(double A, String B, String mod) {
		return "Error";
	}

	public static String compare(String B, double A, String mod) {
		return "Error";
	}

}
