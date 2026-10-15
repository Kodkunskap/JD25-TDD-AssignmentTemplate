package se.fulkoping.atm.domain;

import se.fulkoping.atm.port.Bank;

/**
 * Uttagsautomaten. Implementera metoderna testdrivet – skriv ett test som failar först.
 */
public class ATM {
    private final Bank bank;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    public boolean insertCard(String cardId) {
        throw new UnsupportedOperationException("Inte implementerad");
    }

    public boolean enterPin(String pin) {
        throw new UnsupportedOperationException("Inte implementerad");
    }

    public int getRemainingAttempts() {
        throw new UnsupportedOperationException("Inte implementerad");
    }

    public boolean isLoggedIn() {
        throw new UnsupportedOperationException("Inte implementerad");
    }

    public int checkBalance() {
        throw new UnsupportedOperationException("Inte implementerad");
    }

    public void deposit(int amount) {
        throw new UnsupportedOperationException("Inte implementerad");
    }

    public boolean withdraw(int amount) {
        throw new UnsupportedOperationException("Inte implementerad");
    }

    public void ejectCard() {
        throw new UnsupportedOperationException("Inte implementerad");
    }

    public String getBankName() {
        throw new UnsupportedOperationException("Inte implementerad");
    }
}
