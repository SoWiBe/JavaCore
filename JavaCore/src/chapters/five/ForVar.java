package chapters.five;

//Части цикла for могут быть пустыми.
public class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for(; !done; ){
            System.out.println("i равно " + i);
            if(i == 10) done = true;
            i++;
        }
    }
}

