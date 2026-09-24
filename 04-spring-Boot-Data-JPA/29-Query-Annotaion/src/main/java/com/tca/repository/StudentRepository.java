package com.tca.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tca.entity.Gender;
import com.tca.entity.Student;

import jakarta.transaction.Transactional;

public interface StudentRepository extends CrudRepository<Student, Integer>{
	
	//JPQL Query
	@Query("select s from Student s")
	List<Student> findAllUsingJPQL();
     
	//SQL Query
	@Query(value="select * from student ",nativeQuery =true)
	List<Student> findAllUsingSQL();
	
	
	// @Query("select s from Student s where s.per>=?1 AND s.per<= ?2")//JPQL with Positional Parameter
	@Query("select s from Student s where s.per>=:low AND s.per<=:high")//JPQL with Named Parameter
	List<Student> findPerRangeUsingJPQL(@Param("low") Double start,
			                            @Param("high")Double end);
	
//	@Query(value = "SELECT * FROM student WHERE per >= ?1 AND per <= ?2", nativeQuery = true)
	@Query(value = "SELECT * FROM student WHERE per >=:low AND per <=:high", nativeQuery = true)
	List<Student> findPerRangeUsingSQL(@Param("low") Double start,
                                       @Param("high")Double end);
                                       

	
	// Fetch Selected Columns Scaler Query
	
	@Query("select s.gender,s.name,s.per from Student s where s.per>=:per and s.gender=:gender")
	List<Object[]> findGenderNamePer(@Param("per") Double per,
			                       @Param("gender") Gender gender);
	
	
	
	//DML Using Query Annotaion
	
	@Modifying
	@Transactional
	@Query("delete from Student s where s.per>:per and s.gender=:gender")
	public void deleteByPerAndGender(@Param("per") Double per,
			                         @Param("gender") Gender gender);

	@Modifying
	@Transactional
	@Query("update Student s set s.per=:per where s.rno=:rno")
	 public Integer updatePer(@Param("per") Double per,
			                  @Param("rno") Integer rno);
	
	
	
}
