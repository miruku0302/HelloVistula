import java.math.BigDecimal;
import java.math.RoundingMode;

public class SalesSimulation {

    public static void main(String[] args) {
        BigDecimal productCost = new BigDecimal("9.99");
        BigDecimal vatRate = new BigDecimal("0.05");
        int unitsToSell = 10000;

        BigDecimal vatPerUnit = productCost.multiply(vatRate).setScale(2, RoundingMode.HALF_UP);
        System.out.println("VAT for one unit: " + vatPerUnit);

        BigDecimal netTotal = BigDecimal.ZERO;
        BigDecimal vatTotal = BigDecimal.ZERO;
        int sold = 0;

        while (sold < unitsToSell) {
            netTotal = netTotal.add(productCost);
            vatTotal = vatTotal.add(vatPerUnit);
            sold++;
        }

        BigDecimal grossTotal = netTotal.add(vatTotal);

        System.out.println("Units sold: " + sold);
        System.out.println("Total net value: " + netTotal);
        System.out.println("Total VAT: " + vatTotal);
        System.out.println("Total gross value: " + grossTotal);
    }
}