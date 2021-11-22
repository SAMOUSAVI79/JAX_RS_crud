package service;

import dao.MessageDao;
import model.MessageModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MessageService {

    private Map<Long, MessageModel> messages = MessageDao.getMessages();

    public MessageService(){
          messages.put(1l, new MessageModel(1, "join to playpod", "mousavi"));
          messages.put(2l, new MessageModel(2, "revoke from playpod", "asghari"));

    }


    public List<MessageModel> getAllMessage(){
//        MessageModel md1 = new MessageModel(1l, "join to playpod", "mousavi");
//        MessageModel md2 = new MessageModel(2l, "revoke from playpod", "asghari");
//        List<MessageModel> list = new ArrayList<>();
//        list.add(md1);
//        list.add(md2);
//        return list;
        return new ArrayList<MessageModel>(messages.values());
    }
    public MessageModel getMessage(long id){
        return messages.get(id);
    }
    public MessageModel addMessage(MessageModel message){
        message.setId(messages.size() + 1);
        messages.put(message.getId(), message);
        return message;

    }

    public MessageModel updateMessage(MessageModel message){
        if (message.getId() <= 0){
            return null;
        }
        messages.put(message.getId(), message);
        return message;
    }
    public MessageModel removeMessage(long id){
        return messages.remove(id);
    }
}
