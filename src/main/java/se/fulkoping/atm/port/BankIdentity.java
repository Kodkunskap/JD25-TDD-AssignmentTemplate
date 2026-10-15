package se.fulkoping.atm.port;

/**
 * Identifierar banken som automaten är kopplad till.
 * Ändra inte den här klassen – mocka den med {@code mockStatic} i dina tester.
 */
public final class BankIdentity {

    private BankIdentity() {
    }

    /**
     * Anropar bankens riktiga system, som inte är tillgängligt under utveckling.
     */
    public static String getBankName() {
        throw new IllegalStateException("Ingen anslutning till Fulköpings Banks system – mocka BankIdentity i testerna");
    }
}
