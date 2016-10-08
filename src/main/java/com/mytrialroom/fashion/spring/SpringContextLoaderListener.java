package com.mytrialroom.fashion.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by amarchattiwar on 10/8/16.
 */
public class SpringContextLoaderListener implements ServletContextListener
{
    private Logger logger = LoggerFactory.getLogger(SpringContextLoaderListener.class);
    private final AnnotationConfigWebApplicationContext context;

    public SpringContextLoaderListener(AnnotationConfigWebApplicationContext context) {
        super();
        this.context = context;
    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        logger.info("Initializing context..................................");
        servletContextEvent.getServletContext().setAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE, context);
        context.setServletContext(servletContextEvent.getServletContext());
        logger.info("Context initialized.....................................");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
