import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt() ; //정점의 수
        int M = scanner.nextInt(); //간선의 수
        int R = scanner.nextInt(); //시작 정점
        
        
        ArrayList<Integer>[] arr = new ArrayList[N+1];
        
        for(int i=1; i<=N; i++) {
        	arr[i] = new ArrayList<>();
        }
        
        while (M-- >0) {
            int u = scanner.nextInt();
            int w = scanner.nextInt();
            arr[u].add(w);
            arr[w].add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(arr[i]);
        }

        int[] check = new int[N+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(R);
        int depth = 1;
        check[R] = depth;
        while(!q.isEmpty()) {
            int x = q.poll();
            for (int i = 0; i < arr[x].size(); i++) {
                int h = arr[x].get(i);
                if (check[h] == 0) {
                    depth += 1;
                    check[h] = depth;
                    q.add(h);
                }
            }
        }

        for (int i = 1; i < check.length; i++) {
            System.out.println(check[i]);
        }
    }
}