package edu.mum.cs.cs425.demowebapps.studentmgmt.repository;
import edu.mum.cs.cs425.demowebapps.studentmgmt.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}