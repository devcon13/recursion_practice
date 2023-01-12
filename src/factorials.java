public class factorials {
    // factorial, fibonacci, chomp 3x3
    public int ans;
    public int fib = 0;
    public int fib2 = 1;
    public int fTerm;
    public int counter;
    public int[] chomp;

    public static void main(String[] args) {
        factorials f = new factorials();
        /*f.factorial(4);

        f.fTerm=6;
        f.fibonacci(f.fTerm);

        f.chomp = new int[3];
        f.chomp[0]=3;
        f.chomp[1]=3;
        f.chomp[2]=3;
        f.chompProg(f.chomp);

         */

        f.counter=0;
        System.out.println(f.fibonacci2(6)); // should be 8

    }

    public void factorial(int f){
        ans=f;
        if(f<=1){
        }
        else{
            factorial(f-1);
            ans=ans*f;
        }
        System.out.println(ans);
    }

    public void fibonacci(int term){
        if (counter>=fTerm){
        }
        else{
            counter++;
            fib2=fib2+fib;
            fib=fib2-fib;
            System.out.println(fib);
            fibonacci(fib2);
        }
    }

    public int fibonacci2(int t){
        if(t==1 || t==0){
            return t;
        }
        else {
            return fibonacci2(t-1) + fibonacci2(t-2); // i dont understand how this statement was got?
        }
    }

    public void chompProg(int[] array){
        if(chomp[2]<0){
            if(chomp[1]<0){
                if(chomp[0]==1){
                }
                else{
                    chomp[0]--;
                    chomp[1]=chomp[0];
                    chomp[2]=chomp[1];
                    chompProg(chomp);
                }
            }
            else{
                chomp[1]--;
                chomp[2]=chomp[1];
                chompProg(chomp);
            }
        }
        else{
            System.out.println(chomp[0]+""+chomp[1]+""+chomp[2]);
            chomp[2]--;
            chompProg(chomp);
        }
    }
}
