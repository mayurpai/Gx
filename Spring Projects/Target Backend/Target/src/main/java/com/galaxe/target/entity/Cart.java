package com.galaxe.target.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
//import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "Cart")
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int cartId;

//	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
//	@Cascade({ CascadeType.MERGE, CascadeType.SAVE_UPDATE })
	@JoinColumn(name = "productId")
	@OnDelete(action = OnDeleteAction.NO_ACTION)
//	@JsonIgnore
	public Product product;

//	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@ManyToOne(cascade = { CascadeType.MERGE })
//	@Cascade({ CascadeType.MERGE, CascadeType.SAVE_UPDATE })
	@JoinColumn(name = "userEmail", referencedColumnName = "userEmail")
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	@JsonIgnore
	public User user;

	public int quantity;

}
