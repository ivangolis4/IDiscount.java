public class Main{

    public static void main(String[]args){
        IDiscount premium = new Premium();
        IDiscount senoior = new SenoiorDiscount();
        IDiscount student = new Student();

        double p1 = premium.ComputeDiscount(150);
        double p2 = senoior.ComputeDiscount(500);
        double p3 = student.ComputeDiscount(13);

        System.out.println("Premoum Discounted Payments: " + p1);
        System.out.println("Senoior Discounted Payments: " + p2);
        System.out.println("Student Discounted Payments: " + p3);

    }
}