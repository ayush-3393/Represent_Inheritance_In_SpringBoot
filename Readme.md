## Table Per Class

=> @Inheritance(strategy = TABLE_PER_CLASS)

=> Create separate table for each class.

=> Table for child classes will have all the attributes of parent class as well as its own attributes.

=> Every table/class will have its own entries.

=> We can no longer use identity key generation. For generating ids, the strategy that works is "SEQUENCE".
    Other strategies give error.


## Single Table

=> @Inheritance(strategy = SINGLE_TABLE)

=> Create only one table with all the attributes across all entities.

=> Has a lot of sparse columns.

=> If there is a new entity, we need to update the table which is not advisable.

=> To distinguish between different type of users,
    @DiscriminatorColumn(name = "user_type", type = INTEGER) in user class
    @DiscriminatorValue("1/2/3/..."") in child classes.


## Joined Table

=> @Inheritance(strategy = JOINED)

=> Keep common attributes in the user table and create separate tables for each child class.

=> Each child class will have a foreign key representing the type of user it is.

=> To have the user_id column in the child classes, use annotation:
    @PrimaryKeyJoinColumn(name = "user_id") in the child classes.


## Mapped Super Class

=> @MappedSuperClass, in the parent class

=> The parent class is not the entity.

=> All the child classes have their tables with columns of parent class as well.
