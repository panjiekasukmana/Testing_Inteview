Feature: GET posts
 
Scenario: Get posts with valid data
 * url 'https://jsonplaceholder.typicode.com/posts'
 * method GET
 * status 200
 * match each response == {'id': '#number', 'title': '#string', 'body': '#string', 'userId':'#notnull'}