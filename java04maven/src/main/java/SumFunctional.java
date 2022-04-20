public class SumFunctional <T extends SingleArgumentFunction> implements Functional<T>{
    private double rightLimit;
    private double leftLimit;

    public SumFunctional(double rightLimit, double leftLimit) {
        if(rightLimit < leftLimit) throw new IllegalArgumentException();
        this.rightLimit = rightLimit;
        this.leftLimit = leftLimit;
    }

    @Override
    public double getResult(T f) {
        if (rightLimit > f.getRightLimit() || leftLimit < f.getLeftLimit()) {
            throw new IllegalArgumentException();
        }
        return f.getValue(f.getRightLimit()) + f.getValue(f.getLeftLimit())
                + f.getValue((f.getLeftLimit() + f.getRightLimit()) / 2);
    }
}
