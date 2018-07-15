package gujc.directtalk9.model;

import java.util.HashMap;
import java.util.Map;

public class ChatModel {
    public Map<String, String> users = new HashMap<>() ;
    public Map<String, String> messages = new HashMap<>() ;

    public static class Message {
        public String uid;
        public String msg;
        public Object timestamp;
        public Map<String, Object> readUsers = new HashMap<>();
    }
}