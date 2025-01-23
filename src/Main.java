public class Main {
    public static void main(String[] args) {

        Writer writer1 = new Writer("George", "Orwell");
        Writer writer2 = new Writer("J.K.", "Rowling");


        Book book1 = new Book("1984", 328, "Dystopian", writer1);
        Book book2 = new Book("Harry Potter and the Philosopher's Stone", 223, "Fantasy", writer2);


        Book[] books = {book1, book2};


        for (Book book : books) {
            System.out.println(book);

            Fraction fraction1 = new Fraction(1, 2);
            Fraction fraction2 = new Fraction(2, 4);
            Fraction fraction3 = new Fraction(3, 4);


            Fraction[] fractions = {fraction1, fraction2, fraction3};

            for (Fraction fraction : fractions) {
                System.out.println(fraction);
            }

            int equalCount = 0;
            for (int i = 0; i < fractions.length; i++) {
                for (int j = i + 1; j < fractions.length; j++) {
                    if (fractions[i].equals(fractions[j])) {
                        equalCount++;
                    }
                }
            }


            System.out.println("Number of equal fractions: " + equalCount);

            QuadraticEquation eq1 = new QuadraticEquation(1, -3, 2);
            QuadraticEquation eq2 = new QuadraticEquation(1, -2, 1);
            QuadraticEquation eq3 = new QuadraticEquation(1, -3, 2);


            QuadraticEquation[] equations = {eq1, eq2, eq3};

            for (int i = 0; i < equations.length; i++) {
                for (int j = i + 1; j < equations.length; j++) {
                    if (equations[i].equals(equations[j])) {
                        equalCount++;
                    }
                }
            }
            System.out.println("Number of equal quadratic equations: " + equalCount);
        }
    }
}
