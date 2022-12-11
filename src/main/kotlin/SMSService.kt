class SMSService : MessageService() {
    override fun sendMessage(sender: String, receiver: String, message: String) {
        super.sendMessage(sender, receiver, message)
    }

    fun sendMessage (sender: Long, receiver: Long, message: String){
        if (sender.toString().length == 11 && sender.toString().length == 11){
            println("Отправили \"$message\" от $sender к $receiver")
        }
    }
}