import java.util.function.BinaryOperator;

class Factory {
public calculateBiImpl createNotification(String type) {
if (type == null || type.isEmpty()) return null;
switch (type.toLowerCase()) {
case "add":
return new BiOperatorModes.add;
case "minus":
return new BiOperatorModes.minus;
};
case "multiply":
return new BiOperatorModes.multiply;
default:
throw new IllegalArgumentException("Unknown type: " + type);
}
}
