public class SenoiorDiscount implements IDiscount{

    @Override
    public double ComputeDiscount(double payment) {
        return payment - (payment * 0.2);
    }
    
}
