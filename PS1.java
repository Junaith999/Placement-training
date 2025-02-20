import java.util.*;
public class PS1{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int M=sc.nextInt();
    int N=sc.nextInt();
    int count;
    int  sum=0;
    for(int i=M;i<=N;i++){
        count=0;
        for(int j=2;j<=i/2;j++){
            if(i==2){
                break;
            }
            if(i%j==0){
                count++;
            }
        }
        if(count==0){
            sum+=(i*i);
        }
    }
    System.out.println(sum);
    
}
}
