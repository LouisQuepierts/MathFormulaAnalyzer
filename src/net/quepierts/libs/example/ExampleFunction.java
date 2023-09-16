package net.quepierts.libs.example;

import net.quepierts.libs.math.calculate.expression.MathematicalExpression;
import net.quepierts.libs.math.calculate.expression.MathematicalFormula;
import net.quepierts.libs.math.calculate.function.MathematicalFunction;

import java.util.HashMap;
import java.util.Map;

public class ExampleFunction {
    public static void main(String[] args) {
        // Using internal function lib
        MathematicalFunction.init();

        // Enable Compiler Logging
        MathematicalExpression.enableLogging();

        Map<Character, Double> parameters = new HashMap<>();

        // Declare a function that can take in parameters
        MathematicalFormula formula_a = MathematicalFormula.compile("f(x) = 4x^2 + 12", false);

        // Parameters can be assigned in statement
        MathematicalFormula formula_b = MathematicalFormula.compile("func(x = 8) = 4 * x - (x / 2)", false);
        // Parameters can set by method
        formula_a.setParameter('x', 8.0d);
        // 268.0
        System.out.println(formula_a.value());

        // Also, parameters can set by a map
        parameters.put('x', 4.0d);
        // 76.0
        System.out.println(formula_a.result(parameters));
        // 28.0
        System.out.println(formula_b.value());


    }
}
