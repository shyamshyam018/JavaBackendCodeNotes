/*
Configuration - This is the Annotation stating that this is the map/settings for the spring 
				application
				
ComponentScan - Tells the spring container/framework to look into the specific packages for 
				Component,Service,Repository Annotations	
*/


package com.spring.learning.SpringConcepts;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.learning.SpringConcepts")
public class AppConfig {
}
