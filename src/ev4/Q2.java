package ev4;

public class Q2 {
    public static void main(String[] args) {
        /*
        Enter password: ****
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 23
Server version: 8.0.30 MySQL Community Server - GPL

Copyright (c) 2000, 2022, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use sb101
Database changed
mysql> show tables;
+-----------------+
| Tables_in_sb101 |
+-----------------+
| borrow          |
| branch          |
| customer        |
| department      |
| deposite        |
| employee        |
| grade           |
| programmer      |
+-----------------+
8 rows in set (0.11 sec)

mysql> drop department
    -> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'department' at line 1
mysql> drop  table department;
ERROR 3730 (HY000): Cannot drop table 'department' referenced by a foreign key constraint 'employee_ibfk_1' on table 'employee'.
mysql> drop  table department,employee;
Query OK, 0 rows affected (0.15 sec)

mysql> show tables;
+-----------------+
| Tables_in_sb101 |
+-----------------+
| borrow          |
| branch          |
| customer        |
| deposit        |
| grade           |
| programmer      |
+-----------------+
6 rows in set (0.00 sec)

mysql> create table department(did int primary key, dname varchar(20) not null, location varchar(20) not null);
Query OK, 0 rows affected (0.04 sec)

mysql> create table employee(empid int primary key, ename varchar(20) not null, address varchar not null, mobile varchar not null,  salary int not null, dptid int);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'not null, mobile varchar not null,  salary int not null, dptid int)' at line 1
mysql> create table employee(empid int primary key, ename varchar(20) not null, address varchar(20) not null, mobile varchar(20) not null,  salary int not null, dptid int);
Query OK, 0 rows affected (0.02 sec)

mysql> desc employee,department;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ',department' at line 1
mysql> desc employee;
+---------+-------------+------+-----+---------+-------+
| Field   | Type        | Null | Key | Default | Extra |
+---------+-------------+------+-----+---------+-------+
| empid   | int         | NO   | PRI | NULL    |       |
| ename   | varchar(20) | NO   |     | NULL    |       |
| address | varchar(20) | NO   |     | NULL    |       |
| mobile  | varchar(20) | NO   |     | NULL    |       |
| salary  | int         | NO   |     | NULL    |       |
| dptid   | int         | YES  |     | NULL    |       |
+---------+-------------+------+-----+---------+-------+
6 rows in set (0.01 sec)

mysql> desc department
    -> ;
+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| did      | int         | NO   | PRI | NULL    |       |
| dname    | varchar(20) | NO   |     | NULL    |       |
| location | varchar(20) | NO   |     | NULL    |       |
+----------+-------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> select * from department;
+-----+-----------+----------+
| did | dname     | location |
+-----+-----------+----------+
|   1 | HR        | delhi    |
|   2 | Sales     | Mumbai   |
|   3 | Account   | haryana  |
|   4 | Marketing | punjab   |
+-----+-----------+----------+
4 rows in set (0.06 sec)

mysql> select * from emplyee
    -> ;
ERROR 1146 (42S02): Table 'sb101.emplyee' doesn't exist
mysql> select * from employee;
+-------+-------+-----------+------------+--------+-------+
| empid | ename | address   | mobile     | salary | dptid |
+-------+-------+-----------+------------+--------+-------+
|     1 | ajay  | abcstreet | 1234567890 |   3000 |     2 |
|     2 | vijay | absteert  | 1234567890 |   4000 |     2 |
|     3 | rahul | abcstreet | 1234567890 |   3000 |     2 |
+-------+-------+-----------+------------+--------+-------+
3 rows in set (0.00 sec)

mysql> insert into employee values(4,"raju","abcstreet","1234568909",6000,1);
Query OK, 1 row affected (0.00 sec)

mysql> insert into employee values(5,"savi","abcstreet","1234568909",8000,1);
Query OK, 1 row affected (0.00 sec)

mysql> insert into employee values(6,"vinay","abcstreet","1234568909",10000,3);
Query OK, 1 row affected (0.00 sec)

mysql> insert into employee values(7,"sakshi","abcstreet","1234568909",14000,3);
Query OK, 1 row affected (0.00 sec)

mysql> insert into employee values(7,"anku","abcstreet","1234568909",1000,4);
ERROR 1062 (23000): Duplicate entry '7' for key 'employee.PRIMARY'
mysql> insert into employee values(8,"anku","abcstreet","1234568909",1000,4);
Query OK, 1 row affected (0.01 sec)

mysql> insert into employee values(9,"pinku","abcstreet","1234568909",5000,4);
Query OK, 1 row affected (0.01 sec)

mysql> select * from employee;
+-------+--------+-----------+------------+--------+-------+
| empid | ename  | address   | mobile     | salary | dptid |
+-------+--------+-----------+------------+--------+-------+
|     1 | ajay   | abcstreet | 1234567890 |   3000 |     2 |
|     2 | vijay  | absteert  | 1234567890 |   4000 |     2 |
|     3 | rahul  | abcstreet | 1234567890 |   3000 |     2 |
|     4 | raju   | abcstreet | 1234568909 |   6000 |     1 |
|     5 | savi   | abcstreet | 1234568909 |   8000 |     1 |
|     6 | vinay  | abcstreet | 1234568909 |  10000 |     3 |
|     7 | sakshi | abcstreet | 1234568909 |  14000 |     3 |
|     8 | anku   | abcstreet | 1234568909 |   1000 |     4 |
|     9 | pinku  | abcstreet | 1234568909 |   5000 |     4 |
+-------+--------+-----------+------------+--------+-------+
9 rows in set (0.00 sec)

mysql> select sum(salary) from employee;
+-------------+
| sum(salary) |
+-------------+
|       54000 |
+-------------+
1 row in set (0.08 sec)

mysql> select sum(salary) from employee order by dptid;
+-------------+
| sum(salary) |
+-------------+
|       54000 |
+-------------+
1 row in set (0.00 sec)

mysql> select sum(salary) from employee group by dptid;
+-------------+
| sum(salary) |
+-------------+
|       10000 |
|       14000 |
|       24000 |
|        6000 |
+-------------+
4 rows in set (0.02 sec)

mysql> select dptid, sum(salary) from employee group by dptid;
+-------+-------------+
| dptid | sum(salary) |
+-------+-------------+
|     2 |       10000 |
|     1 |       14000 |
|     3 |       24000 |
|     4 |        6000 |
+-------+-------------+
4 rows in set (0.00 sec)

mysql> select * from employee inner join department on employee.dptid = department.did where department.dname = "Sales";
+-------+-------+-----------+------------+--------+-------+-----+-------+----------+
| empid | ename | address   | mobile     | salary | dptid | did | dname | location |
+-------+-------+-----------+------------+--------+-------+-----+-------+----------+
|     1 | ajay  | abcstreet | 1234567890 |   3000 |     2 |   2 | Sales | Mumbai   |
|     2 | vijay | absteert  | 1234567890 |   4000 |     2 |   2 | Sales | Mumbai   |
|     3 | rahul | abcstreet | 1234567890 |   3000 |     2 |   2 | Sales | Mumbai   |
+-------+-------+-----------+------------+--------+-------+-----+-------+----------+
3 rows in set (0.04 sec)

mysql> select * from department inner join employee on employee.dptid = department.did where employee.empid = 2;
+-----+-------+----------+-------+-------+----------+------------+--------+-------+
| did | dname | location | empid | ename | address  | mobile     | salary | dptid |
+-----+-------+----------+-------+-------+----------+------------+--------+-------+
|   2 | Sales | Mumbai   |     2 | vijay | absteert | 1234567890 |   4000 |     2 |
+-----+-------+----------+-------+-------+----------+------------+--------+-------+
1 row in set (0.01 sec)

mysql> select did,dname,location from department inner join employee on employee.dptid = department.did where employee.empid = 2;
+-----+-------+----------+
| did | dname | location |
+-----+-------+----------+
|   2 | Sales | Mumbai   |
+-----+-------+----------+
1 row in set (0.00 sec)

mysql> select ename,did,dname,location from department inner join employee on employee.dptid = department.did where employee.empid = 2;
+-------+-----+-------+----------+
| ename | did | dname | location |
+-------+-----+-------+----------+
| vijay |   2 | Sales | Mumbai   |
+-------+-----+-------+----------+
1 row in set (0.00 sec)

mysql> select * from employee group by salary order by  salary desc limit 1,1;
+-------+-------+-----------+------------+--------+-------+
| empid | ename | address   | mobile     | salary | dptid |
+-------+-------+-----------+------------+--------+-------+
|     6 | vinay | abcstreet | 1234568909 |  10000 |     3 |
+-------+-------+-----------+------------+--------+-------+
1 row in set (0.01 sec)

mysql>
         */
    }
}
