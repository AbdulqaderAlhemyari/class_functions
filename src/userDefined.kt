class UserDefined {

    var funType = ""


    fun userDefine(type: String) {
        funType = "user define function with no return value"
        println(funType)
    }

    fun userDefine1(): String {
        funType = "user define function with no return value"
        return funType
    }

    fun anonymousFun() {

        var s: () -> String = {

            funType= "anonymous function"
            funType
        }

        println("this is an  explicit type  anonymous function")
    }

    fun anonymousInfFun() {

        var s = {

            "anonymous function"
        }

        println("this is an inference type  anonymous function ")
    }
}