package se.fulkoping.atm.port;

/**
 * Port mot Fulköpings Banks API. I testerna ersätts banken med en mock.
 * Alla belopp anges i hela kronor.
 */
public interface Bank {
    boolean isCardLocked(String cardId);

    boolean verifyPin(String cardId, String pin);

    int getFailedAttempts(String cardId);

    void incrementFailedAttempts(String cardId);

    void resetFailedAttempts(String cardId);

    void lockCard(String cardId);

    int getBalance(String cardId);

    void deposit(String cardId, int amount);

    void withdraw(String cardId, int amount);

    int getWithdrawnToday(String cardId); // används i VG2
}
