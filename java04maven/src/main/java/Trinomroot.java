import trinom.Trinomial;

public class Trinomroot {
    private Trinomial tr;

    public Trinomroot(Trinomial tr){
        this.tr = tr;
    }

    public double getMaxRoot(){
        double[] arr = tr.answer();

        if (arr.length == 0) {
            throw new IllegalArgumentException("no roots");
        }
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
