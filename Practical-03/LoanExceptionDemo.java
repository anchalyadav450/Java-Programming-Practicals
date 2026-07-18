// User defined exception class
class LoanException extends Exception {

    public LoanException(String message) {
        super(message);
    }
}


// Class using custom exception
class Loan {

    public void checkLoanEligibility(int salary) throws LoanException {

        if (salary < 15000) {
            throw new LoanException("Salary is too low for loan approval.");
        }
        else {
            System.out.println("Loan approved successfully.");
        }
    }
}


// Main class
public class LoanExceptionDemo {

    public static void main(String[] args) {

        Loan loan = new Loan();

        try {

            loan.checkLoanEligibility(25000); // Valid salary
            loan.checkLoanEligibility(10000); // Exception raised

        }
        catch (LoanException e) {

            System.out.println("Custom Exception Caught: " + e.getMessage());

        }
    }
}
