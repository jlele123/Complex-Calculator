package github;

import java.util.Scanner;

public class ComplexCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;

		while (!exit) {
			System.out.println("Select operation:");
			System.out.println("1. Basic Arithmetic");
			System.out.println("2. Advanced Arithmetic");
			System.out.println("3. Trigonometric Functions");
			System.out.println("4. Logarithmic Functions");
			System.out.println("5. Complex Numbers");
			System.out.println("6. Exit");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				basicArithmetic(scanner);
				break;
			case 2:
				advancedArithmetic(scanner);
				break;
			case 3:
				trigonometricFunctions(scanner);
				break;
			case 4:
				logarithmicFunctions(scanner);
				break;
			case 5:
				complexNumberOperations(scanner);
				break;
			case 6:
				exit = true;
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}

		scanner.close();
	}

	public static void basicArithmetic(Scanner scanner) {
		System.out.println("Enter two numbers:");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();

		System.out.println("Select operation (+, -, *, /):");
		char op = scanner.next().charAt(0);

		double result = 0;
		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("Cannot divide by zero.");
				return;
			}
			break;
		default:
			System.out.println("Invalid operation.");
			return;
		}

		System.out.println("Result: " + result);
	}

	public static void advancedArithmetic(Scanner scanner) {
		System.out.println("Enter two numbers:");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();

		System.out.println("Select operation (%, ^):");
		char op = scanner.next().charAt(0);

		double result = 0;
		switch (op) {
		case '%':
			result = num1 % num2;
			break;
		case '^':
			result = Math.pow(num1, num2);
			break;
		default:
			System.out.println("Invalid operation.");
			return;
		}

		System.out.println("Result: " + result);
	}

	public static void trigonometricFunctions(Scanner scanner) {
		System.out.println("Enter an angle in degrees:");
		double angle = scanner.nextDouble();

		System.out.println("Select function (sin, cos, tan):");
		String function = scanner.next();

		double result = 0;
		switch (function) {
		case "sin":
			result = Math.sin(Math.toRadians(angle));
			break;
		case "cos":
			result = Math.cos(Math.toRadians(angle));
			break;
		case "tan":
			result = Math.tan(Math.toRadians(angle));
			break;
		default:
			System.out.println("Invalid function.");
			return;
		}

		System.out.println("Result: " + result);
	}

	public static void logarithmicFunctions(Scanner scanner) {
		System.out.println("Enter a number:");
		double num = scanner.nextDouble();

		System.out.println("Select function (ln, log10):");
		String function = scanner.next();

		double result = 0;
		switch (function) {
		case "ln":
			result = Math.log(num);
			break;
		case "log10":
			result = Math.log10(num);
			break;
		default:
			System.out.println("Invalid function.");
			return;
		}

		System.out.println("Result: " + result);
	}

	public static void complexNumberOperations(Scanner scanner) {
		System.out.println("Enter the real and imaginary parts of the first complex number:");
		double real1 = scanner.nextDouble();
		double imag1 = scanner.nextDouble();

		System.out.println("Enter the real and imaginary parts of the second complex number:");
		double real2 = scanner.nextDouble();
		double imag2 = scanner.nextDouble();

		System.out.println("Select operation (+, -, *, /):");
		char op = scanner.next().charAt(0);

		double realResult = 0;
		double imagResult = 0;

		switch (op) {
		case '+':
			realResult = real1 + real2;
			imagResult = imag1 + imag2;
			break;
		case '-':
			realResult = real1 - real2;
			imagResult = imag1 - imag2;
			break;
		case '*':
			realResult = real1 * real2 - imag1 * imag2;
			imagResult = real1 * imag2 + imag1 * real2;
			break;
		case '/':
			if (real2 != 0 || imag2 != 0) {
				double denom = real2 * real2 + imag2 * imag2;
				realResult = (real1 * real2 + imag1 * imag2) / denom;
				imagResult = (imag1 * real2 - real1 * imag2) / denom;
			} else {
				System.out.println("Cannot divide by zero.");
				return;
			}
			break;
		default:
			System.out.println("Invalid operation.");
			return;
		}

		System.out.println("Result: " + realResult + " + " + imagResult + "i");
	}
}
