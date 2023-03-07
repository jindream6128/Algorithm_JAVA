# 케이스 1) 중복 순열 -> n중 반복문을 구현하기 위함(n자리 m진수 출력)
```python
n, m = map(int, input().split())
arr = [ 0 for i in range(n)]

def recur(cur):
    if cur == n:
        print(*arr)
        return
    
    for i in range(m):
        arr[cur]=i
        recur(cur+1)
```

```java
import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m;
    static int[] arr;
    
    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        
        recur(0);
        br.close();
        bw.close();
    }
    
    static void recur(int cur) throws IOExceoption{
        if(cur == n){
            bw.write(Arrays.toString(arr) + "\n");
            return;
        }
        
        for(int i =0; i<m; i++){
            arr[cur] = i;
            recur(cur +1);
        }
    }
}

```
------------
# 케이스 2) 순열 -> N자리 M진수 케이스 내에 중복 제외

```python
n,m = map(int,input().split())
arr = [0 for i in range(n)]
visited = [False for i in range(m)]

def recur(cur):
    if cur == n:
        print(*arr)
        return
    
    for i in range(m):
        if visited[i]:
            continue
        
        arr[cur] = i
        visited[i] = True
        recur(cur+1)
        visited[i] = False
```

```java
import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        visited = new boolean[m];

        recur(0);
        bw.close();
        br.close();
    }

    static void recur(int cur) throws IOException {
        if (cur == n) {
            bw.write(Arrays.toString(arr) + "\n");
            return;
        }

        for (int i = 0; i < m; i++) {
            if (visited[i]) {
                continue;
            }

            arr[cur] = i;
            visited[i] = true;
            recur(cur + 1);
            visited[i] = false;

        }

    }

}
```

# 케이스 3) 조합 N자리 M진수 - 중복 케이스 제외
```python
n,m = map(int, input().split())

arr = [0 for i in range(n)]

def recur(cur,start):
    if cur == n:
        print(*arr)
        return
    
    for i in range(start,m):
        arr[cur] = i
        recur(cur+1,i+1)
        
recur(0,0)
```
```java
import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m;
    static int[] arr;
    
    public static void main(string[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        n= Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        
        recur(0,0);
        
        br.close();
        bw.close();
    }
    
    static void recur(int cur, int start) throws IOException{
        if(cur == n){
            bw.write(Arrays.toString(arr) + "\n");
            return;
        }
        
        for(int i =start; i<m; i++){
            arr[cur] = i;
            recur(cur + 1, i+1);
        }
    }
    
}
```