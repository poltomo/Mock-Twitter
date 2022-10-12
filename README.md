# Mock-Twitter

This is a Twitter-like REST API to support location find, user, and post functionality. Demonstrates OneToMany and ManyToOne relationships between User, Location, and Post entities with Spring Hibernate ORM.

Service Layer implements business logic for user creation and posting.

Data access layer uses JDBC to connect to postgreSQL database driver and Spring Data JPA for database queries (CRUD operations).

Implements authentication and access control with Spring Security.
