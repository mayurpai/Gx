package com.galaxetheater.modal;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@Table(name = "theatre")
@AllArgsConstructor
@NoArgsConstructor
public class Theater {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String code;
	private String name;
	private int seatingCapacity;

//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name = "adressid" )
//	private Address address;

//	@OneToMany(targetEntity = Row.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "theatreid", referencedColumnName = "id")
//	private List<Row> row;

}
