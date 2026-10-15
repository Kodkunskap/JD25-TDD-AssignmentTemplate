# Pengamaskinen i Fulköping

Startprojekt för inlämningsuppgiften *Pengamaskinen i Fulköping* i kursen Testdriven utveckling i Java.

Du ska bygga en uttagsautomat till Fulköpings Bank, testdrivet och mot en mock av bankens API. Hela uppgiftsbeskrivningen finns på Google Classroom.

## Kom igång

Använd **inte** fork. Skapa ett nytt, tomt och privat repo på GitHub och flytta koden dit:

```bash
git clone https://github.com/Kodkunskap/JD25-TDD-AssignmentTemplate.git pengamaskinen
cd pengamaskinen
git remote set-url origin https://github.com/DITT-ANVÄNDARNAMN/DITT-REPO.git
git push -u origin main
```

Bjud sedan in läraren som collaborator och lämna in länken till repot på Google Classroom.

## Innehåll

| Fil | Beskrivning |
| --- | --- |
| `se.fulkoping.atm.port.Bank` | Interface för bankens API. Mockas med Mockito i testerna. |
| `se.fulkoping.atm.port.BankIdentity` | Statisk metod som anropar bankens riktiga system. Mockas med `mockStatic`. |
| `se.fulkoping.atm.domain.ATM` | Skal för automaten. Det är här du implementerar användarfallen. |
| `se.fulkoping.atm.domain.ATMTest` | Startpunkt för dina tester. |

Byt inte namn, parametrar eller returtyper på API:et, och flytta inte klasserna till andra paket. De dolda acceptanstesterna körs mot det.

## Bygga och testa

Projektet kräver Java 25 eller senare och Maven. Det använder JUnit 6, Mockito, JaCoCo och PIT.

```bash
mvn verify
```

Kommandot bygger projektet, kör alla tester och skapar rapporterna:

- Kodtäckning (JaCoCo): `target/site/jacoco/index.html`
- Mutationstestning (PIT): `target/pit-reports/index.html`

## Commits

Använd prefixen `test:`, `feat:`, `refactor:`, `docs:` och `chore:` i dina commit-meddelanden.

## VG-krav

<!-- Ange vilka av kraven VG1–VG7 du har gjort. -->
