public class Student implements IDiscount{

    @Override
    public double ComputeDiscount(double payment) {
        return payment - (payment * 0.18);
    }
    
}
