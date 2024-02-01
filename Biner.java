public abstract class Biner {
    private double op1;
    private double op2;

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    public double getOp1() {
        return op1;
    }

    public double getOp2() {
        return op2;
    }

    public abstract double hitung();
}
