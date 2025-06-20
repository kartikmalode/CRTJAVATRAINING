public class ConvertBinary {
    public static void generateBinary(int N) {
        String[] queue = new String[2 * N];  // Make array large enough
        int front = 0, rear = 0;

        queue[rear++] = "1"; // enqueue "1"

        for (int i = 0; i < N; i++) {
            String current = queue[front++]; // dequeue
            System.out.print(current + " ");

            // enqueue current + "0" and current + "1"
            queue[rear++] = current + "0";
            queue[rear++] = current + "1";

            // prevent overflow (safety check)
            if (rear >= queue.length) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        generateBinary(n);
    }
}
