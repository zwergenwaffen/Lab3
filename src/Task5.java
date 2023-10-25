class Task5
{
    public static void main(String[] args)
    {
        int smallestNumber=100;
        int largestNumber=1;

        int i = 0;

        while(i < 10)
        {
            int randomNumber = (int)Math.floor(Math.random() * (100)+1);
            if(randomNumber>largestNumber)
            {
                largestNumber = randomNumber;
            }

            if(randomNumber<smallestNumber)
            {
                smallestNumber=randomNumber;
            }

            i++;
        }
        System.out.println("Largest number: "+largestNumber);
        System.out.println("Smallest number: "+smallestNumber);
    }
}
