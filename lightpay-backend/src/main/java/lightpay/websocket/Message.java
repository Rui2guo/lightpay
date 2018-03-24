package lightpay.websocket;

import lombok.Data;

@Data
public class Message {

    private String messageType;

    private Object body;

}
