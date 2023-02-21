Session 1 (3rd Feb 2023) 

Pre 

Background: There was a bubble in year 2000 after the Y2K problem. There are ups and downs in the industry. We're currently going through layoffs. 

 

To make most of bootcamp: 

Watch Lectures 

Offline Review (Revision) 

Homework 

Discuss on Discord 

Setup a schedule for above 

Make your own notes 

Invest time (at least 3h/week) 

Course 

What's a Java Backend Engineer? 

Builds Java backends 

 

Often have 3-tier architecture for Java Backends 

Front End (UI) 

Mid Tier (usually we sit here) 

DB 

 

k•nd (3. 3 
 

曰T예 
 

CDN: Content Delivery Network 

Distributed servers that deliver web content to users based on their geographic location 

Stored on multiple servers in various locations 

 

Two types of server: Origin & Edge Servers 

Origin server copy their content to Edge servers. Users interact to Edge server. 

 

Web request: 

Browser sends request to DNS server to resolve domain name of the URL to its IP 

The DNS server returns IP for closest CDN edge server to users' location 

The CDN Edge server checks its cache 

A Web page 

HTML, CSS, Images, JS assets, Fonts (Frontend Engineer will take care of this) 

 

REST Request 

JS code constructs an HTTP request 

Adds endpoint API URL and HTTP method (GET, POST, PUT, DELETE) 

Includes necessary parameters or data 

Pull necessary data from DB 

Process data and prep response 

Return response 

HTTP Request: a message sent by a client (such as a web browser) to an app 

Request line (`GET /index.html HTTP/1.1`) always the first line 

Headers: Meta info about the request 

Body: Data to be sent with the request 

Expects an HTTP response 

HTTP Response 

Status line (`HTTP/1.1 200 OK`) 

200 OK 

4XX user error 

5XX server errors 

Etc 

Headers: Meta information about the response 

Body: Actual data being sent 

 

HTTP is a stateless protocol 

Cookies allows multiple request to be "tied together" 

 

Cookies 

Sent to client in the Set-Cookie header of a response 

Sent back to the server in the cookie header of subsequent requests 

 

Server Sessions 

Login flow 

User enters login credentials into web form 

Form data is submitted using HTTP POST 

Server verifies the creds 

Server generates a new session for user 

Server creates a unique token (Session ID) 

Server sends  a response with a Set-Cookie header 

Browser stores cookie locally 

 

Cookie exchange flow 

Browser sends the cookie back to the server in Cookie header 

Server looks up session info based on the session ID 

Server generates a personalised response 

Cookies approach 

Automatic 

Browser memory 

Local and session storage 

 

What we need 

A programming language 

A server runtime 

A framework to handle common concerns 

A framework to interact with DB 

A framework to handle security 

A framework to  manage infrastructure (microservices) 

 

Source Control 

Git: version control system for tracking changes in files and coordinating work amongst multiple people 

Keep track of different versions of your code 

Collaborate with others 

Revert back to previous versions if needed 

Resolve conflicts when multiple people are working on the same codebase 

 

GitHub: web-based platform that provides hosting for Git repos 

Additional features 

Pull requests 

Issues 

Wikis 

Project management 

Discussions 

Actions 

 

Git manages versions of your code locally or on a remote servers 

GitHub potential "main" remote server 

 

Pull request workflow 

Fork the repo 

Clone the repo 

Create a new branch 

Make changes 

Push the changes 

Create a pull request 

Review and discuss 

Merge or decline 

Update and delete the branch 

Homework 

Create a new repo for bootcamp notes, add a file with session 2's notes, check changes and push to remote. Check on Github it works 

Do a Pull request of the file 

Go through Session 2 README.md 

Git 

Java 

IntelliJ Community Edition 
