package com.capg;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.capg.Model.Order;
import com.capg.Model.Product;
import com.capg.Service.OrderService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Aws50SpringBootApplication {

	public static void main(String[] args) {
		 SpringApplication.run(Aws50SpringBootApplication.class, args);

		//ApplicationContext ctx = SpringApplication.run(Aws50SpringBootApplication.class, args);
		/*
		 * StudentService service = ctx.getBean(StudentService.class);
		 * 
		 * Address address = new Address(); address.setStreet("2nd street");
		 * address.setCity("Chennai"); address.setState("Tamilnadu");
		 * address.setZipCode("232222");
		 * 
		 * Student student = new Student(); student.setName("Marry");
		 * student.setAddress(address);
		 * 
		 * 
		 * service.addStudent(student);
		 * 
		 * Student obj = service.addStudent(student); if (obj != null) {
		 * System.out.println("Added" + obj.getStudentId() +
		 * " student with address to database."); }
		 * 
		 * else { System.out.println("not added ..."); }
		 */
/////////////////////////////////////////////////////////////////////
		// delete by city in address table///////////
		/*
		 * AddressService service = ctx.getBean(AddressService.class);
		 * 
		 * long status=service.deleteByCity("Chennai");
		 */

		// create a new department
		/*
		 * Department department = new Department(); department.setId(10);
		 * department.setName("Sales");
		 * 
		 * // create two instances of employees Employees e1 = new Employees();
		 * e1.setId(1001); e1.setName("Priya"); e1.setSalary(4500);
		 * 
		 * Employees e2 = new Employees(); e2.setId(1002); e2.setName("Dinesh Kumar");
		 * e2.setSalary(5500);
		 * 
		 * // add both employees to department department.addEmployee(e1);
		 * department.addEmployee(e2);
		 * 
		 * DepartmentService service = ctx.getBean(DepartmentService.class);
		 * System.out.println(service.addDepartment(department));
		 */

		/*
		 * OrderService service = ctx.getBean(OrderService.class);
		 * 
		 * // first define few products before we place order
		 * 
		 * Product elecProduct = new Product(); elecProduct.setId(1);
		 * elecProduct.setName("LED TV"); elecProduct.setPrice(45000);
		 * 
		 * Product beautyProduct = new Product(); beautyProduct.setId(2);
		 * beautyProduct.setName("Face Wash"); beautyProduct.setPrice(80);
		 * 
		 * Product babyProduct = new Product(); babyProduct.setId(3);
		 * babyProduct.setName("Pampers"); babyProduct.setPrice(15);
		 * 
		 * Product eleProduct = new Product(); eleProduct.setId(4);
		 * eleProduct.setName("CFL Bulb"); eleProduct.setPrice(250);
		 * 
		 * // now define first order and add few products in it Order firstOrder = new
		 * Order(); firstOrder.setId(1000); firstOrder.setPurchaseDate(new Date());
		 * 
		 * firstOrder.addProduct(babyProduct); firstOrder.addProduct(elecProduct);
		 * firstOrder.addProduct(beautyProduct);
		 * 
		 * // now define second order and add few products in it Order secondOrder = new
		 * Order(); secondOrder.setId(1001); secondOrder.setPurchaseDate(new Date());
		 * 
		 * secondOrder.addProduct(babyProduct); secondOrder.addProduct(elecProduct);
		 * secondOrder.addProduct(eleProduct);
		 * 
		 * service.addOrder(firstOrder); service.addOrder(secondOrder);
		 */

	}

}
