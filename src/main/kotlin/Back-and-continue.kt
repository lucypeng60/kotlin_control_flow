fun main() {
    loop@ for(i in1..10) {
        println("Outside Loop")
        
        for(j in1..10) {
            println("Inside Loop")
            if(j >5)break@loop8.
        }
    }
}