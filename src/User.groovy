class UserDat {
    String FName
    String LName
    String Email
    int Age

    String toString(){
        "$FName $LName ($Age)"
    }

}

UserDat u1= new UserDat(FName: "Ankit", LName: "Singh" , Email: "aj.ankitsingh@gmail.com", Age:45)
UserDat u2= new UserDat(FName: "Ankur", LName: "Singh" , Email: "aj.ankitsingh@gmail.com", Age:71)
UserDat u3= new UserDat(FName: "Amit", LName: "Singh" , Email: "aj.ankitsingh@gmail.com", Age:70)
UserDat u4= new UserDat(FName: "Ashok", LName: "Singh" , Email: "aj.ankitsingh@gmail.com", Age:21)
UserDat u5= new UserDat(FName: "Anil", LName: "Singh" , Email: "aj.ankitsingh@gmail.com", Age:20)

List l= [u1,u2,u3,u4,u5]

List l1= l.findAll(){
    it.Age > 50
}
List l2= l.findAll(){
    it.Age < 50
}

/*l.each { age ->

    if(age.Age > 50)
    {
        l2.push(age)
    }
    else{
        l1.push(age)
    }
}*/


println "---Users whose age is above 50---"
l2.each {
    println it
}

println "---Users whose age is below 50---"
l1.each {
    println it
}