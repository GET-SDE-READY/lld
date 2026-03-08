import com.whatsapp.NotificationService;
import com.whatsapp.model.Chat;
import com.whatsapp.model.TextMessage;
import com.whatsapp.model.User;
import com.whatsapp.services.ChatService;
import com.whatsapp.services.MessagingService;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        ChatService chatService = new ChatService();

        MessagingService messagingService = new MessagingService(notificationService);

        User user1 = new User("1", "123", "Joe");
        User user2 = new User("2", "456", "Jill");
        User user3 = new User("3", "789", "Jack");

        Chat chat = chatService.createDirectChat(user1, user2);
        Chat groupChat = chatService.createGroupChat(user1, "Jcube", List.of(user1, user2, user3));

        messagingService.sendMessage(chat, new TextMessage(
                "1", chat, user1, "Hello"
        ));

        messagingService.sendMessage(groupChat, new TextMessage(
                "2", chat, user2, "Hello Guys!!!"
        ));
    }
}