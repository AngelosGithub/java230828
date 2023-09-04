package ch09nested.book.exercise.p07;
// 컴파일 에러의 원일 설명하기

public class Chatting {
    class Chat {
        void start() {}

        void sendMessage(String message) {}
    }

    void startChat(String chatId) {
        // nickName이 두번 정의됨
//        String nickName = null;
//        nickName = chatId;

        // 한번 정의 되도록 수정
        String nickName = chatId;

        Chat chat = new Chat() {
            @Override
            void start() {
                while (true) {
                    String inputData = "안녕하세요";
                    String message = "["+nickName+"]"+inputData;
                    sendMessage(message);
                }
            }
        };
        chat.start();
    }
}
