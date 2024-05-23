public class Car {

  private String carId;
  private String engineId;
  private String color;

  public Car(String engineId) {
    this.engineId = engineId;
  }

  public Car(String carId, String engineId, String color) {
    this.carId = carId;
    this.engineId = engineId;
    this.color = color;
  }

  public String getEngineId() {
    return engineId;
  }

  public String getCarId() {
    return carId;
  }

  public void setCarId(String carId) {
    this.carId = carId;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
