package ev4;

public class Q1 {
    public static void main(String[] args) {
        /*
        Enter password: ****
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 35
Server version: 8.0.30 MySQL Community Server - GPL

Copyright (c) 2000, 2022, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use sb101;;
Database changed
ERROR:
No query specified

mysql> create table student(roll int primary key, name varchar(20) not null, address varchar(30) not null, mobile varchar(12) not null);
Query OK, 0 rows affected (0.25 sec)

mysql> create table course (cid int primary key, cname varchar(20) not null, fee int not null, duration varchar(12) not null);
Query OK, 0 rows affected (0.03 sec)

mysql> desc student;
+---------+-------------+------+-----+---------+-------+
| Field   | Type        | Null | Key | Default | Extra |
+---------+-------------+------+-----+---------+-------+
| roll    | int         | NO   | PRI | NULL    |       |
| name    | varchar(20) | NO   |     | NULL    |       |
| address | varchar(30) | NO   |     | NULL    |       |
| mobile  | varchar(12) | NO   |     | NULL    |       |
+---------+-------------+------+-----+---------+-------+
4 rows in set (0.07 sec)

mysql> desc course;
+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| cid      | int         | NO   | PRI | NULL    |       |
| cname    | varchar(20) | NO   |     | NULL    |       |
| fee      | int         | NO   |     | NULL    |       |
| duration | varchar(12) | NO   |     | NULL    |       |
+----------+-------------+------+-----+---------+-------+
4 rows in set (0.01 sec)

mysql> select * from student;
+------+--------+---------+------------+
| roll | name   | address | mobile     |
+------+--------+---------+------------+
|    1 | vemkat | abc     | 123456789  |
|    2 | amit   | abc     | 121271818  |
|    3 | raj    | abc     | 1234567890 |
|    4 | vinay  | abc     | 1234567890 |
|    5 | suresh | abc     | 1234567890 |
+------+--------+---------+------------+
5 rows in set (0.00 sec)

mysql> select * from course;
+-----+-----------+--------+----------+
| cid | cname     | fee    | duration |
+-----+-----------+--------+----------+
|   1 | java      | 100000 | 6Months  |
|   2 | Spring    | 200000 | 8Months  |
|   3 | hibernate | 280000 | 4Months  |
|   4 | react     | 300000 | 4Months  |
|   5 | angular   | 500000 | 9Months  |
+-----+-----------+--------+----------+
5 rows in set (0.00 sec)

mysql>
         */
    }
}
