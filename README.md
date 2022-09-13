Object-relational mapping (ORM) is a mechanism that makes it possible to address, <br />
access and manipulate objects without having to consider how those objects relate to their data sources.

This is (basic) ORM implementaion using Java Refleflection API.<br />
On startup it will create table with fields specified in model (models.User.java). <br />
Application allows to save, update and find users in database using Java class methods <br />
(SQL queries will be generated automatically).<br />
<br />
Testing of application is in app.Program.java <br />
