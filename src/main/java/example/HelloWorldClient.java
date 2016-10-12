package example;/**
 * Created by karen.rahmeier on 10/12/2016.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
    com.daehosting.temperatureconversions.TemperatureConversionsSoapType service = new TemperatureConversions().getPort();
    //invoke business method
    service.celsiusToFahrenheit();  
  }
}
