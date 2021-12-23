Mit dieser Aufgabe soll das lesen von Code, das Verständnis von Algorithmen, Debugging und das Konzept von Schleifen wiederholt werden. Dazu ist in der `calculateFacultyOfN`-Methode Code vorgegeben mit dem die Fakultät einer übergebenen Zahl n berechnet werden kann. Die Methode soll also n! zurückgeben. Leider haben sich *drei Fehler* eingeschlichen, die zu unerwartetem Verhalten führen. Finde die Fehler und verbessere sie.

Die Fakultät einer Zahl ist die Multiplikation aller Zahlen von 1 bis zu dieser Zahl. Sie ist also definiert als <br> `N! = N * (N-1) * (N-2) * ... * 1`.

Das ist äquivalent zur rekursiven Definition `N! = N * (N-1)!`, wobei 0! als 1 definiert ist.

Beispielsweise ist `5! = 5 * 4! = 5 * 4 * 3! = ... = 5 * 4 * 3 * 2 * 1 = 120`.

Quelle: https://de.wikipedia.org/wiki/Fakult%C3%A4t_(Mathematik)

## Relevante Kursinhalte
- Vorlesung aus Woche 4 zu Kontrollstrukturen
