abstract class MessageService {

  open fun sendMessage(sender: String, receiver: String, message: String){

            println("Отправили \"$message\" от $sender к $receiver")

    }


}