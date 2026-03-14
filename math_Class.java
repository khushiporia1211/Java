public class math_Class {
    public static void main(String[] args) {
        System.out.println("Absolute: "+Math.abs(-123));
        System.out.println("Absolute: "+StrictMath.abs(-1230)); // perfect result in the case of float
        System.out.println("Cube Root: "+Math.cbrt(27));
        System.out.println("Exact Decrement: "+Math.decrementExact(7));
        System.out.println("Exponent value in floating point: "+Math.getExponent(12.3456));
        System.out.println("Convert to radians: "+Math.toRadians(90));
        System.out.println("Round Division: "+Math.floorDiv(50,9));
        System.out.println("e power x: "+Math.exp(1));
        System.out.println("e power x: "+StrictMath.exp(1));
        System.out.println("log base 10: "+Math.log10(100));
        System.out.println("Maximum: "+Math.max(100,50));
        System.out.println("Tan: "+Math.tan(45*(Math.PI)/180));
        System.out.println("Convert to degree: "+Math.atan(1));
        System.out.println("Convert tp degree: "+StrictMath.toDegrees(StrictMath.tanh(1)));
        System.out.println("Random: "+Math.random()*1000);
        System.out.println("Power: "+Math.pow(2,3));
        System.out.println("Exact product: "+Math.multiplyExact(100,200));
        System.out.println("Next float value: "+ Math.nextAfter(12.5,13));


    }
}
