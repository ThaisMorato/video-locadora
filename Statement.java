import java.util.Enumeration;

public abstract class Statement {

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = getHeader(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += getRentalStatement(each);
        }
        result += getFooter(aCustomer);
        return result;
    }

    protected abstract String getHeader(Customer aCustomer);

    protected abstract String getRentalStatement(Rental aRental);

    protected abstract String getFooter(Customer aCustomer);
}