class MemberFun {
    private var fun1 = ""


    fun lambda() {

        var fun2 = { println("this is a lambda function") }
        fun1 = fun2().toString()
        println(fun1)


    }

    inline fun inLine(str: String, myFun: (String) -> Unit) {
        myFun(str)
    }

    fun local() {
        fun1 = "this is a local function"
        fun printtype() {
            println(fun1)

        }
        printtype()
    }
}


