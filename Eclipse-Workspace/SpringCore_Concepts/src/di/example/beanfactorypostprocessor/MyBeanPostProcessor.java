package di.example.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization of " + beanName);
		Employee employee = (Employee) bean;
		employee.setEmployeeName(employee.getEmployeeName() + " After ");
		return employee;
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization of " + beanName);
		Employee employee = (Employee) bean;
		employee.setEmployeeName(" Before " + employee.getEmployeeName());
		return employee;
	}
}
