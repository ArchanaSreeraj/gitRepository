package com.spring.example.studentrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.example.beans.InsertBean;

@Repository
public interface StudentRepository extends JpaRepository<InsertBean, Integer> {

	List<InsertBean> findByAddress(String address);
	InsertBean findBysId(Integer id);

}
