class StandardLibraryFunctions
{
    data class Person(var name: String, var age: Int, var phone: String)

    fun letFun() {
        Person("abdulqader", 24, "71236666").let {
            println(it)
            it.phone = "71337777"
            it.age = 25
            println(it)
        }
    }

    fun applyFun() {
        Person("ziad", 25, "773799000").apply {
            println(this)
            this.phone = "774777888"
            this.age = 22
            println(this)
        }
    }

    fun runFun() {
        Person("omar", 22, "733445990").run {
            println(this)
            this.phone = "711334455"
            this.age = 20
            println(this)
        }
    }

    fun withFun() {


        val p1 = Person("ahmed", 25, "772334466")
        with(p1) {
            println("with function is called ${this.toString()}")
            p1.phone = "01255678"
            p1.name = "ammar"
            println("with function is called ${this.toString()}")
        }
    }

    fun alsoFun() {


        Person("amjed", 25, "7128889995").also {
            println("also function is called befor : ${it.toString()}")
            it.phone = "773783000"
            it.age = 26
            println("also  function is called after: ${it.toString()}")
        }

    }

    fun takeIfFun() {


        Person("nadia", 27, "776897554").takeIf {
            it.age == 25

        }

    }
}