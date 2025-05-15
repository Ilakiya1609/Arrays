import java.util.HashMap;

public class FrequencyCiunting {
    public static void main(String[]args)
    {
        String s1="banana";
        freqCounting(s1);
    }

    private static void freqCounting(String s1) {
        HashMap<Character,Integer> hp=new HashMap<>();
        char ch[]=s1.toCharArray();
        for(int i=0;i<ch.length;i++)
        {   int count=0;
            for(int j=i;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    count++;
                }
            }
            if(!hp.containsKey(ch[i]))
            {
                hp.put(ch[i],count);
            }
        }
        System.out.println(hp);
    }
}
