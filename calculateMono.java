public class calculateMono implements SimpleJavaCalculator {
    @Override
    public Double calculateMono(MonoOperatorModes newMode, Double num) {
        if (newMode.equals(MonoOperatorModes.square)) {
            return num * num;
        }
        if (newMode.equals(MonoOperatorModes.squareRoot)) {
            return Math.sqrt(num);
        }
        if (newMode.equals(MonoOperatorModes.oneDividedBy)) {
            return 1 / num;
        }
        if (newMode.equals(MonoOperatorModes.cos)) {
            return Math.cos(Math.toRadians(num));
        }
        if (newMode.equals(MonoOperatorModes.sin)) {
            return Math.sin(Math.toRadians(num));
        }
        if (newMode.equals(MonoOperatorModes.tan)) {
            if (num == 0 || num % 180 == 0 ) {
                return 0.0;
            }if (num % 90 == 0.0 && num % 180 != 0.0) {
                return NaN;
            }
            return Math.tan(Math.toRadians(num));
        }
        if (newMode.equals(MonoOperatorModes.log)) {
            return log10(num);
        }
        if (newMode.equals(MonoOperatorModes.ln)) {
            return log(num);
        }
        if (newMode.equals(MonoOperatorModes.rate) ) {
            return num / 100;
        }
        if (newMode.equals(MonoOperatorModes.abs)){
            return Math.abs(num);
        }


        // never reach
        throw new Error();

}
