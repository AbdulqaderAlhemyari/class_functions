fun main() {
    val standard = StandardLibraryFunctions()
    val infix = Infix()
    val member = MemberFun()
    val userDefined = UserDefined()


    standard.applyFun()
    standard.letFun()
    standard.runFun()
    standard.withFun()
    standard.takeIfFun()
    standard.alsoFun()


    infix.applyStandardInfix()
    infix.infixFun()

    member.inLine("abdulqader", ::print)
    member.lambda()
    member.local()


    userDefined.anonymousFun()
    userDefined.anonymousInfFun()
    userDefined.userDefine("user define function")
    println(userDefined.userDefine1())


}