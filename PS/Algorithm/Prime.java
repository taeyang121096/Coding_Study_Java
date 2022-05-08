
/* �Ҽ� �����佺�׳׽� ü */
/* 2���� �����ؼ� �ڱ� �ڽ��� ������ �ڱ� �ڽ��� ����� ���� ��� ���� üũ ���ش�. */

import java.util.*;

public class Prime {

    public void solution(int n) {
        int count = 0;
        int[] ch = new int[n+1];
        for(int i = 2;i<n+1;i++){
            if(ch[i]==0){
                count += 1;
                for(int j = i;j<n+1;j=j+i){
                    ch[j] = 1;
                }
            }
        }
        System.out.print(count);
    }

    public static void main(String[] args) {

        Prime p = new Prime();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        p.solution(n);

    }

}
