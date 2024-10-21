<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS
Welcome to Java Frameworks! This is an opportunity for students to implement user interfaces and learn to leverage existing frameworks, assets, and content for object-oriented programming.
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## Student ID
Student ID: 001487879
## Name
Name: Eddie Gehrmann

# Task C:
C. Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

filename: mainscreen.html
lines 14-159 modified css to style the main screen.

line 161 change the title to Glorious Tapes & Seals

line 166 changed the h1 to The Glorious Tapes & Seals Shop

line 168 header to parts changed to Thread Sealants

line 200 header to products changed to Thread Sealant Cases

line 238-240 added footer with company name and copyright

# Task D:
D. Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

filename: mainscreen.html
line 168 added button to link to the about page

filename: about.html
lines 1-195 added about page with company information and history

filename: MainScreenController.java
lines 56-57 added method to navigate to the about page

# Task E:
E. Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

filename: BootStrapData.java
lines 27-40 inserted repository for inhouse parts

lines 44-138 inserted new parts

lines 141-151 inserted new products

# Task F:
F. Add a “Buy Now” button to your product list. 

filename: mainscreen.html
line 233 added the new button

Created new file: BuyProductController.java
lines 1-44 coded created buy product method

created new file: confirmbuysuccess.html
lines 1-13 created new page for successful purchase

created new file: confirmbuyfailure.html
line 1-13 created new page for failed purchase