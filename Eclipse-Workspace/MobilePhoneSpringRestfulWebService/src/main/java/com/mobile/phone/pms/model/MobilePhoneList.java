package com.mobile.phone.pms.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@Table(name = "Mobile_Phone_List")
@Component
public class MobilePhoneList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<MobilePhone> getMobilePhoneList() {
		return mobilePhoneList;
	}

	public void setMobilePhoneList(List<MobilePhone> mobilePhoneList) {
		this.mobilePhoneList = mobilePhoneList;
	}

	public MobilePhoneList(int id, List<MobilePhone> mobilePhoneList) {
		super();
		this.id = id;
		this.mobilePhoneList = mobilePhoneList;
	}

//    @Autowired
//    MobilePhone mobilePhone;

	@OneToMany
//	@JoinColumn(name = "mobileId", referencedColumnName = "mobileId")
	@JoinColumn
	private List<MobilePhone> mobilePhoneList;

}