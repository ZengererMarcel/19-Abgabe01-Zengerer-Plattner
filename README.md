# 19-Abgabe01-Zengerer-Plattner

In diesem Projekt geht es darum, die bisher behandelten Themen zu kombinieren und dieses Wissen in einem konkreten Programm anzuwenden. Dieses Programm besteht aus vier vorimplementierten Klassen (`Drink`, `SimpleDrink`, `Liquid`, `LiquidTest`). Das Projekt soll nun von uns mit einer weiteren Klasse (`MixedDrink`) und der dazugehörigen Testklasse (`MixedDrinkTest)`erweitert werden. Im Fokus dieser Aufgabe stehen die Testklassen und das Dokumentieren des Codes (JavaDoc). Nebenbei soll ein Labreport geführt werden.

## Geplante Erweiterungen

Die nächsten Schritte sind also:

- Erstellen einer weiteren Klasse `MixedDrink`
- Konstruktor erstellen
  - `MixedDrink(String name, Liquid[] L)`
- Methoden von `Drink`in `MixedDrink`implementieren 
  - `getVolume()`
  - `getAlcoholPercent()`
  - `isAlcoholic()`
- JavaDoc zu den Methoden erstellen
- Methoden in `MixedDrink`ausarbeiten
- Exception in `isAlcoholic()` ausarbeiten (falls Alkoholwert negativ ist)
- Testklassen zu `MixedDrink` (`MixedDrinkTest`) und zu `SimpleDrink`(`SimpleDrinkTest`) erstellen
- Für jede Methode und den Konstruktor in `MixedDrink` (mindestens) eine eigene Testmethode erstellen
  - `testConstructorAlcoholic()`
  - `testConstructorNonAlcoholic()`
  - `testConstructorNegativeAlcoholic()`
  - `testGetVolumeAlcoholic()`
  - `testGetVolumeNonAlcoholic()`
  - `testGetAlcoholPercentAlcoholic()`
  - `testGetAlcoholPercentNonAlcoholic()`
  - `testGetAlcoholPercentNegativeAlcoholic()`
  - `testIsAlcoholicAlcoholic()`
  - `testIsAlcoholicNonAlcoholic()`
  - `testIsAlcoholicNegativeAlcoholic()`
- JavaDoc für diese Testmethoden erstellen
- Testmethoden ausarbeiten
- Für jede Methode und den Konstruktor in `SimpleDrink` (mindestens) eine eigene Testmethode erstellen
  - `testConstructorAlcoholic()`
  - `testConstructorNonAlcoholic()`
  - `testGetVolumeAlcoholic()`
  - `testGetVolumeNonAlcoholic()`
  - `testGetAlcoholPercentAlcoholic()`
  - `testGetAlcoholPercentNonAlcoholic()`
  - `testIsAlcoholicAlcoholic()`
  - `testIsAlcoholicNonAlcoholic()`
- JavaDoc für diese Testmethoden erstellen
- Testmethoden ausarbeiten


## Relevantes Code-Schnipsel

```java
    
    /**
     * Returns alcohol volume percent of mixed drink
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        double alcohol = 0;

        for (Liquid l : liquidArray) {
            alcohol += l.getVolume() * (l.getAlcoholPercent() / 100);
        }

        return alcohol * 100 / getVolume();
    }
```


