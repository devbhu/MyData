package com.test.stream;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarProblem {
	
	public static void main(String[] args) {
		
		final List<Car> cars = new ArrayList<Car>();
		Calendar manufacturedDate= null;
		Calendar currentDate = Calendar.getInstance();
		
		boolean flag = true;
		Double carPrice = 1200000.0;
		for(int i=0;i<10;i++){
			if(i%2==0){
				flag = true;
			}else{
				flag = false;
			}
			manufacturedDate = new GregorianCalendar(2003+i, Calendar.JANUARY, 20);
			cars.add(new Car("BMW"+i,"blue"+i,flag,manufacturedDate,carPrice+i,i));
		}
		
		System.out.println("Automatic Car count :"+cars.stream().filter((car) -> car.isAutomatic()).count());
       
		List<Car> carss = cars.stream().filter(car -> currentDate.get(Calendar.YEAR) - car.getManufacturedDate().get(Calendar.YEAR)>0)
		.collect(Collectors.toList());
		System.out.println(carss.size());
		//sorting
        //cars.sort((c1,c2)-> Double.compare(c1.getPrice(), c2.getPrice()));
        
        //System.out.println(cars);
        //
		
		//Increase all the automatic cars price by 5.
		
		cars.stream().filter(car -> car.isAutomatic()).forEach(car -> {
			
		car.setPrice(car.getPrice()+50000);
	    System.out.println("Car Name"+ car.getCarName() +" Price : "+car.getPrice());
		});
		
		 Map<String,List<Car>> carGroups = cars.stream().collect(Collectors.groupingBy(Car::getCompany));
         
		 System.out.println(carGroups);
		
	}

}
