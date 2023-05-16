# GLOSSAIRE

> * ### Spring Boot :
> Tool that accelerates and simplifies the development of Web applications and microservices with Spring
> Framework

> * ### [Sprint Initialzr](https://start.spring.io/) :
> Initializr generates spring boot project with just what you need to
> start quickly!

> * ### Microservice architecture (MSA) :
> Divide the application into several small services that work independently
>
> Each microservice has its own environment (database, server, etc).
>
> Low coupling between components
>
> Communicates with each other via HTTP/HTTPS requests
>
> MSA services are smaller than SOA services

> * ### JSP / JAR:
> Java Server Pages, templates for views / Java Archive, these are files

> ### Architecture files :
> * pom.xml : defines a dependency to the starter that will add to our microservice all the basic dependencies needed to
    start quickly

> ### Annotations :
> * <span style="color:blue">@Configuration :</span> gives the current class the possibility to define configurations
    that will replace the traditional
    XML files. These configurations are done via Beans.
> * <span style="color:blue">@EnableAutoConfiguration :</span> the annotation seen previously which allows, at Spring
    startup, to automatically generate
    the necessary configurations according to the dependencies located in our classpath.
> * <span style="color:blue">@ComponentScan : </span>indicates that you have to scan the classes of this package to find
    configuration Beans.
> * <span style="color:blue">@RestController : </span>simply the combination of the two previous annotations. Once
    added, it indicates that this class
    will be able to process the requests we will define. It also indicates that each method will return the JSON
    response directly to the user, so no view in the circuit.
> * <span style="color:blue">@RequestMapping : </span>
> 1. value which is used to define the URL on which the method can be reached.
> 2. And method which defines the HTTP verb to query the URL.
> * <span style="color:blue">@GetMapping, @PostMapping, @PutMapping, @DeleteMapping  : </span>
    > allow to specify only the URL, while using the HTTP bound verb, present just before the mapping.
> * <span style="color:blue">@PathVariable : </span> annotation would be an endpoint that identifies an entity with a
    primary key:
> * <span style="color:blue">@Repository : </span> applied to the class to indicate to Spring that it is a class that
    manages data
> * <span style="color:blue">@RequestBody : </span> asks Spring to convert the JSON contained in the body part of the
    HTTP request into a Java object
> * <span style="color:blue">@Override : </span> indicates that the child class method is over-writing its base class
    method.