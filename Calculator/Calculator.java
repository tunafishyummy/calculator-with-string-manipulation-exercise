package Calculator;

import javax.swing.JOptionPane;

public class Calculator {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;

        String opening = "Welcome to the Calculator!";
        String stringy1 = "";
        String stringy2 = "";
        String stringyyes = "yes";

        while (stringyyes.equals("yes") || stringyyes.equals("Yes") || stringyyes.equals("YES")) {
            JOptionPane.showMessageDialog(null, opening);

            String selection = JOptionPane.showInputDialog(
                    "[A] Addition\n" +
                    "[B] Subtraction\n" +
                    "[C] Multiplication\n" +
                    "[D] Division\n" +
                    "[E] Remainder of Division");

            if (selection.equals("A") || selection.equals("a") || selection.equals("+")) {
                stringy1 = "Addition";
                stringy2 = "+";
            }

            if (selection.equals("B") || selection.equals("b") || selection.equals("-")) {
                stringy1 = "Subtraction";
                stringy2 = "-";
            }

            if (selection.equals("C") || selection.equals("c") || selection.equals("*")) {
                stringy1 = "Multiplication";
                stringy2 = "*";
            }

            if (selection.equals("D") || selection.equals("d") || selection.equals("/")) {
                stringy1 = "Division";
                stringy2 = "/";
            }

            if (selection.equals("E") || selection.equals("e") || selection.equals("%")) {
                stringy1 = "Remainder of Division";
                stringy2 = "%";
            }

            JOptionPane.showMessageDialog(null, "You have picked: " + stringy1);

            num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number:"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number:"));

            if (selection.equals("A") || selection.equals("a") || selection.equals("+")) {
                num3 = num1 + num2;
            }

            if (selection.equals("B") || selection.equals("b") || selection.equals("-")) {
                num3 = num1 - num2;
            }

            if (selection.equals("C") || selection.equals("c") || selection.equals("*")) {
                num3 = num1 * num2;
            }

            if (selection.equals("D") || selection.equals("d") || selection.equals("/")) {
                num3 = num1 / num2;
            }

            if (selection.equals("E") || selection.equals("e") || selection.equals("%")) {
                num3 = num1 % num2;
            }



            JOptionPane.showMessageDialog(null,
                    "Expression: " + num1 + " " + stringy2 + " " + num2 + " = " + num3);


            stringyyes = JOptionPane.showInputDialog(
                    "Do you want to perform an operation again? (yes / no)");
                    
                    while (!stringyyes.equals("yes") && !stringyyes.equals("Yes") && !stringyyes.equals("YES") && !stringyyes.equals("no") && !stringyyes.equals("No") && !stringyyes.equals("NO")) {
                        stringyyes = JOptionPane.showInputDialog(
                                "Invalid input. Please enter 'yes' or 'no'.\n" +
                                "Do you want to perform an operation again? (yes / no)");
                    }
        }

        JOptionPane.showMessageDialog(null,
                "Thank you for using my Calculator! Bye");
    }
}