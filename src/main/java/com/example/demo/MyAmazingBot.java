package com.example.demo;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.*;


@Component
public class MyAmazingBot extends TelegramLongPollingBot {
    Map<Long,Boolean> allUsers = new HashMap<>();
    Boolean f = false;
    Boolean t = true;
    String debik = "739343244";
    @Override
    public void onUpdateReceived(Update update) {
        if (allUsers.containsKey(update.getMessage().getChatId())){
            if (!allUsers.get(update.getMessage().getChatId())){
                if (update.getMessage().getText().equals("Инфо-Блог")) {
                    sendMsg(update.getMessage().getChatId().toString(), "Подпишитесь на наш инфо канал и узнайте много нового: https://t.me/joinchat/AAAAAE3sTqkNCIj-Xfe6cQ");
                } else if (update.getMessage().getText().equals("Помощь")) {
                    sendMsg(update.getMessage().getChatId().toString(), "Роман Лох");
                }  else if (update.getMessage().getText().equals("Ноотропы")) {
                    sendMsg(update.getMessage().getChatId().toString(), "Доступные ноотропы :");
                }
                else if (update.getMessage().getText().equals("Стимуляторы")) {
                    sendMsg(update.getMessage().getChatId().toString(), "Доступные стимуляторы :");
                }
                else if (update.getMessage().getText().equals("Релаксанты")) {
                    sendMsg(update.getMessage().getChatId().toString(), "Доступные релаксанты :");
                }
                else if (update.getMessage().getText().equals("Личная Консультация")) {
                    sendMsg(update.getMessage().getChatId().toString(),"Ваш консультант:\n https://t.me/brain"+"\\_"+"insane");
                } else if (update.getMessage().getText().equals("Категории")) {
                    sendMsg(update.getMessage().getChatId().toString(), "Доступные категории :");

                } else if (update.getMessage().getText().equals("Modafinil 20кап. 440грн.")) {
                    allUsers.put(update.getMessage().getChatId(),t);
                    sendMsg(update.getMessage().getChatId().toString(),"Один из самых сильных и наиболее популярных ноотропах на западе - Модафинил:\n" +
                            "https://telegra.ph/Modafinil---samyj-moshchnyj-nootrop-02-22");
                    sendMsg(update.getMessage().getChatId().toString(), "Укажите ваше имя и номер телефона и наш менеджер с вами свяжется");
                    sendMsg(debik,"Новий лох :");
                    sendMsg(debik,update.getMessage().getText());
                }

                else if (update.getMessage().getText().equals("Noopept 60кап. 290грн.")) {
                    allUsers.put(update.getMessage().getChatId(),t);
                    sendMsg(update.getMessage().getChatId().toString(), "Мощный ноотроп класа рацетамов - Ноопепт:\n" +
                            "https://telegra.ph/Noopept---odin-iz-silnejshih-nootropov---racetamov-02-23");
                    sendMsg(update.getMessage().getChatId().toString(), "Укажите ваше имя и номер телефона и наш менеджер с вами свяжется");
                    sendMsg(debik,"Новий лох :");
                    sendMsg(debik,update.getMessage().getText());
                }

                else if (update.getMessage().getText().equals("GABA 60кап. 280грн.")) {
                    allUsers.put(update.getMessage().getChatId(),t);
                    sendMsg(update.getMessage().getChatId().toString(),"Легкое раслабляющее вещество дарованое нам природой - ГАМК:\n" +
                            "https://telegra.ph/GAMK-GABA---raslablenost-i-bezmyatezhnost-02-27");
                    sendMsg(update.getMessage().getChatId().toString(), "Укажите ваше имя и номер телефона и наш менеджер с вами свяжется");
                    sendMsg(debik,"Новий лох :");
                    sendMsg(debik,update.getMessage().getText());
                }

                else if (update.getMessage().getText().equals("GINKO BILOBA 120кап. 245грн.")) {
                    allUsers.put(update.getMessage().getChatId(),t);
                    sendMsg(update.getMessage().getChatId().toString(),
                    "По ссылке можете ознакомится с отличным натуральным ноотропным средством - Гинкго Билоба:\n" +
                            "https://telegra.ph/Prirodnyj-nootrop-adaptogen-nejroprotektor-i-prosto-otlichnoe-rastenie---Ginkgo-Biloba-02-27");

                    sendMsg(update.getMessage().getChatId().toString(), "Укажите ваше имя и номер телефона и наш менеджер с вами свяжется");
                    sendMsg(debik,"Новий лох :");
                    sendMsg(debik,update.getMessage().getText());
                }

                else if (update.getMessage().getText().equals("DMAA 60кап. 280грн.")) {
                    allUsers.put(update.getMessage().getChatId(),t);
                    sendMsg(update.getMessage().getChatId().toString(), "Ядерный стимулятор - ДМАА:\n" +
                            "https://telegra.ph/DMAA---poluzapreshchyonnyj-psihostimulyator-02-27");
                    sendMsg(update.getMessage().getChatId().toString(), "Укажите ваше имя и номер телефона и наш менеджер с вами свяжется");
                    sendMsg(debik,"Новий лох :");
                    sendMsg(debik,update.getMessage().getText());
                }

                else if (update.getMessage().getText().equals("COFFEINE 100кап. 120грн.")) {
                    allUsers.put(update.getMessage().getChatId(),t);
                    sendMsg(update.getMessage().getChatId().toString(), "Один из самых популярных и, пожалуй, самых доступных стимуляторов в мире https://telegra.ph/Kofein---samyj-populyarnyj-stimulyator-v-mire-03-04");
                    sendMsg(update.getMessage().getChatId().toString(), "Укажите ваше имя и номер телефона и наш менеджер с вами свяжется");
                    sendMsg(debik,"Новий лох :");
                    sendMsg(debik,update.getMessage().getText());
                }

                else if (update.getMessage().getText().equals("L-THEANINE 60кап. 295грн.")) {
                    allUsers.put(update.getMessage().getChatId(),t);
                    sendMsg(update.getMessage().getChatId().toString(), "Поговорим добавке, получаемой из листьев зеленого чая, которая имеет очень интересные свойства! Вы можете годами пить чаи и даже не догадываться, что вам так нравится эффекты, которые оказывает именно л-тианин:\n" +
                            "https://telegra.ph/L-Theanine---spokojstvie-vnimanie-i-sosredotochennost-02-24");
                    sendMsg(update.getMessage().getChatId().toString(), "Укажите ваше имя и номер телефона и наш менеджер с вами свяжется");
                    sendMsg(debik,"Новий лох :");
                    sendMsg(debik,update.getMessage().getText());
                }

                else if (update.getMessage().getText().equals("5-htp 60кап. 350грн.")) {
                    allUsers.put(update.getMessage().getChatId(),t);
                    sendMsg(update.getMessage().getChatId().toString()," Как избавится от депресии? С помощью 5-HTP ето сделать проще простого:\n" +
                            "https://telegra.ph/5-HTP---Skazhi-depresii-NET-02-27");
                    sendMsg(update.getMessage().getChatId().toString(), "Укажите ваше имя и номер телефона и наш менеджер с вами свяжется");
                    sendMsg(debik,"Новий лох :");
                    sendMsg(debik,update.getMessage().getText());
                }

                else if (update.getMessage().getText().equals("Citicoline 60кап. 430грн.")) {
                    allUsers.put(update.getMessage().getChatId(),t);
                    sendMsg(update.getMessage().getChatId().toString(), "Отличный вариант для новичков - Цитихолин:\n" +
                            "https://telegra.ph/Citiholin---myagkij-nootrop-dlya-novichkov-02-23");
                    sendMsg(update.getMessage().getChatId().toString(), "Укажите ваше имя и номер телефона и наш менеджер с вами свяжется");
                    sendMsg(debik,"Новий лох :");
                    sendMsg(debik,update.getMessage().getText());
                }

                else if (update.getMessage().getText().equals("Главное Меню")) {
                    sendMsg(update.getMessage().getChatId().toString(), "Переход в главное меню");

                }
                else {

                    sendMsg(update.getMessage().getChatId().toString(), "Я вас не понимаю свяжитесь с вашим консультантом");


                }
            }
            else {
                sendMsg(update.getMessage().getChatId().toString(), "Спасибо за заказ, наш менеджер с вами свяжется в ближайшее время ❤");
                sendMsg(debik,update.getMessage().getText()+" iduser : "+update.getMessage().getChatId());
                allUsers.put(update.getMessage().getChatId(),f);
            }
        }
        else if(update.getMessage().getText().equals("/start")){
            allUsers.put(update.getMessage().getChatId(),f);
            sendMsg(update.getMessage().getChatId().toString(), "Привет " + update.getMessage().getFrom().getFirstName());
        }
        else  {
            allUsers.put(update.getMessage().getChatId(),f);
            sendMsg(update.getMessage().getChatId().toString(), "Привет " + update.getMessage().getFrom().getFirstName());
        }




    }

