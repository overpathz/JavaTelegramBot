package tgbot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class Main {
     public static void main(String[] args) {
         try {
             TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
         } catch (TelegramApiException e) {
             e.printStackTrace();
         }
     }
 }