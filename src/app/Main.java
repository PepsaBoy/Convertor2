package app;

public class Main {
    private static final int Const=32;
    private static final double Conv= (double) 5 /9;
    private static final double ConvC= (double) 9 /5;
    public static void main(String[] args) {
        System.out.println("Temperature unit converter");
        double Fhrnhts=150;
        double Clss=30;
        double Fahrenheits=convCelsiusToFahrenheits(Clss);
        double Celsius= convFahrenheitsToCelsius(Fhrnhts);
        System.out.println("Result Fahrenheits to Celsius is "+Celsius);
        System.out.println("Result Celsius to Fahrenheits is "+Fahrenheits);
    }
    private static double convFahrenheitsToCelsius(double Fhrnhts){
        return (Fhrnhts-Const)*Conv;
    }
    private static double convCelsiusToFahrenheits(double Clss){
        return (Clss*ConvC)+Const;
    }
}
