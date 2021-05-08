package tgbot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TelegramBot extends TelegramLongPollingBot {

     private static final String USERNAME = "pathz_JPGtoPDF_bot";
     private static final String TOKEN = "1829772586:AAFsMydLC_0pElKyjN7Yx8sROesf6ThShyo";

     @Override
     public String getBotUsername() {
         return USERNAME;
     }

     @Override
     public String getBotToken() {
         return TOKEN;
     }

     @Override
     public void onUpdateReceived(Update update) {
         if (update.getMessage() != null && update.getMessage().hasText()) {
             long chat_id = update.getMessage().getChatId();

             try {
                 execute(new SendMessage(String.valueOf(chat_id), "Hi " + update.getMessage().getText()));
             } catch (TelegramApiException e) {
                 e.printStackTrace();
             }





         }
     }
}
