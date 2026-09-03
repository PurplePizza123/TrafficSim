package main.java.traffic;

public class CarTest {
        CarType carType;

        public CarTest(CarType carType) {
            this.carType = carType;
        }

        public void modelPrint() {
            switch (carType) {
                case CIVIC:

                    System.out.println("Civic");
                    break;

                case F150:

                    System.out.println("F150");
                    break;

                default:
                    System.out.println("DNE");
                    break;
            }
        }

        public static void main(String[] args) {
            CarTest civic = new CarTest(CarType.CIVIC);
            civic.modelPrint();
            CarTest f150 = new CarTest(CarType.F150);
            f150.modelPrint();
        }
    }