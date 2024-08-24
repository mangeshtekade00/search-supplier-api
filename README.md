# Makersharks Supplier Search API

This project is a proof of concept (POC) for a search API that allows buyers to search for manufacturers based on customized requirements such as location, nature of business, and manufacturing processes.




## Project Overview

The Makersharks Supplier Search API allows users to search for suppliers (manufacturers) based on specific criteria such as location, nature of business, and manufacturing processes. This API returns a list of suppliers that match the search criteria, including their details.

## Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- MySQL Database (In-memory for development)
- Maven

## Prerequisites

Before you begin, ensure you have the following installed on your local machine:

- [Java Development Kit (JDK) 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Maven 3.6+](https://maven.apache.org/download.cgi)
- [Git](https://git-scm.com/downloads)

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/mangeshtekade00/search-supplier-api
 cd makersharks_db-supplier-search-api


####  Run the Application

mvn spring-boot:run



#### Test the API
 Test the API using Postman or any other API testing tool. Below is an example of a POST request to search for suppliers:

URL: http://localhost:8080/api/supplier/query
Method: POST
Headers: Content-Type: application/json
Body:


####  API Endpoints
POST /api/supplier/query: Search for suppliers based on location, nature of business, and manufacturing processes.

####  Security Considerations

For this POC, basic input validation is implemented. However, for production, consider adding the following:

Authentication and Authorization (e.g., JWT, OAuth)
Input sanitization to prevent SQL injection
Exception handling for robust error management


#### Future Enhancements

I will implement comprehensive security measures.
I will expand the search criteria to include more parameters.
I will add more advanced filtering and sorting options.
Implement caching for frequently accessed data.
Use a production-ready database such as MySQL or PostgreSQL.
Deploy the API to a cloud platform (e.g., AWS, Azure).



##############  Submission ####################



######### Thank you  ############
