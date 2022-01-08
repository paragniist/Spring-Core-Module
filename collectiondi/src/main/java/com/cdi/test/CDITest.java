package com.cdi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cdi.bean.ElectionCommision;
import com.cdi.bean.Parcel;
import com.cdi.bean.Profile;
import com.cdi.bean.Store;

public class CDITest {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/cdi/common/application-context.xml"));
		/*
		 * Parcel parcel = beanFactory.getBean("parcel",Parcel.class);
		 * System.out.println(parcel);
		 */
		//Store store = beanFactory.getBean("store",Store.class);
		//System.out.println(store);
		
		/*
		 * ElectionCommision electionCommision =
		 * beanFactory.getBean("electionCommisionMap",ElectionCommision.class);
		 * System.out.println(electionCommision);
		 */
		
	//	ElectionCommision electionCommision = beanFactory.getBean("electionCommisionMap",ElectionCommision.class);
	//	System.out.println(electionCommision);
		
		Profile profile = beanFactory.getBean("profile",Profile.class);
		System.out.println(profile);
		
		
		

	}

}
