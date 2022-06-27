fun main() {
    //Função de modo completo
    private fun getFullName(name:String, lastName:String):String{
        val fullName = "$name $lastName"
        return fullName
    }
    
    private fun getFullName(name:String, lastName:String):String{
        return "$name $lastName"
    }
    
    private fun getFullName(name:String, lastName:String) = "$name $lastName"
}
