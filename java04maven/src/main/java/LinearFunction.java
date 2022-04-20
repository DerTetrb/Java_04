public class LinearFunction implements SingleArgumentFunction{
    private double A;
    private double B;
    private double rightLimit;
    private double leftLimit;

    public LinearFunction(double a, double b, double rightLimit, double leftLimit) {
        this.A = a;
        this.B = b;
        if(rightLimit < leftLimit) throw new IllegalArgumentException();
        this.rightLimit = rightLimit;
        this.leftLimit = leftLimit;
    }

    @Override
    public double getValue(double x) {
        if (x > rightLimit || x < leftLimit) {
            throw new IllegalArgumentException();
        }
        return A * x + B;
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
