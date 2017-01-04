/**
 * Created by Harry Kurniawan (harry@harrykrn.com | k.harry791@gmail.com)
 * on 04/01/17.
 */

package test;

public class ChatModel {
    Long   chatId;
    String chatMsg;
    String chatUser;

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public String getChatMsg() {
        return chatMsg;
    }

    public void setChatMsg(String chatMsg) {
        this.chatMsg = chatMsg;
    }

    public String getChatUser() {
        return chatUser;
    }

    public void setChatUser(String chatUser) {
        this.chatUser = chatUser;
    }
}
