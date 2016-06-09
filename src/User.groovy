class UserDat {
    String FName
    String LName
    String Email
    int Age

    String toString() {
        "${FName} ${LName} ($Age)"
    }
}

UserDat u1= new UserDat(FName: "Ankit", LName: "Singh" , Email: "aj.ankitsingh@gmail.com", Age:21)
UserDat u2= new UserDat(FName: "Ankur", LName: "Singh" , Email: "aj.ankitsingh@gmail.com", Age:21)
UserDat u3= new UserDat(FName: "Amit", LName: "Singh" , Email: "aj.ankitsingh@gmail.com", Age:21)
UserDat u4= new UserDat(FName: "Ashok", LName: "Singh" , Email: "aj.ankitsingh@gmail.com", Age:21)
UserDat u5= new UserDat(FName: "Anil", LName: "Singh" , Email: "aj.ankitsingh@gmail.com", Age:21)

List l= [u1,u2,u3,u4,u5]
l.each {
    println it
}