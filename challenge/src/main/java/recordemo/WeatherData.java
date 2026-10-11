package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return ((temperatureCelsius*9.0)/5.0) +32;
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        double cels=temperatureCelsius;
        double fahr=temperatureFahrenheit();
        String text=String.format("Current weather: %.1f°C (%.1f°F) and %s",cels,fahr,conditions);
        return text;
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
       double cels=5.0*(tempFahrenheit-32)/9.0;
       return new WeatherData(cels,conditions);
    }

    //test output
    public static void main(String[] args) {
        WeatherData today = new WeatherData(25.0,"Sunny");
        System.out.println("Today's weather: "+today.getSummary());

        WeatherData yesterday=WeatherData.fromFahrenheit(50.0,"Cloudy");
        System.out.println("Yesterday's weather :"+yesterday.getSummary());
    }
}
