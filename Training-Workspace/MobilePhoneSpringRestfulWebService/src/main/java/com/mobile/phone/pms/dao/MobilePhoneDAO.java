package com.mobile.phone.pms.dao;

import com.mobile.phone.pms.model.MobilePhone;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface MobilePhoneDAO extends CrudRepository<MobilePhone, Integer> {
  public List<MobilePhone> findByModelName(String modelName);

  public List<MobilePhone> findByBrandName(String brandName);

  public List<MobilePhone> findByMobileId(int mobileId);

  public List<MobilePhone> findByMobilePhoneCostGreaterThan(
    double mobilePhoneCost
  );

  public List<MobilePhone> findByProcessor(String processor);

  public List<MobilePhone> findByColor(String color);
}
