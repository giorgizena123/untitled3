import java.util.Objects;

class QuadraticEquation {
    private double a, b, c;
    private double x1, x2;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;


        double discriminant = b * b - 4 * a * c;
        if (discriminant >= 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        } else {
            x1 = x2 = Double.NaN;
        }
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        QuadraticEquation that = (QuadraticEquation) obj;
        return Double.compare(that.x1, x1) == 0 && Double.compare(that.x2, x2) == 0;
    }


    @Override
    public String toString() {
        return "QuadraticEquation{a=" + a + ", b=" + b + ", c=" + c + ", x1=" + x1 + ", x2=" + x2 + "}";
    }



    }
