package in.ac.famt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChatService {
	private final HistoryService historyService;

    private final ChatRoomService chatRoomService;
    
    User user =new User();
    
     
    @Autowired
    public ChatService(HistoryService historyService, ChatRoomService chatRoomService) {
        this.historyService = historyService;
        this.chatRoomService = chatRoomService;
        
    }
    
    public void chat() {
    	System.out.println("Hi");
    	user.setId(10);
    	System.out.println("user"+user);
    	historyService.store();
    	chatRoomService.start();
    }
}