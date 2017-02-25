package com.salesmanager.core.business.system.optin.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CustomerOptin.class)
public abstract class CustomerOptin_ {

	public static volatile SingularAttribute<CustomerOptin, Long> id;
	public static volatile SingularAttribute<CustomerOptin, String> lastName;
	public static volatile SingularAttribute<CustomerOptin, String> email;
	public static volatile SingularAttribute<CustomerOptin, String> value;
	public static volatile SingularAttribute<CustomerOptin, Date> optinDate;
	public static volatile SingularAttribute<CustomerOptin, Optin> optin;
	public static volatile SingularAttribute<CustomerOptin, String> firstName;

}

