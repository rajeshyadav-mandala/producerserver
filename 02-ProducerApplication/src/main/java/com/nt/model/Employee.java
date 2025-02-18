package com.nt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="microservice_tab")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {

	@Id
	@SequenceGenerator(name="seq1", sequenceName ="seq2", initialValue=1, allocationSize =1)
	@GeneratedValue(generator="seq1", strategy=GenerationType.SEQUENCE)
	private Integer empEno;
	@NonNull
	private String empEname;
	@NonNull
	private String empEdept;
}
