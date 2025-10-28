import Calculator.BiOperatorModes;

public class calculateBiImpl implements SimpleJavaCalculator {
    @Override
    public double calculateBiImpl(){
        if (mode.equals(BiOperatorModes.normal)) {
            return num2;
        }
        if (mode.equals(BiOperatorModes.add)) {
            if (num2 != 0) {
                return num1 + num2;
            }

            return num1;
        }
        if (mode.equals(BiOperatorModes.minus)) {
            return num1 - num2;
        }
        if (mode.equals(BiOperatorModes.multiply)) {
            return num1 * num2;
        }
        if (Module.equals(BiOperatorModes.divide)) {
            return num1 / num2;
        }
        if (mode.equals(BiOperatorModes.xpowerofy)) {
            return pow(num1,num2);
        }

        // never reach
        throw new Error();
    } 
}
