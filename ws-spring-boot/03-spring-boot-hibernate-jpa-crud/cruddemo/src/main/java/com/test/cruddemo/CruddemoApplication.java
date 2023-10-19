package com.test.cruddemo;

import com.test.cruddemo.dao.StudentDAO;
import com.test.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
			//createStudent(studentDAO);
			createMultipleStudents(studentDAO);
			//readStudent(studentDAO);
			//listStudents(studentDAO);
			//listByLastName(studentDAO);
			//updateStudent(studentDAO);
			//deleteStudent(studentDAO);
			//deleteAll(studentDAO);

		};
	}

	private void deleteAll(StudentDAO studentDAO) {
		System.out.println(studentDAO.deleteAll());
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 4;
		studentDAO.delete(studentId);
		System.out.println("deleted");
	}

	private void updateStudent(StudentDAO studentDAO) {
		int studentId = 2;
		Student myStudent = studentDAO.findById(studentId);
		myStudent.setLastName("Massuh");
		studentDAO.update(myStudent);
		System.out.println(myStudent);
	}

	private void listByLastName(StudentDAO studentDAO) {
		List<Student> list = studentDAO.findByLastName("Ferrea");
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}

	}

	private void listStudents(StudentDAO studentDAO) {
		List<Student> list = studentDAO.findAll();
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}

	private void readStudent(StudentDAO studentDAO) {

		System.out.println(studentDAO.findById(1).toString());
	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		Student tempStudent1 = new Student("Bia", "Ferreira", "bia@gmail.com");
		Student tempStudent2 = new Student("Luci", "Ferreira", "luci@gmail.com");
		Student tempStudent3 = new Student("Dornas", "Ferreira", "dornas@gmail.com");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
		System.out.println(tempStudent1.getId());
		System.out.println(tempStudent2.getId());
		System.out.println(tempStudent3.getId());

	}

	private void createStudent(StudentDAO studentDAO) {

		// criar o objeto do estudante
		Student tempStudent = new Student("Mat", "Ferreira", "mat@gmail.com");

		//salvar o estudante
		studentDAO.save(tempStudent);

		//mostrar o id do estudante criado

		System.out.println(tempStudent.getId());

	}

}
