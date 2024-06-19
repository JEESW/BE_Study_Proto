import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {
  public static void main(String[] args) {
    Stack<Coin> coinStack = new Stack<>();

    coinStack.push(new Coin(50));
    coinStack.push(new Coin(100));
    coinStack.push(new Coin(10));
    coinStack.push(new Coin(500));

    while (!coinStack.isEmpty()) {
      Coin popCoin = coinStack.pop();
      System.out.println(popCoin.getValue());
    }

    Queue<Message> messageQueue = new LinkedList<>();
    messageQueue.offer(new Message("sendMail", "홍길동"));
    messageQueue.offer(new Message("sendSMS", "제니"));
    messageQueue.offer(new Message("sendKakaoTalk", "리사"));
    messageQueue.offer(new Message("sendWeeklyQuiz", "김승조"));

    while (!messageQueue.isEmpty()) {
      Message message = messageQueue.poll();
      switch (message.getCommand()) {
        case "sendMail":
          System.out.println(message.getTo() + "에게 메일을 보냅니다.");
          break;
        case "sendSMS":
          System.out.println(message.getTo() + "에게 SMS를 보냅니다.");
          break;
        case "sendKakaoTalk":
          System.out.println(message.getTo() + "에게 카카오톡을 보냅니다.");
          break;
        default:
          System.out.println(message.getTo() + "에게 아무거나 보냅니다.");
          break;
      }
    }
  }
}
