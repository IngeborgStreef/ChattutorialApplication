package nl.strafe.chattutorial.chat;

public class ChatMessage {

    private MessageType type;
    private String content;
    private String sender;

    public ChatMessage(MessageType type, String content, String sender) {
        this.type = type;
        this.content = content;
        this.sender = sender;
    }

    public ChatMessage() {
    }

    public static ChatMessageBuilder builder() {
        return new ChatMessageBuilder();
    }

    public MessageType getType() {
        return this.type;
    }

    public String getContent() {
        return this.content;
    }

    public String getSender() {
        return this.sender;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public static class ChatMessageBuilder {
        private MessageType type;
        private String content;
        private String sender;

        ChatMessageBuilder() {
        }

        public ChatMessageBuilder type(MessageType type) {
            this.type = type;
            return this;
        }

        public ChatMessageBuilder content(String content) {
            this.content = content;
            return this;
        }

        public ChatMessageBuilder sender(String sender) {
            this.sender = sender;
            return this;
        }

        public ChatMessage build() {
            return new ChatMessage(this.type, this.content, this.sender);
        }

        public String toString() {
            return "ChatMessage.ChatMessageBuilder(type=" + this.type + ", content=" + this.content + ", sender=" + this.sender + ")";
        }
    }
}
