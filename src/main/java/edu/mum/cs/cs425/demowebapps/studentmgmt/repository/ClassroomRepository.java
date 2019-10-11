package edu.mum.cs.cs425.demowebapps.studentmgmt.repository;

import org.springframework.data.repository.CrudRepository;

import edu.mum.cs.cs425.demowebapps.studentmgmt.model.Classroom;

public interface ClassroomRepository extends CrudRepository<Classroom,Long>{

}