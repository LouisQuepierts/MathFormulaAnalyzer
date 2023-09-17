# MathFormulaAnalyzer
A Lib for resolve math formula from String to executable object.
This lib required com.google.guava and jetbrain.annotations.
---
# Usage
This project can convert math formula to java objects. 

Example for basic operations: 
```
MathematicalFormula formula = MathematicalFormula.complie("(10 + 3 * 16) / 2", false);
double result = formula.value();
// result will be 29.0
``` 
---
Example for function: 
```
MathematicalFormula formula = MathematicalFormula.complie("f(x) = 2x + 4^x", false);
formula.setParameter('x', 3);

double result = formula.value();
// result will be 70.0
```
---
Example for using some math functions: 
```
// Using internal function lib
MathematicalFunction.init();

MathematicalFormula formula = MathematicalFormula.complie("f(x) = max(8x, x^3)", false);
formula.setParameter('x', 4);

double result = formula.value();
// result will be 64.0
``` 



Examples in quepierts.libs.example


