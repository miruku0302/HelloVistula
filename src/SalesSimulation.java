public class SalesSimulation {

    public static void main(String[] args) {
        final double productCost = 9.99;
        final double vatRate = 0.05;
        final int unitsSold = 10_000;

        //VAT for one unit, calculated once outside the loop.
        final double vatPerUnit = productCost * vatRate;
        System.out.println("VAT amount for a single unit: " + vatPerUnit);

        //Declaring the total variables.
        double totalNet = 0.0;
        double totalVat = 0.0;
        double totalGross = 0.0;

        //Process each transaction.
        for (int i = 0; i < unitsSold; i++) {
            totalNet += productCost;
            totalVat += vatPerUnit;
            totalGross += productCost + vatPerUnit;
        }

        System.out.println("Total net sales value: " + totalNet);
        System.out.println("Total VAT amount: " + totalVat);
        System.out.println("Total gross value: " + totalGross);
    }
}
