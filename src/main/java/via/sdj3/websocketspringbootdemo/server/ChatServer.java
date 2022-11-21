package via.sdj3.websocketspringbootdemo.server;

import org.springframework.stereotype.Component;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@Component
@ServerEndpoint("/websocket/chat")
public class ChatServer {
    // uses 4 annotations
    //@OnOpen -- called once new connection is established

    // trigger this method when a messaged is received from the client
    @OnMessage
    public String echo(String clientMessage) {
        return "From Server [" + clientMessage + "]";
    }

    //@OnClose -- called once the connection is being closed

    //@OnError --called once Exception in being thrown by any method
}
