
/*
Problems in this code 
1) Hard to Test: You can't easily swap EmailService for a "Mock" service during testing.
2) Rigid: adding new type of notification service is cumbersome and having to change the current notification service
3) Violation of SRP : The class is managing object lifecycles and doing its actual job.
*/

//package com.spring.learning.SpringConcepts;

//public class App 
//{
//    public static void main( String[] args )
//    {
//        NotificationService notificationService = new NotificationService();
//        String message = "Hello Customer , thanks for joining the call";
//        notificationService.notifyUser(message);
//    }
//}
//
//class EmailService{
//	public void send(String message) {
//		System.out.println("Sending Email : " + message);
//	}
//}
//
//class NotificationService{
//	private EmailService emailService = new EmailService();	
//	public void notifyUser(String message) {
//		emailService.send(message);
//	}
//}


/*
AnnotationConfigApplicationContext: This is the IoC Container. The moment this line runs, 
									Spring scans the packages, creates the Beans, performs 
									the Dependency Injection, and holds everything in memory.
									
context.getBean(...): You aren't creating the service; you are asking the "Warehouse" to give 
					  you the one it already prepared.									
*/


package com.spring.learning.SpringConcepts;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App{
	public static void main(String args[]) {
		// 1. Initialize the Spring Container using our Config class
	    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	    
	    // 2. Ask Spring for the Bean (Don't use 'new NotificationService()')
	    NotificationService service = context.getBean(NotificationService.class);
	    
	    // 3. Execution
	    service.process("Dependency injection is working!");
	    
	    // 4. Cleanup
	    context.close();
	}
}
