class Infix {


    infix private fun add(s: String) {}

    fun infixFun() {
        this add "this is infix function"
        add("user define infix function")
    }

    fun applyStandardInfix() {
        var a = 3
        var b = 8
        var c = 67
        var result = (a > b) and (a < c)
        println("the result os infix standard function :\n$result ")
        println(++a)
        println(--b)
        println(++c)
    }
}