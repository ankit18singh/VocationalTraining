List a =[2,3,4,23,45,12]
List b =[]

a.each{ abc ->
    if(abc >20){
        b.push(abc)
    }
}

b.each {
    println it
}