public class SalesSimulation {

    public static void main(String[] args) {
        double productCost = 9.99;
        double vatRate = 0.05;
        int unitsToSell = 10000;

        double vatPerUnit = productCost * vatRate;
        System.out.println("VAT for one unit: " + vatPerUnit);

        double netTotal = 0;
        double vatTotal = 0;
        int sold = 0;

        while (sold < unitsToSell) {
            netTotal += productCost;
            vatTotal += vatPerUnit;
            sold++;
        }

        double grossTotal = netTotal + vatTotal;

        System.out.println("Units sold: " + sold);
        System.out.println("Total net value: " + netTotal);
        System.out.println("Total VAT: " + vatTotal);
        System.out.println("Total gross value: " + grossTotal);
    }
}