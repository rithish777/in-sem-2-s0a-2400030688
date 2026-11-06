STUDENT MANAGEMENT - SPRING BOOT MAVEN PROJECT

Project settings:
- Spring Boot: 4.1.2
- Java: 17
- Maven
- MySQL for running the application
- H2 in-memory database for the repository test

OPEN IN ECLIPSE
1. Extract this ZIP file.
2. In Eclipse choose File > Import > Maven > Existing Maven Projects.
3. Browse to the extracted student-management-springboot folder.
4. Select pom.xml and click Finish.
5. Wait for Maven dependencies to download.
6. If needed, right-click the project > Maven > Update Project.
7. Run TestingapplicationApplication.java as Spring Boot App.

MYSQL SETUP
- Make sure MySQL Server is running.
- The application uses username root and an empty password by default.
- If your MySQL password is not empty, set DB_PASSWORD to your password,
  or edit spring.datasource.password in application.properties.
- The URL includes createDatabaseIfNotExist=true.

POSTMAN
POST http://localhost:8080/save?sno=101&sname=Ravi
GET  http://localhost:8080/find/101

Run tests:
- Right-click project > Run As > JUnit Test
- StudentRepositoryTest uses an in-memory H2 database.
- TestStudentService uses Mockito.

If Maven cannot resolve the Spring Boot 4.1.2 parent or dependencies,
check your internet connection and Maven repository access. The project
cannot run until Maven successfully downloads its dependencies.
