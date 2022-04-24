# Customer Service With Spring Native Support

###  Customer Service, provides APIs for customer CRUD service.

* **A. Prerequisites**
    * 1. Windows/Linux based operating system
    * 2. Java 17
    * 3. Database has been created or assuming using an in-memory database for testing purpose.


* **B. Getting Started & Run the Application**
    * 1. Clone the git repo in to your local directory from github repository

    * 2. Open the command prompt and navigate to the main project directory.

    * 3. Copy postgre.jks file located under root to under "tmp" directory on your local env. Empty file merely for local testing purpose.


* **C. Build and Run Application **

	There are two ways to build the Spring Boot native app:
	
	* Using Spring Boot Buildpacks support to generate a lightweight container containing a native executable, assuming Docker is already installed.

	```mvn clean package spring-boot:build-image -Pspring-native,build-docker-image -DskipTests```
	
	* Using the Native Build Tools to generate a native executable.

	```mvn clean package spring-boot:build-image -Pspring-native,build-native-image -DskipTests```

	
  Run the app:
	
  After a successful Buildpacks build with build-docker-image, to launch the Docker container, run the following to launch our demo app. Notice the --rm flag was added to instruct Docker to automatically clean up the container and remove the file system when the container exits.

  ```docker run --rm wenqi/customerservice:latest```
	
  If you build your native app using the Native Build Tools build-native-image, an executable file gets generated under the target directory. In our case, the file name is com.github.wenqiglantz.service.customerservice.customerserviceapplication.exe. Just launch the app by running the executable:

  ```./target/com.github.wenqiglantz.service.customerservice.customerserviceapplication```



* **D. Application Launch**
    * http://localhost:8500/swagger-ui.html
  