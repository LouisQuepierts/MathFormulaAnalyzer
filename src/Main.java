import net.quepierts.libs.math.calculate.exception.FunctionException;
import net.quepierts.libs.math.calculate.expression.MathematicalFormula;
import net.quepierts.libs.math.calculate.function.MathematicalFunction;

public class Main {
    public static void main(String[] args) throws FunctionException {
        MathematicalFunction.init();
        MathematicalFormula compile = MathematicalFormula.compile("(x = 2) => abs(sum{k = 1, 10}(k - x) - prod{k = 1, 5}(k + x))", false);

        System.out.println("Result = " + compile.value());
    }
}
