package net.quepierts.libs.example;

import net.quepierts.libs.math.calculate.expression.MathematicalExpression;
import net.quepierts.libs.math.calculate.expression.MathematicalFormula;
import net.quepierts.libs.math.calculate.function.MathematicalFunction;

import java.util.HashMap;
import java.util.Map;

public class ExampleFunctions {
    public static void main(String[] args) {
        // Using internal function lib
        MathematicalFunction.init();

        // Enable Compiler Logging
        MathematicalExpression.enableLogging();

        // Formula can contain some functions
        MathematicalFormula formula = MathematicalFormula.compile("f(x) = max(2 * x, x ^ 2)", false);
        formula.setParameter('x', 4);

        // Declare a callable function
        MathematicalFormula.compile("g(x) = x * 4 + 3", true);
        // And use it in another function
        MathematicalFormula formula_a = MathematicalFormula.compile("f(x = 2) = g(x) ^ 2 + x", false);

        // 16.0
        System.out.println(formula.value());
        // 123.0
        System.out.println(formula_a.value());
    }
}
