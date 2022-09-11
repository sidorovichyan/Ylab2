public class Main {

    public static void findNumbers(int [] mas, int value)
    {
        for(int i=0;i<mas.length;i++)
        {
            for(int j=1;j<mas.length;j++)
            {
                if(mas[i]+mas[j] == value)
                {
                    System.out.println(mas[i]+"+"+ mas[j]+"="+value);
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] mass = {1,2,3,4,5,66,2,3,4,5,2,3};
        findNumbers(mass,5);

    }
}
