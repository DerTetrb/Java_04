public class DivisionFunction implements SingleArgumentFunction{
    private double A;
    private double B;
    private double C;
    private double D;
    private double rightLimit;
    private double leftLimit;

    public DivisionFunction(double a, double b, double c, double d, double rightLimit, double leftLimit) {
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        if (rightLimit < leftLimit) throw new IllegalArgumentException();
        this.rightLimit = rightLimit;
        this.leftLimit = leftLimit;
    }

    @Override
    public double getValue(double x){
        if (x > rightLimit || x < leftLimit) {
            throw new IllegalArgumentException();
        }
        if(Double.compare(C * x + D, 0.0) == 0){
            throw new IllegalArgumentException("C * x + D == 0");
        }
        return (A * x + B) / (C * x + D);
    }

    @Override
    public double getRightLimit() {
        return rightLimit;
    }

    @Override
    public double getLeftLimit() {
        return leftLimit;
    }
}
