public class testques {
    public static String ResultGet (String s)
    {
        String output = "";

        for(int i = 0 ; i < s.length(); i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                int num = 0;

                num = Character.getNumericValue(s.charAt(i));
                for(int j = 0; j < num ; j++ )
                {
                    output = output+"1";
                    

                }
            }   
            else
            {
                output = output + s.charAt(i);

            }
        }
        return output;
    }
    public static void main(String[] args) {
        //For s = "abc5bc3", the output should be solution(s) = "abc11111bc111".

        String s = "abc5bc3";
        String output = ResultGet(s);
        
        System.out.println(output);


    }
    
}
