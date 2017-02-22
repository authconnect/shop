package com.salesmanager.core.business.system.optin.model;

import com.salesmanager.core.business.merchant.model.MerchantStore;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Optin.class)
public abstract class Optin_ {

	public static volatile SingularAttribute<Optin, Long> id;
	public static volatile SingularAttribute<Optin, Date> startDate;
	public static volatile SingularAttribute<Optin, MerchantStore> merchant;
	public static volatile SingularAttribute<Optin, String> description;
	public static volatile SingularAttribute<Optin, Date> endDate;
	public static volatile SingularAttribute<Optin, String> code;

}

