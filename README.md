# send-email-using-html-template
In this tutorial i will describe how to send email and the content of email is using html template

In this tutorial i will use this scenario
1. user hit entry point url and show registration page
2. input username, input email, input password and submit
3. redirect to success register page
4. send notification using email, if registration success
5. check email if notification is send


Let's Jump right in
1. this is my project structure
2. add dependency needed
3. configure thymeleaf template in application properties
4. configure mail server in application.properties
   - define mail host
   - define port(if you want using tls define 587 and if you want using ssl define using 465)
   - define you user name aka email
   - define your password, which created using App-Password in google
   - define smtp.auth ( SMTP authentication is a mechanism that allows you to log in to your SMTP server using a username and password before sending emails.)
   - define starttls.enable(STARTTLS (Transport Layer Security) for secure communication when sending emails using the SMTP protocol.)
5. create domain class inside model package(to bring data from front end to backend)
6. create template registration to send email using html
    - dont forget to include Thymeleaf XML namespace in html tag(xmlns:th="http://www.thymeleaf.org")
    - load bootstrap css and js( using content delivery network)
    - mapping domain class with input text registration template
7. Create class controller(to handle registration request)
8. create html template which include the image for sending email using html template
9. save image which want to include inside template, put in this path(/resources/static/images)
10. Create class service
  - create method to handle send email
  - create method to read images and encode using base code64
11. Create method to handle form action and send email
12. Create success_registration template, when registration already succed
13. Run the application
