public class calculateEqual implements SimpleJavaCalculator {
    @Override
     public Double calculateEqual(Double num) {
        return calculateBi(BiOperatorModes.normal, num);
    }
}

