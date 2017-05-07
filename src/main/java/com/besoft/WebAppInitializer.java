package com.besoft;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		WebApplicationContext applicationContext = getContext();
		servletContext.addListener(new ContextLoaderListener(applicationContext));
		ServletRegistration.Dynamic diDynamic= servletContext.addServlet("DispatcherServlet", new DispatcherServlet(applicationContext));
		diDynamic.setLoadOnStartup(1);
		diDynamic.addMapping("*.html");
	}

	private AnnotationConfigWebApplicationContext getContext() {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(WebConfig.class);
		return context;
	}

}
