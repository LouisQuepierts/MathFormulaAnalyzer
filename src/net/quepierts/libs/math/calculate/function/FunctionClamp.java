package net.quepierts.libs.math.calculate.function;

import net.quepierts.libs.math.calculate.expression.MathematicalExpression;
import net.quepierts.libs.utils.MathUtils;

import java.util.Map;

public class FunctionClamp extends MathematicalFunction {
    public FunctionClamp(MathematicalExpression[] expressions) {
        super(expressions);
    }

    @Override
    protected double calculate(Map<Character, Double> parameters) {
        return MathUtils.clamp(inputParameters[0].result(parameters),
                inputParameters[1].result(parameters),
                inputParameters[2].result(parameters));
    }
}
