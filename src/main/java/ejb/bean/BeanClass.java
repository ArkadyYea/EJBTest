package ejb.bean;

import javax.ejb.Stateless;

//-A session bean class is any standard Java class that implements business logic.
// The requirements to develop a SB class are as follows: 
//  • The class must be annotated with @Stateless, @Stateful, @Singleton, or the XML equivalent in a deployment descriptor. 
//  • It must implement the methods of its interfaces, if any.
//  • The class must be defined as public, and must not be final or abstract. 
//  • The class must have a public no-arg constructor that the container will use to create instances. 
//  • The class must not define the finalize() method. 
//  • Business method names must not start with ejb, and they cannot be final or static. 
//  • The argument and return value of a remote method must be legal RMI types.

//-Services Given by the Container
// • Remote client communication: Without writing any complex code, an EJB client (another EJB, a user interface, a batch process, etc.) can invoke methods remotely via standard protocols. 
// • Dependency injection: The container can inject several resources into an EJB (JMS destinations and factories, datasources, other EJBs, environment variables, etc.) as well as any POJO thanks to CDI. 
// • State management: For stateful session beans, the container manages their state transparently. You can maintain state for a particular client, as if you were developing a desktop application. 
// • Pooling: For stateless beans and MDBs, the container creates a pool of instances that can be shared by multiple clients. Once invoked, an EJB returns to the pool to be reused instead of being destroyed. 
// • Component life cycle: The container is responsible for managing the life cycle of each component.
// • Messaging: The container allows MDBs to listen to destinations and consume messages without too much JMS plumbing. 
// • Transaction management: With declarative transaction management, an EJB can use annotations to inform the container about the transaction policy it should use. The container takes care of the commit or the rollback. 
// • Security: Class or method-level access control can be specified on EJBs to enforce user and role authorization. 
// • Concurrency support: Except for singletons, where some concurrency declaration is needed, all the other types of EJB are thread-safe by nature. You can develop high-performance applications without worrying about thread issues. 
// • Interceptors: Cross-cutting concerns can be put into interceptors, which will be invoked automatically by the container. 
// • Asynchronous method invocation: Since EJB 3.1, it’s now possible to have asynchronous calls without involving messaging.

@Stateless
public class BeanClass {

	public String testMethod() {
		return "BeanClass's testMethod()";
	}

}
