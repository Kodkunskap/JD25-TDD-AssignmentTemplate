package se.fulkoping.atm.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import se.fulkoping.atm.port.Bank;

@ExtendWith(MockitoExtension.class)
class ATMTest {

    @Mock
    private Bank bank;

    private ATM atm;

    @BeforeEach
    void setUp() {
        atm = new ATM(bank);
    }

    // Skriv ditt första test här – Red, Green, Refactor!
}
