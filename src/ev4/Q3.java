package ev4;

public class Q3 {
    public static void main(String[] args) {
        /*
           Types of relationship among tables in database -->

           1. One to One Relationship (1:1): It is used to create a relationship between
                two tables in which a single row of the first table can only be related to one and
                only one records of a second table. Similarly, the row of a second table can also be
                related to anyone row of the first table.

                example--
                                CUSTOMER                     ORDER
                                1. ajay                      order1
                                2. sham                      order2
                                3. vinay <-----------------> order3
                                4. raju                      order4


            2. One-to-Many Relationship: It is used to create a relationship between two tables.
                 Any single rows of the first table can be related to one or more rows of the second tables,
                 but the rows of second tables can only relate to the only row in the first table.
                 It is also known as a many-to-one relationship.

                  example--
                                PERSON                       GAME
                                1. ajay                      cricket
                                2. sham                      volleyball
                                3. vinay <-----------------> hockey,cricket
                                4. raju                      boxing


                                Vinay play hockey and cricket both this is the example of 1-to-many relationship.



            3. Many-to-Many Relationship: It is many-to-many relationships that create a relationship between two tables.
                 Each record of the first table can relate to any records (or no records) in the second table. Similarly,
                 each record of the second table can also relate to more than one record of the first table. It is also
                 represented an N:N relationship.


                 example--
                            there are many people involved in each project, and every person can involve more than one project.
         */
    }
}
