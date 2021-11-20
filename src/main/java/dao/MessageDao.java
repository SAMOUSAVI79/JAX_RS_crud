package dao;

import model.MessageModel;

import java.util.HashMap;
import java.util.Map;

public class MessageDao {
    private static Map<Long, MessageModel> messages = new HashMap<>();

    public static Map<Long, MessageModel> getMessages(){
        return messages;
    }

}
