
public class loop8 {
public static void main(String[] args) {    
            int n1=0, n2=1,n3;
            int n=9;
            for (int i=1;i<=n;i++)
            {
            	n3=n1+n2;
            	System.out.println(n3);
            	n1=n2;
            	n2=n3;
            }
}

}
