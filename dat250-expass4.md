## Technical problems
I first got the problems "cannot use Customer.getName()" because customer is null
That was because I forgot to create instances of the objects

I also had a issue with one of the assertEqual statements. Where it compared my Collection with a Set.
It worked when i changed The Collection to a Set.

<img width="866" alt="image" src="https://github.com/user-attachments/assets/7dde5b14-db62-4a7d-8e8c-dba5174fdf4c">

## The tables being created
<img width="322" alt="image" src="https://github.com/user-attachments/assets/36b4f4bb-476c-45af-b0ce-b0095de1311b">
<img width="319" alt="image" src="https://github.com/user-attachments/assets/ce7a0e74-7d08-4ac2-8e1f-8610929d9f47">
<img width="305" alt="image" src="https://github.com/user-attachments/assets/9e647cba-36b1-413b-8a8c-1551bda9b30b">
<img width="320" alt="image" src="https://github.com/user-attachments/assets/80b4b935-0515-4a7e-8d56-77f309e87cd5">

I used the <property name="hibernate.show_sql" value="true"/> tag. To see the sql statements executed in the background.

The database being used is H2. Which is a lightweight SQL database that run in memory and store data in files
<property name="hibernate.dialect" value="org.hibernate.dialect.H2Dialect"/>
<property name="hibernate.connection.driver_class" value="org.h2.Driver"/>









