class EmailService : MessageService() {

   override fun sendMessage(sender: String, receiver: String, message: String){
        if(sender.contains("@") && sender.contains("@")) {
            println("Отправили \"$message\" от $sender к $receiver")
        }
    }
}