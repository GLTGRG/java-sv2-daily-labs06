//package day02.cars;
//
//import cars.Car;
//import cars.Color;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class CarTest {
//
//    @Test
//    void createCarTest(){
//
//        cars.Car car = new Car("Toyota",1.2, Color.BLUE, 120);
//
//        assertEquals("Toyota", car.getBrand());
//        assertEquals(1.2, car.getEngineSize());
//        //assertEquals(Color.BLUE, car.getColor());
//        assertEquals(120, car.getPrice());
//    }
//
//    @Test
//    void decreasePriceTest(){
//
//        cars.Car car = new Car("Toyota",1.2, Color.BLUE, 120);
//
//        //car.decreasePrice(10);
//
//        assertEquals(108, car.getPrice());
//    }
//}