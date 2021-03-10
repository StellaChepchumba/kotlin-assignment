fun main(){
   name()
sentence("stella",24)
shoes()
    names()
}
fun name(){
    var name="AkiraChix"
    println(name[0])
    println(name[2])
    println(name[3])
}
fun sentence(name:String,age:Int){
    val sentence=("Hi,my name is $name, and iam $age years old")
println(sentence)

}
fun shoes(){
    var x="tight"
    println(x.length)
}
fun names(){
    val names="Amanda"
    if (names=="stella"){
        println("That's me")}else{
        println("I don't know who that is")
    }

}