    public synchronized void sendMsg(String chatId, String s) {
        // We check if the update has a message and the message has text
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(chatId);
        sendMessage.setText(s);
        setButtons(sendMessage);
        switch (s) {
            case "Доступные категории :": {
                setButtonsforCategories(sendMessage);
                break;
            }
            case "Доступные ноотропы :": {
                setButtonsforNootrops(sendMessage);
                break;
            }
            case "Доступные стимуляторы :":{
                setButtonsforStimlators(sendMessage);
                break;
            }
            case "Доступные релаксанты :":{
                setButtonsforRelaksants(sendMessage);
                break;
            }
            case "Главное Меню" :{
                setButtons(sendMessage);
                break;
            }

        }
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            System.out.println("Pizds ------------" + e.toString());
        }
    }

    public synchronized void setButtons(SendMessage sendMessage) {
        // Создаем клавиуатуру
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);


        // Создаем список строк клавиатуры
        List<KeyboardRow> keyboard = new ArrayList<>();

        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        // Добавляем кнопки в первую строчку клавиатуры
        keyboardFirstRow.add(new KeyboardButton("Инфо-Блог"));

        // Вторая строчка клавиатуры
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        // Добавляем кнопки во вторую строчку клавиатуры
        keyboardSecondRow.add(new KeyboardButton("Категории"));

        KeyboardRow keyboardThirdRow = new KeyboardRow();
        // Добавляем кнопки во вторую строчку клавиатуры
        keyboardThirdRow.add(new KeyboardButton("Личная Консультация"));

        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardThirdRow);
        // и устанваливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
    }

    public synchronized void setButtonsforCategories(SendMessage sendMessage) {
        // Создаем клавиуатуру
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);


        // Создаем список строк клавиатуры
        List<KeyboardRow> keyboard = new ArrayList<>();

        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        // Добавляем кнопки в первую строчку клавиатуры
        keyboardFirstRow.add(new KeyboardButton("Ноотропы"));

        // Вторая строчка клавиатуры
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        // Добавляем кнопки во вторую строчку клавиатуры
        keyboardSecondRow.add(new KeyboardButton("Стимуляторы"));

        KeyboardRow keyboardThirdRow = new KeyboardRow();
        // Добавляем кнопки во вторую строчку клавиатуры
        keyboardThirdRow.add(new KeyboardButton("Релаксанты"));

        KeyboardRow keyboardBackdRow = new KeyboardRow();
        // Добавляем кнопки во вторую строчку клавиатуры
        keyboardBackdRow.add(new KeyboardButton("Главное Меню"));

        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardThirdRow);
        keyboard.add(keyboardBackdRow);
        // и устанваливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
    }

    public synchronized void setButtonsforNootrops(SendMessage sendMessage) {
        // Создаем клавиуатуру
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);


        // Создаем список строк клавиатуры
        List<KeyboardRow> keyboard = new ArrayList<>();

        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        // Добавляем кнопки в первую строчку клавиатуры
        keyboardFirstRow.add(new KeyboardButton("Modafinil 20кап. 440грн."));

        // Вторая строчка клавиатуры
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        // Добавляем кнопки во вторую строчку клавиатуры
        keyboardSecondRow.add(new KeyboardButton("Noopept 60кап. 290грн."));

        KeyboardRow keyboardThirdRow = new KeyboardRow();
        // Добавляем кнопки во вторую строчку клавиатуры
        keyboardThirdRow.add(new KeyboardButton("GABA 60кап. 280грн."));

        KeyboardRow keyboardFourthRow = new KeyboardRow();
        // Добавляем кнопки во вторую строчку клавиатуры
        keyboardFourthRow.add(new KeyboardButton("GINKO BILOBA 120кап. 245грн."));

        KeyboardRow keyboardFifthRow = new KeyboardRow();
        // Добавляем кнопки во вторую строчку клавиатуры
        keyboardFourthRow.add(new KeyboardButton("Citicoline 60кап. 430грн."));

        KeyboardRow keyboardBackdRow = new KeyboardRow();
        // Добавляем кнопки во вторую строчку клавиатуры
        keyboardBackdRow.add(new KeyboardButton("Главное Меню"));
        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardThirdRow);
        keyboard.add(keyboardFourthRow);
        keyboard.add(keyboardBackdRow);
        // и устанваливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
    }

    public synchronized void setButtonsforStimlators(SendMessage sendMessage) {
        // Создаем клавиуатуру
        ReplyKeyboardMarkup replyKeyboardMarkup1 = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup1);
        replyKeyboardMarkup1.setSelective(true);
        replyKeyboardMarkup1.setResizeKeyboard(true);
        replyKeyboardMarkup1.setOneTimeKeyboard(true);


        // Создаем список строк клавиатуры
        List<KeyboardRow> keyboard = new ArrayList<>();

        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        // Добавляем кнопки в первую строчку клавиатуры
        keyboardFirstRow.add(new KeyboardButton("Modafinil 20кап. 440грн."));

        // Вторая строчка клавиатуры
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        // Добавляем кнопки во вторую строчку клавиатуры
        keyboardSecondRow.add(new KeyboardButton("DMAA 60кап. 280грн."));

        KeyboardRow keyboardThirdRow = new KeyboardRow();
        // Добавляем кнопки во вторую строчку клавиатуры
        keyboardThirdRow.add(new KeyboardButton("COFFEINE 100кап. 120грн."));

        KeyboardRow keyboardBackdRow = new KeyboardRow();
        // Добавляем кнопки во вторую строчку клавиатуры
        keyboardBackdRow.add(new KeyboardButton("Главное Меню"));

        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardThirdRow);
        keyboard.add(keyboardBackdRow);
        // и устанваливаем этот список нашей клавиатуре
        replyKeyboardMarkup1.setKeyboard(keyboard);
    }

    public synchronized void setButtonsforRelaksants(SendMessage sendMessage) {
        // Создаем клавиуатуру
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);


        // Создаем список строк клавиатуры
        List<KeyboardRow> keyboard = new ArrayList<>();

        // Первая строчка клавиатуры
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        // Добавляем кнопки в первую строчку клавиатуры
        keyboardFirstRow.add(new KeyboardButton("GABA 60кап. 280грн."));

        // Вторая строчка клавиатуры
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        // Добавляем кнопки во вторую строчку клавиатуры
        keyboardSecondRow.add(new KeyboardButton("L-THEANINE 60кап. 295грн."));

        KeyboardRow keyboardThirdRow = new KeyboardRow();
        // Добавляем кнопки во вторую строчку клавиатуры
        keyboardThirdRow.add(new KeyboardButton("5-htp 60кап. 350грн."));

        KeyboardRow keyboardBackdRow = new KeyboardRow();
        // Добавляем кнопки во вторую строчку клавиатуры
        keyboardBackdRow.add(new KeyboardButton("Главное Меню"));

        // Добавляем все строчки клавиатуры в список
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardThirdRow);
        keyboard.add(keyboardBackdRow);
        // и устанваливаем этот список нашей клавиатуре
        replyKeyboardMarkup.setKeyboard(keyboard);
    }

    @Override
    public String getBotUsername() {
        // Return bot username
        // If bot username is @MyAmazingBot, it must return 'MyAmazingBot'
        return "brainInsane_bot";
    }

    @Override
    public String getBotToken() {
        // Return bot token from BotFather
        return "502980101:AAFne3DYjWSGIm88Ne21Iij6d1aRAZD4U2U";
    }


}
