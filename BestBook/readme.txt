Requirements
John has joined a new consultancy firm as a backend developer and has been asked to code a basic CRUD operation backend using SpringBoot with MySQL.

Entity Details:

The Books entity should have the following attributes:

bookId: the unique id of the book (Integer)
bookName: the name of the book (String)
author: the author of the book (String)
bookCostPrice: the price of the book (String)
Here is an example of a Book JSON object:

  {
    "bookId": 1,
    "bookName": "The Great Gatsby",
    "author": "F. Scott Fitzgerald",
    "bookCostPrice": "10.99"
  }
You are provided with the implementation of the models required for all the APIs. The task is to implement a set of REST services that exposes the endpoints and allows for adding, listing, and deleting the collection of book records in the following ways:

| API Route               | API Type | Success Response Code  | Validation Error Code  |
|-------------------------|----------|------------------------|------------------------|
| /books                  | PUT      | 200                    | 400                    |
| /books                  | GET      | 200                    | 404                    |
| /books                  | DELETE   | 200                    | 404                    |
Task 1: Service Layer Implementation in BooksService
Implement the logic in the service layer using BooksRepository

Method Details:

getAllBooks(): Retrieve all book records from the repository using the findAll() method provided by BooksRepository
saveOrUpdate(): Save a new book record or update an existing one using the save() method of BooksRepository
deleteAll(): Delete all book records from the repository using the deleteAll() method of BooksRepository
Task 2: REST API Endpoints in BooksController
PUT request to /books

Save Book to Database

HTTP Status Code:

200 - For a successful response
400- If any of the parameters are empty, For booking, add another validation that the id cannot be less than 0 and more than 1000, for any invalid entry
GET request to /books

Get All Books

Response Body: JSON object representing the details of the book

HTTP Status Code:

200 - For a successful response
404 - If no books are found
DELETE request to /books

Delete All Books

HTTP Status Code:

200 - For a successful response
404 - For an unsuccessful response
Complete the given project to pass all the test cases when running the provided unit tests.

Example Requests and Responses:

PUT request to /books:

Request Body

  {
    "bookName": "Sapiens",
    "author": "Noah Harrari",
    "bookCostPrice": "99.99"
  }
The response code is 200 and the response body, when converted to JSON, is as follows:

{
  "bookId": 6,
  "bookName": "Sapiens",
  "author": "Noah Harrari",
  "bookCostPrice": "99.99"
}
GET request to /books:

Response Body

[
  {
    "bookId": 2,
    "bookName": "1984",
    "author": "George Orwell",
    "bookCostPrice": "8.99"
  }
]
DELETE request to /books:

The response code is 200



Execution time limit
Having an issue with this question? R