package app;

public class Main {
    private static final int Const=32;
    private static final double Conv= (double) 5 /9;
    public static void main(String[] args) {
        System.out.println("Temperature unit converter");
        double Fahrenheits=150;
        double Celsius= convFahrenheitsToCelsius(Fahrenheits);
        System.out.println("Result is "+Celsius);
    }
    private static double convFahrenheitsToCelsius(double Fahrenheits){
        return (Fahrenheits-Const)*Conv;

    }
}
