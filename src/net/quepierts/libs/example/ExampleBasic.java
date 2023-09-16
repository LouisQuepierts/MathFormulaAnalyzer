package net.quepierts.libs.example;

import net.quepierts.libs.math.calculate.exception.FunctionException;
import net.quepierts.libs.math.calculate.expression.MathematicalFormula;

import java.util.HashMap;
import java.util.Map;

public class ExampleBasic {
    public static void main(String[] args) throws FunctionException {
        MathematicalFormula formula;

        // Basic Four Operations (+ - * /) with brackets
        // Spaces between characters are unnecessary
        formula = MathematicalFormula.compile("1 + 2 * 8 / (2 * 4)", false);

        // Result should be 3.0
        System.out.println(formula.value());

        // Calculation with multiple brackets
        formula = MathematicalFormula.compile("(6 * 4) - (7 * (8 + 2))", false);
        // Result should be -46.0
        System.out.println(formula.value());

        // Calculation with power (a ^ b)
        formula = MathematicalFormula.compile("12 ^ 2 + 64 + 2 ^ 4", false);
        // 224.0
        System.out.println(formula.value());
    }
}
