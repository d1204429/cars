public class ElectricCarFactory extends CarFactory {

  @Override
  public Car produceCar() {
    String numberIdIndex = "0123456789";
    String alphabetIndex = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int engineIdLength = 8;
    StringBuilder engineIdPart = new StringBuilder();
    for (int a = 0; a < engineIdLength; a++) {
      int partId = (int) (numberIdIndex.length() * Math.random());
      engineIdPart.append(numberIdIndex.charAt(partId));
    }
    String engineId = engineIdPart.toString();

    int carAIdLength = 2;
    int carEIdLength = 4;

    StringBuilder carIdAPart = new StringBuilder();
    for (int b = 0; b < carAIdLength; b++) {
      int partAId = (int) (alphabetIndex.length() * Math.random());
      carIdAPart.append(alphabetIndex.charAt(partAId));
    }

    StringBuilder carIdBPart = new StringBuilder();
    for (int c = 0; c < carEIdLength; c++) {
      int partEId = (int) (numberIdIndex.length() * Math.random());
      carIdBPart.append(numberIdIndex.charAt(partEId));
    }

    String carId = "E" + carIdAPart + '-' + carIdBPart;

    String[] colors = {"White", "Black", "Blue"};
    int partColorIndex = (int) (colors.length * Math.random());
    String color = colors[partColorIndex];
    Car car = new Car(carId, engineId, color);
    increaseNumOfCars();
    return car;
  }

  @Override
  boolean updateCarId(Car car, String carId) {
    car.setCarId(carId);
    if (car.getCarId().matches("E[A-Z]{2}-\\d{4}")) {
      return true;
    }
    return false;
  }


}
