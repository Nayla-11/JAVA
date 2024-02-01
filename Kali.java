public class Kali extends Biner {
    public Kali(double op1, double op2) {
        setOp1(op1);
        setOp2(op2);
    }

    
    public double hitung() {
        return getOp1() * getOp2();
    }

    
    public String toString() {
        return getOp1() + " * " + getOp2();
    }
}
