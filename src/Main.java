public class Main {

  public static void main(String[] args) {

    CarFactory newProduceCar = new CarFactory();
    TaxiFactory newProduceTaxi = new TaxiFactory();
    ElectricCarFactory newProduceElectricCar = new ElectricCarFactory();

    Car carAlpha = newProduceCar.produceCar();
    Car carNinja = newProduceTaxi.produceCar();
    Car carCybertruck = newProduceElectricCar.produceCar();
    Car carGtr = newProduceCar.produceCar();

    System.out.println(
        "車牌號碼" + "\t" + carAlpha.getCarId() + "\n"
            + "引擎號碼" + "\t" + carAlpha.getEngineId() + "\n"
            + "車身顏色" + "\t" + carAlpha.getColor() + "\n");
    System.out.println(
        "車牌號碼" + "\t" + carNinja.getCarId() + "\n"
            + "引擎號碼" + "\t" + carNinja.getEngineId() + "\n"
            + "車身顏色" + "\t" + carNinja.getColor() + "\n");
    System.out.println(
        "車牌號碼" + "\t" + carCybertruck.getCarId() + "\n"
            + "引擎號碼" + "\t" + carCybertruck.getEngineId() + "\n"
            + "車身顏色" + "\t" + carCybertruck.getColor() + "\n");
    System.out.println(
        "車牌號碼" + "\t" + carGtr.getCarId() + "\n"
            + "引擎號碼" + "\t" + carGtr.getEngineId() + "\n"
            + "車身顏色" + "\t" + carGtr.getColor() + "\n");

    System.out.println("Car生產數量" + "\t" + newProduceCar.getProducedCars());
    System.out.println("Taxi生產數量" + "\t" + newProduceTaxi.getProducedCars());
    System.out.println(
        "ElectricCar生產數量" + "\t" + newProduceElectricCar.getProducedCars() + "\n");

    System.out.println("更新車牌" + "\t" + newProduceCar.updateCarId(carAlpha, "CCC-9966"));
    System.out.println("更新車牌" + "\t" + newProduceTaxi.updateCarId(carNinja, "TAB-7788"));
    System.out.println(
        "更新車牌" + "\t" + newProduceElectricCar.updateCarId(carCybertruck, "ESC-0101") + "\n");

    System.out.println("更新車牌" + "\t" + newProduceCar.updateCarId(carAlpha, "AAA-1122"));
    System.out.println("更新車牌" + "\t" + newProduceTaxi.updateCarId(carNinja, "YAA-5656"));
    System.out.println(
        "更新車牌" + "\t" + newProduceElectricCar.updateCarId(carCybertruck, "PIP-9527") + "\n");

    System.out.println("更新顏色" + "\t" + newProduceCar.updateCarColor(carAlpha, "White"));
    System.out.println(
        "更新顏色" + "\t" + newProduceElectricCar.updateCarColor(carCybertruck, "Black"));
    System.out.println("更新顏色" + "\t" + newProduceCar.updateCarColor(carGtr, "Yellow"));
    System.out.println(
        "更新顏色" + "\t" + newProduceElectricCar.updateCarColor(carCybertruck, "Red"));

  }
}