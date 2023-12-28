import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i =0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("1"))
                deque.addFirst(Integer.parseInt(st.nextToken()));
            else if (command.equals("2"))
                deque.addLast(Integer.parseInt(st.nextToken()));
            else if (command.equals("3")){
                if(deque.isEmpty())
                    sb.append(-1).append("\n");
                else
                    sb.append(deque.pollFirst()).append("\n");
            }
            else if (command.equals("4")){
                if(deque.isEmpty())
                    sb.append(-1).append("\n");
                else
                    sb.append(deque.pollLast()).append("\n");
            }
            else if (command.equals("5"))
                sb.append(deque.size()).append("\n");
            else if (command.equals("6")){
                if(deque.isEmpty())
                    sb.append(1).append("\n");
                else
                    sb.append(0).append("\n");
            }
            else if(command.equals("7")){
                if(deque.isEmpty())
                    sb.append(-1).append("\n");
                else
                    sb.append(deque.peekFirst()).append("\n");
            }
            else if(command.equals("8")){
                if(deque.isEmpty())
                    sb.append(-1).append("\n");
                else
                    sb.append(deque.peekLast()).append("\n");
            }
        }
        System.out.print(sb);
    }
}