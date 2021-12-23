public class Faculty {

    /*
        Die nachfolgende Methode soll die Fakultät der übergebenen Zahl n berechnen (n!)
        Die Fakultät einer Zahl N ist definiert als N! = N * (N-1) * (N-2) * ... * 1
        Daher ist Fakultät 5 zum Beispiel 5! = 5 * 4 * 3 * 2 * 1
        Beachte, dass 0! als 1 definiert ist.
        Der Code der Methode stimmt schon fast, nur leider haben sich 3 kleine Fehler eingeschlichen.
        Finde die Fehler und verbessere sie!
     */
    private static long calculateFacultyOfN(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        // Wenn der Startwert von faculty 0 ist, so ist jede Multiplikation mit diesem Wert wieder 0.
        long faculty = 1;

        // Wenn die Zahl i in jedem Durchgang der for-Schleife hoch statt runter gezählt wird, endet die Schleife nie
        // Wenn i bis >= 0 runtergezählt wird, wird i in einem Durchgang auch 0. Somit ist das Ergebnis durch die Multiplikation immer 0.
        for (int i = n; i > 0; i--) {
            faculty = faculty * i;
        }

        return faculty;
    }

    public static void main(String[] args) {
        int testN = 6;
        long testFaculty = calculateFacultyOfN(testN);

        if(testFaculty == 720) {
            System.out.println("Correct!");
        } else {
            System.out.println("Not correct");
        }
    }
}
