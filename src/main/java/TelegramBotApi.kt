import org.telegram.telegrambots.ApiContextInitializer
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.TelegramBotsApi
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Update
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow
import java.util.*



class TelegramBotApi
fun main () {
    ApiContextInitializer.init();
    TelegramBotsApi().registerBot(Bot());
    val bot = Bot()





}
class Bot: TelegramLongPollingBot() {
    override fun getBotUsername() = "Hiuasd_bot"

    override fun getBotToken() = ""


    override fun onUpdateReceived(update: Update) {

        var X1 = 1
        val c = Calendar.getInstance()

        val year = c.get(Calendar.YEAR)

        val minute = c.get(Calendar.MINUTE)


        var minuteTwo = minute - 1
        if (update.message.text == "/start") {

            while (X1>0) {
                if (minute == minuteTwo + 1)




                    execute(SendMessage()

                            .setChatId(update.message.chatId)
                            .setText("Фраза каждые 20 секунд"))

                Thread.sleep(20)
            }

        }





    }
}














